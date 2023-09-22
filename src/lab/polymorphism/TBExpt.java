package lab.polymorphism;

import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky, Joshua De La Rosa
 * @version 1.3 of September 2019
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    TextLine blockLine = new TextLine("hello world");

    TextBlock block = blockLine;
    TBUtils.print(pen, block);

    Truncated truncatedBlock = new Truncated(block, 5);
    TBUtils.print(pen, truncatedBlock);

    BoxedBlock box = new BoxedBlock(block);
    TBUtils.print(pen, box);

    Truncated truncatedBox = new Truncated(box, 5);
    TBUtils.print(pen, truncatedBox);

    Centered centeredBox = new Centered(box, 21);
    TBUtils.print(pen, centeredBox);

    BoxedBlock centeredTest = new BoxedBlock(new Centered(block, 20));
    TBUtils.print(pen, centeredTest);

    RightJustified rightBox = new RightJustified(box, 21);
    TBUtils.print(pen, rightBox);

    RightJustified lineJustified = new RightJustified(blockLine, 20);
    BoxedBlock boxJustified = new BoxedBlock(lineJustified);
    TBUtils.print(pen, boxJustified);

    HorizontallyFlipped boxFlipped = new HorizontallyFlipped(box);
    TBUtils.print(pen, boxFlipped);

    HorizontallyFlipped justHFText = new HorizontallyFlipped(blockLine);
    TBUtils.print(pen, justHFText);

    TextLine hello = new TextLine("hello");
    TextLine goodbye = new TextLine("goodbye");
    VComposition heyBye = new VComposition(hello, goodbye);

    VerticallyFlipped justVFText = new VerticallyFlipped(heyBye);
    TBUtils.print(pen, justVFText);

    BoxedBlock heyByeBox = new BoxedBlock(heyBye);
    VerticallyFlipped heyByeBoxTest = new VerticallyFlipped(heyByeBox);
    TBUtils.print(pen, heyByeBoxTest);

    HorizontallyFlipped equalTest = new HorizontallyFlipped(blockLine);
    HorizontallyFlipped equalTest2 = new HorizontallyFlipped(equalTest);
    pen.println("Result for equal 1 is " + TBUtils.equal(equalTest2, blockLine));
    pen.println("Result for equal 2 is " + TBUtils.equal(equalTest, equalTest2));

    pen.println("Result for eq 1 is " + TBUtils.eq(equalTest, equalTest));
    pen.println("Result for eq 2 is " + TBUtils.eq(equalTest, equalTest2));

    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
