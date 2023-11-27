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

  } // centeredTest()

  @Test
  public void rightJustifiedTest() {

  } // rightJustifiedTest()

  @Test
  public void HFTest() {

  } // HFTest()

  @Test
  public void VFTest() {

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
