package sept.ex_20092024;

public class Lab050 {
    public static void main(String[] args) {

        // Ternary Operator
        // Syntax: Condition? expression_if_true:expression_if_false
        int a1 = (30 > 40) ? 10 : 20;
        System.out.println(a1);

        int Sunil = 4;
        int Anil = 7;
        String result = (Sunil > Anil) ? "Sunil Won" : "Anil Won";
        System.out.println(result);

        String str = (10 > 20) ? "10" : "TWENTY";
        System.out.println(str);

        // Maximum, Minimum using Ternary Operator

        int Sunil_salary = 4;
        int Anil_salary = 7;
        int max = (Sunil_salary > Anil_salary) ? Sunil_salary : Anil_salary;
        System.out.println(max);

        int a = 10;
        int b = 20;
        int max1 = (a > b) ? a : b;
        int min1 = (a < b) ? a : b;
        System.out.println(max1);
        System.out.println(min1);

    }

}
