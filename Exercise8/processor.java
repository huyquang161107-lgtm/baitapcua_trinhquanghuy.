
package trinhquanghuy_9694.lec08_ObjectAndClass.Exercise8;

public class processor {
    public static void main(String[] args) {
    CircleShape circle = new CircleShape(4);

        System.out.println("Radius: " + circle.radius);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
