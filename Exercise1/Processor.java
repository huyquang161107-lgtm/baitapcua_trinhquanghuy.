/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trinhquanghuy_9694.lec08_ObjectAndClass.Exercise1;

/**
 *
 * @author QUANG HUY
 */
public class Processor {

    public static void main(String[] args) {
        Student student1 = new Student("abc1", "Nguyen Van Binh", "IT");
        Student student2 = new Student("abc2", "Nguyen Thi Binh", "HR");
        student1.displayInfo();
        student2.displayInfo();

        Student student3 = new Student();
        student3.enterInfo();
        student3.displayInfo();

        Student student4 = new Student();
        student4.enterInfo();
        student4.displayInfo();
    }
}
