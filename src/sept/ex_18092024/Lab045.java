package sept.ex_18092024;

public class Lab045 {
    public static void main(String[] args) {
        // GST = 18.45
        int course = 100;
        float GST = 18.45f;
        // int total_price = course+GST; // Narrowing - Implicit - JVM // Invalid // as we cant store float value to integer
        float total_price = course + GST; // widening - Implicit - JVM
        System.out.println(total_price);

        // If you only want to store the value in int then,
        int total_price1 = course+(int)GST; // Narrowing - Explicit - loss of 45
        System.out.println(total_price1);
    }

}
