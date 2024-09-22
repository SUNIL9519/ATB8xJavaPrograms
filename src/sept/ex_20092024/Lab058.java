package sept.ex_20092024;

public class Lab058 {
    public static void main(String[] args) {
        // Grade calculator
        // Write a program that calculates and displays the letter grade for given numerical
        // score (e.g. A, B,C, D, or F)
        // Based on the following grading scale:
        // A: 90-100, B: 80-90, C: 70-90, D: 60-69, F: 0-59
        // 90-> A
        // 87-> B
        // 23-> F

        // Logic Building -> Java

        // 1. find the user Inputs
        // score -> int, score =89;
        // return -> datatype - grade -> char

        // 2. Basic logic
        // if (score >= 90 && score <=100) -> return or print grade - A
        // else if score >=89 && score <=80 -> return or print grade - B
        // else if score >=79 && score <=70 -> return or print grade - C
        // D,E
        // else -> grade - F

        // 3. write the code
        char grade = 'F';
        int score = 100;// in future we will get this from the users, input

        if (score >= 90 && score <= 100) {
            grade = 'A';
        }else if (score >= 80 && score <= 89){
            grade ='B';
        }else if (score >= 70 && score <= 79){
            grade ='C';
        }else if (score >= 60 && score <= 69){
            grade ='D';
        }else if (score >= 0 || score > 100) {
            System.out.println("LOL!!, are you GOD");
            grade = 'O';
        }else {
            grade = 'F';
        }
        System.out.println(" Your Grade is -> " + grade);
    }
}
