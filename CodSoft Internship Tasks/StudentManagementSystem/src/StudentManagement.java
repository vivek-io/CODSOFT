import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {

    // A list of all students in the system.
    private List<Student> students = new ArrayList<>();

    // The path to the file where student data is saved and loaded from.
    private static final String DATA_FILE = "students.dat";

    // Adds a new student to the system.
    public void addStudent(Student student) {
        students.add(student);
    }

    // Removes a student from the system by their roll number.
    public void removeStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    // Searches for a student in the system by their roll number and returns them if found.
    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null; // Student not found
    }

    // Returns a list of all students in the system.
    public List<Student> getAllStudents() {
        return students;
    }

    // Saves all student data to the data file.
    public void saveData() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            outputStream.writeObject(students);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    // Loads all student data from the data file.
    public void loadData() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            students = (List<Student>) inputStream.readObject();
            System.out.println("Data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading data: " + e.getMessage());
        }
    }
}
