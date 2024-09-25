package sept.ex_25092024_Loop;

public class Lab077 {
    public static void main(String[] args) {
        for(int i = 0; ; i++){
            System.out.println(i); // infinite loop as condition part is missing here
        }
        // exit code 130 -> means stopped by the keyboard
    }
}
