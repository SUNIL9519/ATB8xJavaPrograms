package sept.ex_13092024;

public class Lab022 {
    public static void main(String[] args) {
        // Single char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';
        System.out.println(c1 + " " + c2 + " " + c3);

        // Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Sunil" + '\n' + "Kumar");
        // You can also write System.out.println("Sunil" + new_line + "Kumar");
        System.out.println("Sunil" + '\t' + "Kumar");
        System.out.println("Sunil" + '\b' + "Kumar");
        System.out.println("Sunil" + '\r' + "Kumar");

        char c11 = 'A'; // 65 -> ASCII value of a is 65
        System.out.println(c11);
        char c12 = '\u0041';   // '\u0041' is the UNICODE of A
        System.out.println(c12);
    }
}
