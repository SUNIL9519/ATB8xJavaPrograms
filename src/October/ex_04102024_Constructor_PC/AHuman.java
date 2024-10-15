package October.ex_04102024_Constructor_PC;

import java.sql.SQLOutput;

public class AHuman {

    String eyes_colour;
    String planet = "AHuman";
    String name;
    long aadhar_card_number;

    // Default constructor

    AHuman(){
        System.out.println("I will be called, object is created");
        // write a code here, which will automatically called when Object is created
        // Read a file text
        // Read a CSV, excel here

    }

    // Parameterized Constructors

    AHuman(String name){
        System.out.println(" Hi, I am Param constructors");
        this.name = name;

    }

    // Return -> void, data-type

    void walk(){
        System.out.println("NRNR");
    }

    int talk(){
        System.out.println("RTNA");
        return 10;
    }

    String sleep(String name){
        System.out.println("Sleeping");
        System.out.println("RTWA");
        return "I am sleeping";
    }

    void eat(){
        System.out.println("NRWA");
        System.out.println("Eat");
    }

}
