import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        float grade = 0;
        float allGrades = 0;
        double average = 0;
        int gradeAmount = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Program calculates the average of inputted grades.");
        System.out.println("Finish with a negative integer.");

        do {
            System.out.println("Input a grade (4-10): ");
            grade = reader.nextFloat();

            if (grade >= 4.0 && grade <= 10.0) {
                allGrades = allGrades += grade;
                gradeAmount++;
                average = allGrades / gradeAmount;
            } else if ((grade >= 0 && grade < 4.0) || grade > 10.0) {
                System.out.println("Invalid grade!");
            }
        } while (grade >= 0.0);

        System.out.println();
        if (gradeAmount <= 0) {
            System.out.println("You did not input any grades.");
        } else {
            System.out.println(gradeAmount + " grades inputted.");
            System.out.println("Average of the grades is: " + average);
        }
    }
}
