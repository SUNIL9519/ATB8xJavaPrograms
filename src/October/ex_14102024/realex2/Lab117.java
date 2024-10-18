package October.ex_14102024.realex2;

public class Lab117 {

    public static void main(String[] args) {

        CHROMETC c  = new CHROMETC();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.takeScreenshot();
        c.NoBodyKnowsWhereIamPresent();

        FIREFOXTC firefoxtc = new FIREFOXTC();
        firefoxtc.openBrowser("FIREFOX");
        firefoxtc.closeBrowser("FIREFOX");


    }
}
