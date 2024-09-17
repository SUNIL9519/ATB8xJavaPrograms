package TASK;

public class Task_16092024 {

    // 1. Difference between = and ==

           //In Java, = and == are used for different purposes:

                // 1/ = (Assignment Operator):
                        //Purpose: Used to assign a value to a variable.
                        //Example: int a = 5; assigns the value 5 to the variable a.
                        //Usage: This operator changes the value stored in a variable.

               // 2/ == ( Relational Operator):
                        //Purpose: Used to compare two values or references for equality.
                        //Example: if (a == 5), checks if the value of a is equal to 5.
                        //Usage: This operator evaluates to true, if the two values being compared are equal,
                              // otherwise false

             //Key Differences

                      // Assignment (=):
                           // Action: Sets a variable to a new value.
                           // Syntax: variable = value;
                           // Example: int x = 10; assigns 10 to x.

                    // Comparison (==):
                           // Action: Compares two values to see if they are the same.
                           // Syntax: value1 == value2
                           // Example: if (x == 10) checks if x is equal to 10

    // 2.

        byte b = 10;
        long l = 10l;

        // size of byte is 8 bits = 1 Byte
        // size of long is 64 bits = 8 Byte
        // So, 9 bytes will be used here

    // 3.

    public static void main(String[] args) {

        byte b = 10;
        byte c = 10;
        System.out.println(b+c); // 20
        // it will give result in int datatype


    // 4.

      short S = 10;
      char C = 'A'; // the Unicode of A is 65
      int ss = S+C;
      System.out.println(ss); // 75

    }
}
