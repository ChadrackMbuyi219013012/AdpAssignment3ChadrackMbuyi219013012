/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;
/**
 *
 * @author WINDOWS 10 PRO
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner kbd = new Scanner(System.in);
        int num1;
        int num2;
        double square;
        double answer;
        
                

        System.out.print("Please enter the number1: ");
        num1 = kbd.nextInt();
        System.out.print("Please enter the number2: ");
        num2 = kbd.nextInt();
        
        System.out.println("================================");

        if (num1 < num2) {
            square = (num1*num1);
            System.out.println(num1+"is smaller to"+num2);
            System.out.println("The answer is "+square);
        }
        if (num1 == num2){
            square = (num1*num1);
            System.out.println(num1+"is equal to"+num2);
            System.out.println("The answer is "+square);
        }else if (num1 > num2){
            answer = (num2*num2);
            System.out.println(num1+"is not small to"+num2);
            System.out.println("The answer is"+answer);
        }
    }
    
}
