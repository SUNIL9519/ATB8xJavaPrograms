package sept.ex_23092024;

public class Lab062 {
    public static void main(String[] args) {
        // Switch condition
        // Day 1 to 7 -> 1 - Mon, 2 - Tue, 7 - Sun....

        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("No idea, what day it is"); // if we will remove break keyword then it will print all days
        }
        System.out.println("End of the loop");
    }
}
