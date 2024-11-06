package November.ex_04112024_Collection_Framework_SET_PO_MAP.ex_04112024_Generics;

public class Lab191_Generics_P2 {

    public static void main(String[] args) {

        printTs(1,"pramod",true);
    }

        public static <T1,T2,T3> void printTs(T1 a, T2 b, T3 c){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
