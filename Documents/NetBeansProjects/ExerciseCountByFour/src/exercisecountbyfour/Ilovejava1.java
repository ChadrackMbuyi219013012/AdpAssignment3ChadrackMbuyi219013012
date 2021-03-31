/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisecountbyfour;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Ilovejava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int number;
        
        System.out.println("Please enter a number between 1 - 10:");
        number = input.nextInt();
     
        while(number<11){
            System.out.println("I love Java"+number);
            number++;
        } 
        
            
        
         
         
       
        
    }
    
}
