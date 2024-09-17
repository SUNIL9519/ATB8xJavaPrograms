package sept.ex_16092024;

public class Lab031 {
    public static void main(String[] args) {

        String first_name = "Sunil";
        String middle_name = "Kumar";                  // int + int = math
        System.out.println(first_name + middle_name); // here + is called as Concatenation because it is adding two strings

        int a = 10;
        int b = 10;

        //Interview Question

        System.out.println(first_name + middle_name + a + b); // O/P is SunilKumar1010 because String is used first, so it will not add a and b
        System.out.println(a + b + first_name + middle_name); // O/P is 20SunilKumar because int is used first, so it will add a and b
        System.out.println(first_name + middle_name + (a + b)); // If we will use bracket then it will add a and b
    }
}
