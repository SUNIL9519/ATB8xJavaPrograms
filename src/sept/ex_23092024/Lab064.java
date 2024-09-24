package sept.ex_23092024;

public class Lab064 {

    public static void main(String[] args) {
        int a = 10;
        switch (a) { // This is valid
        }
        char ch = 'A'; // 65
        switch (ch){ // This is valid // Here we are using integer part of char
        }

        //boolean b = true;
        //switch(b){
        //}   // Invalid

        long a11 = 30l;
        switch((int)a11){ // direct long is not supported, you have to covert it in to int
        }

    }
}
