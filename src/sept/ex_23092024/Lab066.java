package sept.ex_23092024;

public class Lab066 {

    public static void main(String[] args) {

        // Multiple match

        int itemcode = 006;
        switch (itemcode){
            case 001, 002, 005:
                System.out.println(" All of them are Electronic gadgets");
                break;
            case 004, 006, 007:
                System.out.println("All of them are Mechanical gadgets"); // here 006 is matching
                break;
            default :
                System.out.println("None");
                // System.out.println("None"); // here multiple statements are allowed
                break;
        }
    }
}
