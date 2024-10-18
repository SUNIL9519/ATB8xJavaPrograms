package October.ex_11102024.accessModifiers.example;

public class Lab114 {

    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin","password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "hacker";
        System.out.println(vwoLogin.password);

        GOODVWOLogin vwoLogin1  = new GOODVWOLogin("goodadmin","admin123");
        // System.out.println(vwoLogin1.password);
        // vwoLogin1.password = "pass123";>?
        System.out.println(vwoLogin1.getPassword());

        // Checking Admin
        boolean isAdmin = false;

        // vwoLogin1.setYourKey("admin");

        vwoLogin1.setPassword("newpassword",isAdmin);
        System.out.println(vwoLogin1.getPassword());




    }
}
