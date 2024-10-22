package October.ex_21102024_Wrapper_Exception;

public class Lab140 {

    public static void main(String[] args) {

        String num = "10";
        Integer a = Integer.valueOf(num);
        System.out.println(a);
        int a2 = a; // Unboxing
        System.out.println(a2);

        // String to Primitive?
        int a3 = Integer.parseInt(num);
        System.out.println(a3);

        // int a = 10; -> These are not class or object
        // Integer -> Collection of Framework (You can use class and object)

    }
}
