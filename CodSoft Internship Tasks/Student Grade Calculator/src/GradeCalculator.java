import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //This is used to take the subject input from the users
        System.out.println("Enter how many subjects you want to enter:  ");
        int noOfSubjects = sc.nextInt();

        //This is used to create the array to store the marks in the subjects
        int[] marks = new int[noOfSubjects];

        //This is used to get the marks of the students in each subject
        for (int i = 0; i < noOfSubjects; i++) {
            System.out.println("Enter the marks for: " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        //This is used to calculate the total marks of the students
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        //The is used to count the average percentage of the students
        float avgPercentage = (float) totalMarks / noOfSubjects;

        //This if/else condition is used for the grading system based on the marks
        String grade;
        if (avgPercentage >= 90) {
            grade = "A";
        } else if (avgPercentage >= 80) {
            grade = "B";
        } else if (avgPercentage >= 70) {
            grade = "C";
        } else if (avgPercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        //This is printing the statements
        System.out.println("Your total marks are: " + totalMarks);
        System.out.println("Your average percentage is: " + avgPercentage);
        System.out.println("Your grade is: " + grade);
    }
}
