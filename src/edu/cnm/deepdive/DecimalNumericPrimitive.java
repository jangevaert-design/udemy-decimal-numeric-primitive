package edu.cnm.deepdive;

public class DecimalNumericPrimitive {

  public static void main(String[] args) {
    //when giving a decimal number, it is assumed to be a double.
    // float myNumber = 25.4 will not compile because "incompatible types", float left, double right.
    float myNumber = 25.4F;

    /*
    illegal underscores
    double before = 10_.25;
    double after = 10._25;
    double first = _10.25;
    double last = 10.25_;
     */

    double mydouble = 2.54;
    double myDouble2 = 2.54F; //this float will be converted to double. Read from right to left!
    double anotherDouble = 2.45D; //by default all decimal numbers are doubles so no need to specify with D.
    double scientific = 5.000125E03;// would be the same as 5,000.125.

    double hexPI = 0x1.91eb851eb851fp1;// p indicates hexadecimal floating point number.
    System.out.println("hexPi = " + hexPI);


  }

}
