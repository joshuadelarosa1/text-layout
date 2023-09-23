package lab.polymorphism;

public class BlockOfZeros implements TextBlock {

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  TextBlock block;


  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  BlockOfZeros(TextBlock block) {
    this.block = block;
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

    String result = "";

    if(this.block.height() == 1){
      return this.block.row(i);
    }

    for (int j = 0; j < this.block.row(i).length(); j++) {
      if (!(Character.isAlphabetic(this.block.row(i).charAt(j)))) {
        result = result + "0";
      } else {
        result = result + this.block.row(i).charAt(j);
      }
    }

    return result;
  }

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

}
