package October.ex_04102024_Constructor_PC;

public class Dog {

    String name;
    int age;
    int legs;
    String breed;

    // Default constructor

    Dog(){
        System.out.println(" I am DC");
        System.out.println(" God is happy");

    }

    // Parameterized Constructor

    Dog(String breed){
        System.out.println(" I am PC");
        this.breed = breed;
    }

    Dog(String breed, String name, int age, int legs){
        System.out.println("I am PC");
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.legs = legs;
    }

    void walk(){

    }
}
