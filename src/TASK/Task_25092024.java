package TASK;

import java.util.Scanner;

public class Task_25092024 {
    public static void main(String[] args) {
        // table of number = 10, print  table with for or while loop

//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter the number\n");
//        int n = sc.nextInt();
//        System.out.println(" Multiplication of table");
//        for(int i = 1; i <= 10; i++){
//            System.out.println( n + " * " + i + " = " + (n*i));
        //}

        // using while loop

        int n = 10;
        int i =1;
        while ( i <= 10) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }
    }
}
