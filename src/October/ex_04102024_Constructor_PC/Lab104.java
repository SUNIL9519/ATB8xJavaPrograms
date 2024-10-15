package October.ex_04102024_Constructor_PC;

public class Lab104 {
    public static void main(String[] args) {
        AHuman sunil = new AHuman();
        AHuman saswat = new AHuman("saswat");
        AHuman vijay = new AHuman("vijay");

        System.out.println(sunil.planet);
        System.out.println(saswat.planet);


        System.out.println(sunil.name);
        System.out.println(saswat.name); // saswat
        System.out.println(vijay.name); // vijay
    }
}
