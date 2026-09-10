
package trinhquanghuy_9694.lec08_ObjectAndClass.Exercise6;

public class processor {
    public static void main(String[] args) {

        book book1 = new book("Clean Code", "Robert C. Martin", 25.0);
        book book2 = new book("Effective Java", "Joshua Bloch", 30.0);

        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
