import java.util.List;
import java.util.Scanner;

public class Main {
    // This class is created to display the console of Student Management System
    public static void main(String[] args) {
        // Creating an object for Student Management
        StudentManagement system = new StudentManagement();

        // This is used if there is any old data saved it will load it from the file.
        system.loadData();

        Scanner scanner = new Scanner(System.in);

        // This loop is for displaying the details  of management system.
        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Save Data");
            System.out.println("6. Exit");

            // Prompt the user to enter their choice.
            System.out.print("Enter your choice: ");

            // Read the user's choice.
            int choice = scanner.nextInt();

            // This is used for the new line character
            scanner.nextLine();

            // Process the user's choice.
            switch (choice) {
                case 1:
                    // Add Student
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = scanner.nextLine();

                    Student student = new Student(rollNumber, name, grade);
                    system.addStudent(student);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    // Remove Student
                    System.out.print("Enter Roll Number to Remove: ");
                    int rollNumberToRemove = scanner.nextInt();
                    system.removeStudent(rollNumberToRemove);
                    System.out.println("Student removed successfully.");
                    break;

                case 3:
                    // Search Student
                    System.out.print("Enter Roll Number to Search: ");
                    int rollNumberToSearch = scanner.nextInt();
                    Student foundStudent = system.searchStudent(rollNumberToSearch);
                    if (foundStudent != null) {
                        System.out.println("Student Found: " + foundStudent.getName() + " (Grade: " + foundStudent.getGrade() + ")");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    // Display All Students
                    List<Student> allStudents = system.getAllStudents();
                    if (allStudents.isEmpty()) {
                        System.out.println("No students in the system.");
                    } else {
                        System.out.println("All Students:");
                        for (Student s : allStudents) {
                            System.out.println("Roll Number: " + s.getRollNumber() + ", Name: " + s.getName() + ", Grade: " + s.getGrade());
                        }
                    }
                    break;

                case 5:
                    // Save Data
                    system.saveData();
                    break;

                case 6:
                    // Exit the application
                    System.out.println("Exiting...");
                    system.saveData(); // Save data before exiting
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
