package sept.ex_23092024;

public class Lab063 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge cases.

        String browser = "chrome";

        switch (browser) {
            case "chrome":
                System.out.println("starting the chrome browser");
                // Further code to start the chrome
                // Webdriver driver = new Chrome(); // Selenium Code
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                // Further code to start the firefox
                // Webdriver driver = new Chrome(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I don't have any idea which browser is this ");
                break;
        }
    }
}
