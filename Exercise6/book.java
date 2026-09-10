
package trinhquanghuy_9694.lec08_ObjectAndClass.Exercise6;

public class book {
    private String title;
    private String author;
    private double price;

    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookInfo() {
        System.out.println(title + " | " + author + " | " + price);
    }

}
