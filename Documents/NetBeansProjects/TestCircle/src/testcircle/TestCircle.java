/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcircle;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Circle circle = new Circle(20);
        System.out.println("The area of the circle is : " + circle.area() );
        System.out.println("The circumference of the circle is : " + circle.circumference());
    }
    
}
