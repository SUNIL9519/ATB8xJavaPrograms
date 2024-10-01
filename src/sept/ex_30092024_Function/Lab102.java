package sept.ex_30092024_Function;

public class Lab102 {
    public static void main(String[] args) {

        // without parameter but with return type
        int age = function_type2();
        System.out.println(age);

        // with parameter and without return type
        function_type3(" Sunil");

        // with parameter and with return type
        int result = function_type4 ( 3,4);
        System.out.println(result);

    }

        // without parameter but with return type

        public static int function_type2() {
            System.out.println("  without parameter but with return type ");
            return 65;
        }

        // with parameter and without return type

        public static void function_type3( String name) {
            System.out.println("  with parameter but with return type ");
            System.out.println(" You have searched ->"  +  name);

        }

        // with parameter and with return type

         public static int function_type4(int a , int b){
             System.out.println("with parameter and with return type");
             return a+b;
         }
    }

