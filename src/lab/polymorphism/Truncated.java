package lab.polymorphism;

import java.io.PrintWriter;

/**
 * Truncates inputed text blocks
 * 
 * @author Joshua De La Rosa
 * @version 1 of September 20th, 2023
 */
public class Truncated implements TextBlock{

  PrintWriter pen = new PrintWriter(System.out, true);

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

  public Truncated(TextBlock block, int width){
    this.block = block;
    this.width = width;
  }

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * returns the height of the block
   */
  public int height(){
    return this.block.height();
  }

  /**
   * returns the width of the block
   */
  public int width(){
    return this.block.width();
  }

  /**
   * @pre 0 < i < this.height
   * @exception if row i is larger than width or height
   */
  public String row(int i) throws Exception{
    if(i > this.height() || i < 0){
      throw new Exception("Invalid row larger than height " + i);
    }

    String result;

    if(this.block.width() <= this.width){
      result = this.block.row(i);
    } else{
      result = this.block.row(i).substring(0, this.width);
    }

    return result;
  }


} // class Truncated
