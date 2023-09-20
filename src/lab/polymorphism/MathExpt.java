package lab.polymorphism;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.math.BigDecimal;

/**
 * A few simple experiments with our utilities.
 * Version 1.1 of February 2019.
 */
public class MathExpt {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

  BigInteger j = BigInteger.valueOf(16);
  pen.println("square root of big int = " + MathUtils.squareRoot(j));

  BigDecimal k = BigDecimal.valueOf(16.0);
  pen.println("square root of big decimal = " + MathUtils.squareRoot(k));

  double l = 16;
  pen.println("square root of double = " + MathUtils.squareRoot(l));

  Integer captialInt = Integer.valueOf(16);
  pen.println("sqaure root of captial int = " + MathUtils.squareRoot(captialInt));

  Float capitalFloat = Float.valueOf(16);
  pen.println("sqaure root of captial Float = " + MathUtils.squareRoot(capitalFloat));

  Double capitalDouble = Double.valueOf(16);
  pen.println("sqaure root of captial double = " + MathUtils.squareRoot(capitalDouble));

    // Print some square roots.
    for (int i = 2; i < 10; i++) {
      double root = MathUtils.squareRoot(i);
      pen.println("The square root of " + i + " seems to be " + root);
      pen.println(root + "^2 = " + (root * root));
    } // for i

    // We're done. Clean up.
    pen.close();
  } // main(String[])
} // class MathExpt
