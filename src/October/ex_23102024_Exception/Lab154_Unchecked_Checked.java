package October.ex_23102024_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab154_Unchecked_Checked {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Unchecked!");
        }


        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Checked Exception");
        }
    }
}