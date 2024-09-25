package sept.ex_25092024_Loop;

public class Lab078 {

    public static void main(String[] args) {
         final boolean b1 = true;
         // b1 = false // we can not change the final value as we are using final keyword

         for(int i = 1; b1; i++){
             System.out.println("Hello"); // infinite loop
        }
        // for(int i = 1; ; ){
            // System.out.println("Hello"); // infinite loop
            //}
        //for(; ; ){
            // System.out.println("Hello"); // infinite loop
            //}
     }

}
