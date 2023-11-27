import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Tests methods of text blocks & text blocks themselves.
 * 
 * @author Joshua De La Rosa
 * @version 1 of Nov 26, 2023
 */
public class TextBlockTests {

  @Test
  public void emptyBlockTest() {

  } // emptyBlockTest()

  @Test
  public void truncatedTest() {
    TextBlock testBlock = new TextLine("hello world");
    Truncated truncatedBlock = new Truncated(testBlock, 5);

    String result = TBUtils.toString(truncatedBlock);
    String expected = "hello";

    assertEquals(expected, result);
  } // truncatedTest()

  @Test
  public void centeredTest() {
    TextBlock testBlock = new TextLine("hello world");
    BoxedBlock box = new BoxedBlock(testBlock);
    Centered centeredBox = new Centered(box, 21);

    String result = TBUtils.toString(centeredBox);
    String expected = "    +-----------+    \n" + //
        "    |hello world|    \n" + //
        "    +-----------+    ";

    assertEquals(expected, result);
  } // centeredTest()

  @Test
  public void rightJustifiedTest() {
    TextBlock testBlock = new TextLine("hello world");
    BoxedBlock box = new BoxedBlock(testBlock);
    RightJustified rightBox = new RightJustified(box, 21);

    String result = TBUtils.toString(rightBox);
    String expected = "        +-----------+\n" + //
        "        |hello world|\n" + //
        "        +-----------+";

    assertEquals(expected, result);
  } // rightJustifiedTest()

  @Test
  public void HFTest() {
    TextLine blockLine = new TextLine("hello world");
    HorizontallyFlipped justHFText = new HorizontallyFlipped(blockLine);

    String result = TBUtils.toString(justHFText);
    String expected = "dlrow olleh";

    assertEquals(expected, result);
  } // HFTest()

  @Test
  public void VFTest() {
    TextLine hello = new TextLine("hello");
    TextLine goodbye = new TextLine("goodbye");
    VComposition testComp = new VComposition(hello, goodbye);
    VerticallyFlipped justVFText = new VerticallyFlipped(testComp);

    String result = TBUtils.toString(justVFText);
    String expected = "goodbye\nhello  ";

    assertEquals(expected, result);
  } // VFTest()

  @Test
  public void equalTest() {

  } // equalTest()

  @Test
  public void eqvTest() {

  } // eqvTest()

  @Test
  public void eqTest() {

  } // eqTest()
} // class TextBlockTests
