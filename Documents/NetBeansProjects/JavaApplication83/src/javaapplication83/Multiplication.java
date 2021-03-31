/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication83;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("MULTIPLICATION TABLE UP UNTIL 10");
        System.out.println("================================");
        System.out.println("Please Enter a number: ");
        
        int number = input.nextInt();
        int sum=0;
        
        for (int counter=1;counter<11;++counter){
            
            sum = (number*counter);
            System.out.println(number +" "+ "x" +" "+ counter +" "+ "=" +" "+ sum);
            
        }
        
        System.out.println("Code by Chad Smith"); 
        
    }
}

    
