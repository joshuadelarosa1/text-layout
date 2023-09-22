package lab.polymorphism;

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

  public RightJustified(TextBlock block, int width) {
    this.block = block;
    this.width = width;
  }

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

    if (i > this.block.height() || i < 0) {
      throw new Exception("Invalid row larger than height " + i);
    }

    String result = "not implemented";

    return result;
  }

  /**
   * Determine how many rows are in the block.
   */
  public int height() {
    return this.block.height();
  }

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    return this.width;
  }

}
