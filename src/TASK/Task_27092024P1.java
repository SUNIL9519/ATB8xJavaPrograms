package TASK;

public class Task_27092024P1 {
    public static void main(String[] args) {
        // print the first 5 even numbers

        // int count = 1;
        //int number = 2;
        //do{
            //System.out.println(number);
            //number += 2;
            //count++;
        //} while (count <= 5); // using do while loop

        int count = 0;
        int number = 2;
        while (count < 5){
            if (number%2 == 0){
                System.out.println(number);
                count++;
            }
            number ++;
        }
    }
}
