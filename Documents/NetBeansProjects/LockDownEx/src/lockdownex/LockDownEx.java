/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockdownex;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class LockDownEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int radius;
        double Area,Circumference,Diameter;
        
        // Area formula is A= pi*radius*radius
        System.out.println("Enter the value of your Radius:");
        radius = scn.nextInt();
        
        Area = Math.PI * Math.pow(radius, 2);
        Circumference = 2 * Math.PI * radius;
        Diameter = 2 * radius;
        
        
        System.out.println("This is the area of a circle:"+Area);
        System.out.println("This is the circumference of a circle:"+Circumference);
        System.out.println("This is the diameter of a circle:"+Diameter);
                
    }
    
}
