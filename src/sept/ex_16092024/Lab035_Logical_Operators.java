package sept.ex_16092024;

public class Lab035_Logical_Operators {
    public static void main(String[] args) {

        // ! -> Logical NOT
        // && -> Logical AND // these are gates
        // || -> Logical OR

        boolean a = true;
        boolean b = true;
        boolean c = true && true;
        System.out.println(c);

        boolean a1 = true;
        boolean b1 = true;
        boolean c1 = true || true;
        System.out.println(c1);

        boolean a2 = true;
        boolean b2 = true;
        boolean c2 = !true;
        System.out.println(c2);
    }
}
