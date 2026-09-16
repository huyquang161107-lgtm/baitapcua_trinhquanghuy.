/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trinhquanghuy_9694.lec11_Encapsulation.Exercise4;

/**
 *
 * @author QUANG HUY
 */
public class Circle implements Colorable,Drawable {
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
    @Override
    public void fillcolor(){
        System.out.println("Filling color for the circle");
    }
}
