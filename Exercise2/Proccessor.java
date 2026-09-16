
package trinhquanghuy_9694.lec11_Encapsulation.Exercise2;

public class Proccessor {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee("Nguyen Van A", 15000000);

        emp.displayInfo();
        System.out.println("Salary: " + emp.calculateSalary());
    }
}
