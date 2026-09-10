
package trinhquanghuy_9694.lec08_ObjectAndClass.Exercise7;

public class pointCoordinate {
     private double x;
    private double y;

    public pointCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

}
