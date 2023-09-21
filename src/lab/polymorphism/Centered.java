package lab.polymorphism;

/**
 * Centers a text block based on the given width
 * 
 * @author Joshua De La Rosa
 * @version 1, September 21st, 2023
 */
public class Centered implements TextBlock{
 
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * the text block
   */
  TextBlock block;

  /**
   *  the width of the text block 
   */
  int width;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  public Centered(TextBlock block, int width){
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
  public String row(int i) throws Exception{
    if(i > this.height() || i < 0){
      throw new Exception("Invalid row larger than height " + i);
    }

    String result;

    if(i < this.width){
      result = TBUtils.spaces(this.width / 2) + this.block.row(i);
    } else{
      result = this.block.row(i) + TBUtils.spaces(this.width / 2);
    }

    if(this.block.width() > this.width){
      Truncated centerTruncated = new Truncated(this.block, this.width);
      result = centerTruncated.row(i);
    }

    return result;
  } // row(int i)

  /**
   * Determine how many rows are in the block.
   */
  public int height(){
    return this.block.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width(){
    return this.width;
  } // width()

} // class Centered
