/**
 * Implements TextBlock in order to center a block and the contents inside the box.
 * 
 * @author Joshua De La Rosa
 * @version 2 of 20 Novemeber, 20th
 */
public class Centered implements TextBlock {

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
   * Build a new block by centering it.
   */
  public Centered(TextBlock block, int width) {
    this.block = block;
    this.width = width;
  } // Centered(TextBlock block, int width)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   * 
   * @pre i < this.height()
   * @exception Exception if the row number is invalid.
   */
  public String row(int i) throws Exception {
    int thisW = this.width;
    int thisBW = this.block.width();

    if (i > this.block.height() || i < 0) {
      throw new Exception("Invalid row larger than height " + i);
    }

    String result;

    if (thisBW > thisW) {
      Truncated centerTruncated = new Truncated(this.block, thisW);
      result = centerTruncated.row(i);
    } else {
      if (((thisW - thisBW) % 2) == 0) {
        result = TBUtils.spaces((thisW - thisBW) / 2) + this.block.row(i);
        result = result + TBUtils.spaces((thisW - thisBW) / 2);
      } else {
        result = TBUtils.spaces((Math.round((thisW - thisBW) / 2)) + 1) + this.block.row(i);
        result = result + TBUtils.spaces(Math.round((thisW - thisBW) / 2));
      }
    } // row(int i)

    return result;
  } // row(int i)

  /**
   * Determine how many rows are in the block.
   */
  public int height() {
    return this.block.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    return this.width;
  } // width()

} // class Centered
