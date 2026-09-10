package trinhquanghuy_9694.lec08_ObjectAndClass.Exercise2;

import java.util.*;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {

    }

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public void displayInfo() {
        System.out.println("AREA:" + getLength() + "*" + getWidth());
    }

    public void enterInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length:");
        Double length = scanner.nextDouble();
        setLength(length);
        System.out.print("Enter width:");
        Double width = scanner.nextDouble();
        setWidth(scanner.nextDouble());
    }
}
