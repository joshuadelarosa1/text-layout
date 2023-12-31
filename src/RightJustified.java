/**
 * Right Justifies inputed text blocks
 * 
 * @author Joshua De La Rosa
 * @version 1 of September 20th, 2023
 */
public class RightJustified implements TextBlock {

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The text block
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
   * Build a new block by right justifying it.
   */
  public RightJustified(TextBlock block, int width) {
    this.block = block;
    this.width = width;
  } // RightJustified(TextBlock block, int width)

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
    } // if

    String result;

    if (thisBW > thisW) {
      Truncated centerTruncated = new Truncated(this.block, thisW);
      result = centerTruncated.row(i);
    } else {
      result = TBUtils.spaces(thisW - thisBW) + this.block.row(i);
    } // if... else

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

} // class RightJustified
