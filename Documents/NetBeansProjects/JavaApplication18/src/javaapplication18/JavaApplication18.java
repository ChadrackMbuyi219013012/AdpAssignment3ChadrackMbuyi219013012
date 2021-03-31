/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     * 
     *
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        String studentName;
        int mark1, mark2, mark3, sum, remainder;
        double average;
        
        //please enter student Name
        System.out.print("Please enter student name:");
        studentName = keyboard.next();
        
        //Please enter student marks
        System.out.println("Please enter mark1:");
        mark1 = keyboard.nextInt();
        
        System.out.println("Please enter mark2:");
        mark2 = keyboard.nextInt();
        
        System.out.println("Please enter mark3:");
        mark3 = (int)keyboard.nextFloat();
        
        //Calcute sum, average, remainder
        sum = mark1 + mark2 + mark3;
        
        average = (double)sum/3;
        
        remainder = sum % 3;
        
        //display student name and mark
        
        System.out.println("The student name is: " + studentName);
        System.out.println("The student mark 1 is: " + mark1);
        System.out.println("The student mark 2 is: " + mark2);
        System.out.println("The student mark 3 is: " + mark3);
        System.out.println("The student sum mark is: " + sum);
        System.out.println("The student average mark is: " + average);
        System.out.println("The remainder is: " + remainder);
        
        
        
        
        
    }
    
}
