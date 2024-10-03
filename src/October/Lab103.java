package October;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {

        ATBStudent Sunil = new ATBStudent(); // Sunil is reference variable -> 8byte, 64 bits, default value is null
        Sunil.age = 29;

        ATBStudent Saswat = new ATBStudent(); // Object creation with reference
        Saswat.age = 28;

        // Scanner sc = new Scanner();

        new ATBStudent(); // object with without reference


    }
}
