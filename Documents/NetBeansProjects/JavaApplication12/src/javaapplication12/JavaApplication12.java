/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;


import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner in  = new Scanner(System.in);
        //declare mark for student
        float mark;
        
        // input mark
        System.out.println("Please enter Mark:");
        //get value from the cursor
        mark = in.nextFloat();
        
        //validate Mark
         if (mark < 48)
             System.out.println("FAIL");
         else
             if (mark >=48 && mark <50)
                 System.out.println("Promoted to PASS");
             else 
                 if(mark >= 50 && mark <75)
                     System.out.println("PASS");
                 else 
                     if(mark <=100)
                        System.out.println("PASS with distinction");
                     else 
                         System.out.println("Out of range");
                 
        
    }
    
}
