// Lawn.java
// Thomas Alexander Price
// taprice
// programming assignment 1
// calcs time taken to mow a lawn, given house+property size

import java.util.*;

class Lawn {
  public static void main(String[] args) {
    Scanner kbr = new Scanner(System.in);
    System.out.print("Enter the length and width of the lot (in ft): ");
      double pw = kbr.nextDouble();
      double pl = kbr.nextDouble();
    System.out.print("Enter the length and width of the house (in ft): ");
      double hw = kbr.nextDouble();
      double hl = kbr.nextDouble();

    double proparea = pl*pw;
    double housarea = hl*hw;
    double lawnarea = proparea - housarea;
    System.out.println("The lawn area is " + lawnarea + " square feet.");

    //calcs mow time
    int mts, mtm, mth;
    System.out.print("Enter the mowing rate, in ft^2/sec: ");
      double mwr = kbr.nextDouble();

    mts = (int) Math.round(lawnarea / mwr);

    mtm = mts/60;
    mts = mts%60;
    mth = mtm/60;
    mtm = mtm%60;
    String mtc = mth + " hour" + (mth==1?", ":"s, ") + mtm + " minutes, and " + mts + " seconds";

    System.out.println("The mowing time is " + mtc + ".");
  }
}
