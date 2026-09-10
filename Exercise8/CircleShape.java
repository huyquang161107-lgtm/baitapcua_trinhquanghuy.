
package trinhquanghuy_9694.lec08_ObjectAndClass.Exercise8;

public class CircleShape {
    double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
