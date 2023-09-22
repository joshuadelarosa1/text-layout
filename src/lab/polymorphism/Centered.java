package lab.polymorphism;

/**
 * Centers a text block based on the given width
 * 
 * @author Joshua De La Rosa
 * @version 1, September 21st, 2023
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

    if (i > this.height() || i < 0) {
      throw new Exception("Invalid row larger than height " + i);
    }

    String result;

    if (thisBW > thisW) {
      Truncated centerTruncated = new Truncated(this.block, thisW);
      result = centerTruncated.row(i);
    } else {
      if (((thisW - thisBW) % 2) == 0){
        result = TBUtils.spaces((thisW - thisBW) / 2) + this.block.row(i);
        result = result + TBUtils.spaces((thisW - thisBW) / 2);
      } else {
        result = TBUtils.spaces((Math.round((thisW - thisBW) / 2)) + 1) + this.block.row(i);
        result = result + TBUtils.spaces(Math.round((thisW - thisBW) / 2));
      }
    }

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
