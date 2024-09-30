package sept.ex_27092024_loop;

public class Lab099_while_loop {
    public static void main(String[] args) {
        int a = 0;
        while (a < 0) {
            System.out.println("Print" + a);
            a++; // it won't give any output, because the condition is checked first, then it will execute the body
        }
    }
}
