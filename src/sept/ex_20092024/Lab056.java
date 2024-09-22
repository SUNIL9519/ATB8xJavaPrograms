package sept.ex_20092024;

public class Lab056 {

    public static void main(String[] args) {
        int num = 11;
        if ( num % 2 == 0 ) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");

            // % is modulus
            //  2 | 11 | 5
            //    | 10 |
            //    ------
            //        1  -> remainder
        }
    }
}
