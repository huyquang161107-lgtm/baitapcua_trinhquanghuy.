package trinhquanghuy_9694.lec08_ObjectAndClass.Exercise1;

import java.util.*;

public class Student {

    private String studentId;
    private String fullName;
    private String major;

    public Student() {

    }

    public Student(String studentId, String fullName, String major) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.major = major;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMajor() {
        return major;
    }

    public void displayInfo() {
        System.out.println("Student ID=" + getStudentId() + "Full Name=" + getFullName() + "Major=" + getMajor());
    }

    public void enterInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student id:");
        String studentId = scanner.nextLine();
        setStudentId(studentId);
        System.out.println("Enter full name:");
        setFullName(scanner.nextLine());
        System.out.println("Enter major:");
        setMajor(scanner.nextLine());
    }
}
