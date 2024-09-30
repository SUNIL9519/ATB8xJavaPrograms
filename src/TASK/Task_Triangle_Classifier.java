package TASK;

import java.util.Scanner;

public class Task_Triangle_Classifier {

        // Triangle Classifier
        // Write a program that classifies a triangle based on its side lengths.
        // given three input values representing the lengths of the sides, determine
        // if the triangle is equilateral ( all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        // use an if-else statement to classify the triangle.
        // side1, side2, side 3
        public static void main(String[] args) {

            // Step ->1
            // Slides -> double
            // O/P -> String

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the length of side 1: ");
            double side1 = sc.nextDouble();

            System.out.println("Enter the length of side 2: ");
            double side2 = sc.nextDouble();

            System.out.println("Enter the length of side 3: ");
            double side3 = sc.nextDouble();

            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("Eq");
            }else if (side1 == side2 || side1 == side3 || side2 == side3){
                System.out.println("ISO");
            }else{
                System.out.println("scalene");
            }


    }
}
