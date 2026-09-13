
package trinhquanghuy_9694.lec11_Encapsulation.AccessModifier.Exercise18;

public class Proccess {
    public static void main(String[] args) {
        Student student = new Student();

        student.addInfo();

        student.addGrade(8.0);
        student.addGrade(7.5);
        student.addGrade(9.0);
        student.addGrade(8.5);

        student.display();
    }
}
