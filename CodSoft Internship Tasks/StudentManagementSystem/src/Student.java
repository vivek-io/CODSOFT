import java.io.Serializable;

// This class is representing the student management system application
class Student implements Serializable {

    // This is used for student role number
    private int rollNumber;

    // This is used for student's name.
    private String name;

    // This is used for student's grade.
    private String grade;

    // Constructor to create a new Student object.
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    // Getters for the student's roll number, name, and grade.
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}
