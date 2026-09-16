
package trinhquanghuy_9694.lec11_Encapsulation.Exercise2;

public class FullTimeEmployee extends Employee {
    private double salary;
    public FullTimeEmployee(String name,double salary){
        super(name);
        this.salary=salary;
    }
    public double calculateSalary(){
        return salary;
    }
}
