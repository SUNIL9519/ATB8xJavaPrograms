package sept.ex_18092024;

public class Lab043 {
    public static void main(String[] args) {
        // Type Casting
            // 1. Widening type casting -> Implicit, Explicit - losses
            // 2. Narrowing type casting -> Implicit , Explicit(with data type), loss

        // Widening

        byte b = 10;
        int a = b; // Valid (because we can store byte value to int, as storage capacity of int is more) Implicit casting -> done by JVM
        int a1 = (int)b; // Valid  Explicit  casting -JVM

        // Narrowing

        int val = 300;
        // byte b1 = val; // Invalid Implicit Casting -> JVM does it when you are not mentioning anything
        byte b2 = (byte)val; // Invalid Explicit Casting -> loss of data // mentioning byte here-> (byte)val
        System.out.println(b2); // O/P -> 44

        // Explanation
             // int a = 300; -> int means 32 bits memory required
             // 32 bits -> 00000000000000000000000100101100
             // byte b2 = (byte)val; -> byte means 8 bits memory required
             // 8 bits -> 00101100
        // Value is 0 + 0 + 32 + 0 + 8 + 4 + 0 +0 = 44 // (00101100) = (0 × 2⁷) + (0 × 2⁶) + (1 × 2⁵) + (0 × 2⁴) + (1 × 2³) + (1 × 2²) + (0 × 2¹) + (0 × 2⁰) = (44)
    }
}
