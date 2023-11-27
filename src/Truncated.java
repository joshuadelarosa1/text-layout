import java.io.PrintWriter;

/**
 * Truncates inputed text blocks
 * 
 * @author Joshua De La Rosa
 * @version 1 of September 20th, 2023
 */
public class Truncated implements TextBlock {

  PrintWriter pen = new PrintWriter(System.out, true);

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * the text block
   */
  TextBlock block;

  /**
   * the width of the text block
   */
  int width;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Builds a new block by truncating the previous block.
   */
  public Truncated(TextBlock block, int width) {
    this.block = block;
    this.width = width;
  } // Truncated(TextBlock block, int width)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * returns the height of the block
   */
  public int height() {
    return this.block.height();
  } // height()

  /**
   * returns the width of the block
   */
  public int width() {
    return this.width;
  } // width()

  /**
   * @pre 0 < i < this.height
   * @exception if row i is larger than width or height
   */
  public String row(int i) throws Exception {
    if (i > this.block.height() || i < 0) {
      throw new Exception("Invalid row larger than height " + i);
    }

    String result;

    if (this.block.width() <= this.width) {
      result = this.block.row(i);
    } else {
      result = this.block.row(i).substring(0, this.width);
    }

    return result;
  } // row(int i)

} // class Truncated
