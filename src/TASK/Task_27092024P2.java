package TASK;

public class Task_27092024P2 {
    public static void main(String[] args) {
        // calculate the sum of numbers from 1 to 100
//        int sum = 0;
//        int i = 1;
//        while(i<=100){
//            sum = sum+i;
//            i++;
//        }
//        System.out.println(sum);

        // using do while
        int sum = 0; // variable to hold the sum
        int i = 1; // starting point
        do{
            sum += i; // add i to sum
            i++;
        } while( i <= 100); // continue until i is greater than 100
        System.out.println(" The sum of numbers from 1 to 100 is: " + sum);

    }
}
