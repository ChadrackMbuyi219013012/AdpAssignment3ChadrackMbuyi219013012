/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val1=10, val2=20, val3=30, sum;
        sum = val1+val2+val3;
        double avg=sum/3;
        System.out.println("The sum of "+val1+" "+val2+" "+val3+" = "+sum);
        System.out.println("Average = "+avg);
        
        double area, circ, radius = 4;
        area = Math.PI *Math.pow(radius, 2);
        circ = 2*Math.PI*radius;
        System.out.println("For Radius ="+radius+" The Area ="+area+" and Circumference = "+circ);
        System.out.printf("For radius = %.2f\n The Area = %.2f\n and Circumference = %.2f", radius, area, circ);
        
        double Pahrenheit, Kelsius = 20.0;
        Pahrenheit = Kelsius * 2 + 20/Kelsius;
        System.out.println("\n The Pahrenheit for "+Kelsius+" Kelsius = "+Pahrenheit);
        
        Scanner keyb = new Scanner(System.in);
        
        val1=0;
        System.out.println("Type in a value");
        val1 = keyb.nextInt();
        System.out.println(val1);
    }
    
}
