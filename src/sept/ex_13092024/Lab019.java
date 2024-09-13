package sept.ex_13092024;

public class Lab019 {

    public static void main(String[] args) {

        // Problem statement -> print the table of 9

        System.out.println("9*1=9");   // This is the wrong way to do as it will make the code longer
        System.out.println("9*2=18");
        System.out.println("9*3=27");
        System.out.println("9*4=36");
        System.out.println("9*5=45");
        System.out.println("9*6=54");
        System.out.println("9*7=63");
        System.out.println("9*8=72");
        System.out.println("9*9=81");
        System.out.println("9*10=90");

        // We can print this by using the concept of formatting

        // Formatting
        // we will use %d for -> integer, byte, short, long
        //             %s for -> String
        //             %c for -> char
        //             %f for -> float, double

        //System.out.println("2*1=2"); // normally we print like this

        int num = 10; // here if we change the value, then it automatically change in below codes
        System.out.printf("%d",num);
        System.out.println();
        System.out.printf("%d * %d = %d",num,1,num*1);
        System.out.println();
        System.out.printf("%d * %d = %d",num,2,num*2);
        System.out.println();
        System.out.printf("%d * %d = %d",num,3,num*3);
        System.out.println();
        System.out.printf("%d * %d = %d",num,4,num*4);
        System.out.println();
        System.out.printf("%d * %d = %d",num,5,num*5);
        System.out.println();
        System.out.printf("%d * %d = %d",num,6,num*6);
        System.out.println();
        System.out.printf("%d * %d = %d",num,7,num*7);
        System.out.println();
        System.out.printf("%d * %d = %d",num,8,num*8);
        System.out.println();
        System.out.printf("%d * %d = %d",num,9,num*9);
        System.out.println();
        System.out.printf("%d * %d = %d",num,10,num*10);





    }
}
