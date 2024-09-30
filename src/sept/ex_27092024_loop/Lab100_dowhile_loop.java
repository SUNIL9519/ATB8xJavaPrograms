package sept.ex_27092024_loop;

public class Lab100_dowhile_loop {
    public static void main(String[] args) {
        int age= 17;
        do {
            System.out.println(" Can Vote");
            age++;
        } while (age < 18); // it will give cav vote as output because it will execute the 1st block of statement, then will check condition
    }                       // in case of while loop it will not give any out put as first condition will be checked
}
