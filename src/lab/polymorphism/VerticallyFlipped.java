package lab.polymorphism;

public class VerticallyFlipped implements TextBlock {

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * this is the text block
   */
  TextBlock block;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * this builds a new vertically flipped text block
   */
  public VerticallyFlipped(TextBlock block) {
    this.block = block;
  } // VerticallyFlipped(TextBlock block)

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
    return "";
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
    return this.block.width();
  } // width()

} // class VerticallyFlipped
