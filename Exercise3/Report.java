
package trinhquanghuy_9694.lec11_Encapsulation.Exercise3;

public class Report implements Printable {
    private String title;
    public Report(String t){
        title =t;
    }   

    @Override
    public void print() {
        System.out.println("Report title:"+title);
    }
}
