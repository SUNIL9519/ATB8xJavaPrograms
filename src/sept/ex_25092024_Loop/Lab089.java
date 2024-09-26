package sept.ex_25092024_Loop;

public class Lab089 {
    public static void main(String[] args) {
        // print the values of even and odd numbers between 0 to 50
        for(int i = 0; i<=50; i++){
            if(i%2 == 0){
                System.out.println("Even -> " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
