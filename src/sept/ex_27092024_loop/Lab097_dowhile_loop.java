package sept.ex_27092024_loop;

public class Lab097_dowhile_loop {
    public static void main(String[] args) {
        // while loop -> initialization -> condition -> body -> increment/ decrement
        // do while loop -> initialization -> body -> condition -> increment/ decrement

        int a = 0;
        do {
            System.out.println("Print" + a);
            a++;
        } while (a < 10);

    }
}
