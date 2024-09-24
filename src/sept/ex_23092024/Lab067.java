package sept.ex_23092024;

public class Lab067 {
    public static void main(String[] args) {

        int itemcode =001; // This syntax is only available in JDK>13

        switch(itemcode){
            case 001 -> System.out.println("it is a laptop");
            // System.out.println("it is a laptop"); // here multiple statements are not allowed
            case 002 -> System.out.println("it is a desktop");
            case 003, 004 -> System.out.println("it is a mobile phone");
            default -> System.out.println("print hello");

            // here by using "->", we do not need to use break // only available in JDK>13
        }
    }
}
