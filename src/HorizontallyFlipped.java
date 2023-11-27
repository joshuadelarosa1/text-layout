/**
 * Creates a new block that flips a TextBlock horiztonally. Implements TextBlock.
 * 
 * @author Joshua De La Rosa
 * @version 2 of 20 Novemeber, 20th
 */
public class HorizontallyFlipped implements TextBlock {

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * the text block
   */
  TextBlock block;

  /**
   * Creates a new text block that is horiztonally flipped
   */
  public HorizontallyFlipped(TextBlock block) {
    this.block = block;
  } // HoriztonallyFlipped(TextBlock block)

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

    String result = "";

    for (int k = this.block.row(i).length() - 1; k >= 0; k--) {
      char currentCH = this.block.row(i).charAt(k);
      result = result + String.valueOf(currentCH);
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
    return this.block.width();
  } // width()

} // class HorizontallyFlipped
