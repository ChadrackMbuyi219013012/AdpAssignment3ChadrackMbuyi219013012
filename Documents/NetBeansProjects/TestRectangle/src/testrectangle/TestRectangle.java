/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrectangle;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class TestRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.show();
        System.out.println("Area is " + rectangle.calculateArea() );
        System.out.println("Circumference is " + 
                rectangle.calculateCircumference());
    }
    
}
