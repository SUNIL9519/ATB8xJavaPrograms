package sept.ex_27092024_loop;

public class Lab098_dowhile_loop {
    public static void main(String[] args) {
        // do while loop -> initialization -> body -> condition -> increment/ decrement

        int a = 0;
        do {
            System.out.println("Print" + a);
            a++;
        } while (a < 0);
    }
}
