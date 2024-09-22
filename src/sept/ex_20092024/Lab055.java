package sept.ex_20092024;

public class Lab055 {

    public static void main(String[] args) {

        boolean a = true;
        a = !a;

        if ( 2+2 < 4){                             //
            System.out.println(" Inside the loop");// this block will not execute because else block is not present
        }
        System.out.println("Outside ->" + a);
    }
}
