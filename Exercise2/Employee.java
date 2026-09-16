
package trinhquanghuy_9694.lec11_Encapsulation.Exercise2;

public abstract class Employee {
    protected String name;
    
    public Employee(String name){
        this.name=name;
    }
    public void displayInfo(){
        System.out.println("Name:"+ name);
    }
    public abstract double calculateSalary();
}
