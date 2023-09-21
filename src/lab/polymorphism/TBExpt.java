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

    BoxedBlock centeredTest = new BoxedBlock(new Centered(block, 21));
    TBUtils.print(pen, centeredTest);
  
    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt

/*
 * / Create a block to use
    TextBlock block = new TextLine("This is a test.");

    // Print out the block
    TBUtils.print(pen, block);

      TextBlock amazing = new TextLine("You are amazing.");

      BoxedBlock awesome = new BoxedBlock(amazing);

      TBUtils.print(pen, awesome);
      
      BoxedBlock incredible = new BoxedBlock(awesome);
      TBUtils.print(pen, incredible);

      TextBlock empty = new TextLine(" ");
      BoxedBlock emptyBox = new BoxedBlock(empty);
      TBUtils.print(pen, emptyBox);

  TextBlock helo = new TextLine("hello");
  TextBlock godbye = new TextLine("goodbye");
  BoxedBlock hello = new BoxedBlock(helo);
  BoxedBlock goodbye = new BoxedBlock(godbye);
  VComposition hellogoodbye = new VComposition(hello, goodbye);

  VComposition helogodbye = new VComposition(helo,godbye);

  BoxedBlock helogodbyeblock = new BoxedBlock(helogodbye);
  TBUtils.print(pen, helogodbyeblock);
  TBUtils.print(pen,hellogoodbye);

  HComposition comp1 = new HComposition(hello, godbye);
  HComposition comp2 = new HComposition(godbye,hello);
  TBUtils.print(pen,comp1);
  TBUtils.print(pen,comp2);
 */
