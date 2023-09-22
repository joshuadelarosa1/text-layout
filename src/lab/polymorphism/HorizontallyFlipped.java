package lab.polymorphism;

public class HorizontallyFlipped implements TextBlock {

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The left portion of the composition.
   */
  TextBlock left;

  /**
   * The right portion of the composition.
   */
  TextBlock right;

  public HorizontallyFlipped(TextBlock left, TextBlock right) {
    this.left = left;
    this.right = right;
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

  }

  /**
   * Determine how many rows are in the block.
   */
  public int height() {

  }

  /**
   * Determine how many columns are in the block.
   */
  public int width() {

  }
} // class HorizontallyFlipped
