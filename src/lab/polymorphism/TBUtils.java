package lab.polymorphism;

import java.io.PrintWriter;

/**
 * Utilities for TextBlocks.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2014
 */
public class TBUtils {
  // +--------------+------------------------------------------------------
  // | Class Fields |
  // +--------------+

  /**
   * A really big sequence of dashes. This sequence may grow as the program operates.
   */
  static String lotsOfDashes = "--";

  /**
   * A really big sequence of spaces. This sequence may grow as the program operates.
   */
  static String lotsOfSpaces = "  ";

  // +----------------+----------------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * Build a sequence of dashes of a specified length.
   */
  static String dashes(int len) {
    // Note: This strategy probably represents an overkill in
    // attempts at efficiency.
    // Make sure the collection of dashes is big enough
    while (lotsOfDashes.length() < len) {
      lotsOfDashes = lotsOfDashes.concat(lotsOfDashes);
    } // while
    // Extract an appropriate length substring
    return lotsOfDashes.substring(0, len);
  } // dashes(int)

  /**
   * Returns true if two textblocks contain the same lines
   * 
   * @throws Exception
   */
  static boolean equal(TextBlock t1, TextBlock t2) throws Exception {

    String resultT1 = "";
    String resultT2 = "";

    for (int i = 0; i < t1.height(); i++) {
      for (int j = 0; j < t1.row(i).length(); j++) {
        if (!(Character.isAlphabetic(t1.row(i).charAt(j)))) {
          continue;
        } else {
          char currentCH = t1.row(i).charAt(j);
          resultT1 = resultT1 + String.valueOf(currentCH);
        }
      }
    }

    for (int i = 0; i < t2.height(); i++) {
      for (int j = 0; j < t2.row(i).length(); j++) {
        if (!(Character.isAlphabetic(t2.row(i).charAt(j)))) {
          continue;
        } else {
          char currentCH = t2.row(i).charAt(j);
          resultT2 = resultT2 + String.valueOf(currentCH);
        }
      }
    }

    if (resultT1.equals(resultT2)) {
      return true;
    } else {
      return false;
    }
  } // equal(TextBlock t1, TextBlock t2)

  /**
   * Returns true if two textblocks are built the same way
   */
  static boolean eqv(TextBlock t1, TextBlock t2) {
    if(t1.getClass().equals(t2.getClass()))
    return true; 

    return false;
  } // eq(TextBlock t1, TextBlock t2)

  /**
   * Returns true if two textblocks are in the same memory location
   */
  static boolean eq(TextBlock t1, TextBlock t2) {
    return t1 == t2;
  } // eq(TextBlock t1, TextBlock t2)

  /**
   * Print a TextBlock to the specified destination.
   */
  public static void print(PrintWriter pen, TextBlock block) {
    for (int i = 0; i < block.height(); i++) {
      // Even though we only call block.row with a valid i,
      // we need to put the call in a try/catch block.
      try {
        pen.println(block.row(i));
      } catch (Exception e) {
        pen.println();
      } // catch (Exception)
    } // for
  } // print(PrintWriter, TextBlock)

  /**
   * Build a sequence of spaces of a specified length.
   */
  static String spaces(int len) {
    // As with dashes, this is probably overkill.
    // Make sure the collection of dashes is big enough
    while (lotsOfSpaces.length() < len) {
      lotsOfSpaces = lotsOfSpaces.concat(lotsOfSpaces);
    } // while
    // Extract an appropriate length substring
    return lotsOfSpaces.substring(0, len);
  } // spaces(int)

  /**
   * Converts a block to a string
   */
  static String toString(TextBlock block) {
    String result = "not implemented yet";

    return result;
  }

} // class TBUtils
