package sept.ex_18092024;

public class Lab046 {
    public static void main(String[] args) {

        // Increment (++) , Decrement (--) Operators
        // Increment - 1. Pre Increment (eg. ++a), 2. Post Increment (eg. a++)
        // Decrement - 1. Pre Decrement (eg. --a), 2. Post Decrement (eg. a--)

        int a = 10;
        int b = ++a; // a = a+1 // value is incremented 1st then get stored
        System.out.println(b); // O/P -> 11
        System.out.println(a); // O/P -> 11

        int c = 10;
        System.out.println(++c); // 11
        System.out.println(c); // 11

        int a_post = 10; // Print first then increment
        System.out.println(a_post++);
        System.out.println(a_post);
    }
}
