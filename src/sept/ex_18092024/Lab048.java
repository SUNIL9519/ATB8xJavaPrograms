package sept.ex_18092024;

public class Lab048 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a); // 21

        int a1 =10;
        System.out.println(a1++ + ++a1); // 10, 11 , 12, 12 // 10+12=22 take the first value i.e 10 and 12
        System.out.println(a1); // 12

        int a3 = 10;
        System.out.println(++a3 + ++a3); // 11, 11, 12, 12 // 11+12 =23
        System.out.println(a3); // 12

        int b = 10;
        System.out.println(++b + b++ + b++); // 11,11,11,12,12,13 //11+11+12 =34
        System.out.println(b); // 13
    }
}
