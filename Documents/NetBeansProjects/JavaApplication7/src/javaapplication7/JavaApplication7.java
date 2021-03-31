/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //The perimeter of a rectangle
       
        double area;
        double perimeter;
        double length= 10.5;
        double width= 5.4;
        
        
        area= length*width;
        perimeter= (length*2)+(width*2);
        
        System.out.println("This is the rectangle perimeter = "+perimeter);
        System.out.println("This is the area of a rectangle = "+ area);
        System.out.println("**************************************");
        //The perimeter of a square
        double perimeter2;
        double length2= 2.5;
        
        perimeter2 = 4*length2;
        
        System.out.println("This is the square perimeter= "+perimeter2);
        
        //Write a program that converts temperature according to the following silly rules.
        //You have two temperature types, namely Kelsius and Pahreinheit.
        
        int kelsius=29;
        int pahreinheit;
        
        pahreinheit= kelsius*22;
    
        System.out.println("Kelsius temperature is = "+kelsius);
        System.out.println("Pahreinheit temperature is = "+pahreinheit);
        
 
    }
    
}
