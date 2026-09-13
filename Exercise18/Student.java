
package trinhquanghuy_9694.lec11_Encapsulation.AccessModifier.Exercise18;
import java.util.*;
public class Student {
    String id;
    String name;
    ArrayList<Double> grades;

    void addGrade(double grade) {
        grades.add(grade);
    }

    double getAverage() {
        if (grades.size() == 0) {
            return 0;
        }

        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);

        System.out.println("Grades:");
        for (double grade : grades) {
            System.out.println(grade);
        }

        System.out.println("Average: " + getAverage());
    }

    void addInfo() {
        id = "9694";
        name = "Trinh Quang Huy";
        grades = new ArrayList<>();
    }
}
