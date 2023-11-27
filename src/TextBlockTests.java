import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
    TextBlock testBlock = new TextLine("");
    BoxedBlock box = new BoxedBlock(testBlock);

    String result = TBUtils.toString(box);
    String expected = "++\n||\n++";

    assertEquals(expected, result);
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
  public void BOZTest() {
    TextLine blockLine = new TextLine("hello world");
    TextBlock block = blockLine;
    BoxedBlock box = new BoxedBlock(block);
    BlockOfZeros zeroBlock = new BlockOfZeros(box);

    String result = TBUtils.toString(zeroBlock);
    String expected = "0000000000000\n0hello world0\n0000000000000";

    assertEquals(expected, result);
  } // BOZTest()

  @Test
  public void equalTest() {
    TextLine testText = new TextLine("hello world");
    TextLine testComparison = new TextLine("hello world");
    TextBlock testBox = new BoxedBlock(testText);
    TextBlock boxComparison = new BoxedBlock(testComparison);

    BoxedBlock box = new BoxedBlock(testBox);
    Centered centeredBox = new Centered(boxComparison, 21);

    try {
      assertTrue(TBUtils.equal(box, centeredBox));
    } catch (Exception e) {
      e.printStackTrace();
    }
  } // equalTest()

  @Test
  public void eqvTest() {
    TextBlock testBlock = new TextLine("hello world");
    Truncated truncatedBlock = new Truncated(testBlock, 5);
    BoxedBlock box = new BoxedBlock(truncatedBlock);

    assertFalse(TBUtils.eqv(truncatedBlock, box));
  } // eqvTest()

  @Test
  public void eqTest() {
    TextBlock testBlock = new TextLine("hello world");
    Truncated truncatedBlock = new Truncated(testBlock, 5);

    assertTrue(TBUtils.eq(truncatedBlock, truncatedBlock));
  } // eqTest()
} // class TextBlockTests
