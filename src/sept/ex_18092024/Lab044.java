package sept.ex_18092024;

public class Lab044 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        // short s = phone_no; // Narrowing -> Implicit - JVM // Invalid
        short s1 = (short)phone_no; // Narrowing -> Explicit -loss of data // Invalid
        System.out.println(s1); // O/P -> 5866
    }
}
