/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Calculate the sum and average 
        Scanner smith = new Scanner(System.in);
        int pc1, pc2, pc3;
        int sum;
        double average;
        System.out.println("Enter Personal Computer 1 value:");
        pc1 = smith.nextInt();
        
        System.out.println("Enter Personal Computer 2 value:");
        pc2 = smith.nextInt();
        
        System.out.println("Enter Personal Computer 3 value:");
        pc3 = smith.nextInt();
        
        System.out.println("===========================================");
        
        sum = (pc1 + pc2 + pc3);
        average = sum/3;
        
        System.out.printf("%s %s %s\n",pc1,pc2,pc3);
        System.out.println("The sum of the three values is:"+" "+sum);
        System.out.println("The average of the values:" + average);
        
       
        
        
        
        
        
               
       
        
        
        
        
       
        
    }
    
}
