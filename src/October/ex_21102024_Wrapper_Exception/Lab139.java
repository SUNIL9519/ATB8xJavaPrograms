package October.ex_21102024_Wrapper_Exception;

public class Lab139 {

    public static void main(String[] args) {

        // Primitive data type to Wrapper class

        int a = 10;
        Integer b = a; // Boxing int to Integer
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer a2= 42;
        int value = a2; // Unboxing Integer to int
        System.out.println(value);
    }
}
