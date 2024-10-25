package October.ex_23102024_Exception;

public class Lab158_Try {

    public static void main(String[] args) {
        try {
            int c =  10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //  if (condition) // handling?
    }
}
