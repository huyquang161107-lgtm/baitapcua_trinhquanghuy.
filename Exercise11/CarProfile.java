
package trinhquanghuy_9694.lec11_Encapsulation.AccessModifier.Exercise11;

public class CarProfile {
    String make;
    String model;
    int year;

    void addProfile(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayProfile() {
        System.out.println("Car Profile");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}
