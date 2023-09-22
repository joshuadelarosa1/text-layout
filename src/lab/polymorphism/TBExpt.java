package lab.polymorphism;

import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
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

    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
