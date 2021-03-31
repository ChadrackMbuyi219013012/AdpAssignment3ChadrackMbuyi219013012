/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10 PRO
 */
public class JavaApplication16 {
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        
        System.out.print("Please insert num1:");
        num1 = input.nextInt();
        System.out.print("Please insert num2:");
        num2 = input.nextInt();
        System.out.print("Please insert num3:");
        num3 = input.nextInt();
        
        System.out.println("===================================");
        
        if(num1 >= num2 && num1 >=num3){
            System.out.println(num1+" "+"is greater than "+num2+" "+"and"+" "+num3);
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2+" "+"is greater than "+num1+" "+"and"+" "+num3);
        }
        else if(num3 >= num1 && num3 >= num2){
            System.out.println(num3+" "+"is greater than "+num1+" "+"and"+" "+num2);
        }
                    
        
        
        
        
        
        
        
        
     
        
        
    }
    
}
