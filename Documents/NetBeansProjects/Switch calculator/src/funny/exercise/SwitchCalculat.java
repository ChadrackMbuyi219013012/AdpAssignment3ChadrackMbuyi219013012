/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funny.exercise;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class SwitchCalculat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner kbd = new Scanner (System.in);
        int num1, num2;
        double result;
        String operator;
        
        System.out.println("Please Enter the first number");
        num1 = kbd.nextInt();
        System.out.println("Please Enter the second number");
        num2 = kbd.nextInt();
        System.out.print("Please select the operator: (A) addition, (S) subtraction, (M) multiplication, (D) division >>> ");
        operator = kbd.next();
        
        switch (operator.charAt(0))
        {
            case 'a':
            case 'A': result = num1 + num2;
                      System.out.println("The addition of the first number"+" "+num1+" "+"and the second number"+" "+num2+" "+"is:"+" "+result);
            break;
            case 's':
            case 'S': result = num1 - num2;
                      System.out.println("The subtraction of the first number"+" "+num1+" "+"and the second number"+" "+num2+" "+"is:"+" "+result);
            break;
            case 'm':
            case 'M': result = num1 * num2;
                      System.out.println("The multiplication of the first number"+" "+num1+" "+"and the second number"+" "+num2+" "+"is:"+" "+result);
            break;
            case 'd':
            case 'D': result = num1 / num2;
                      System.out.println("The division of the first number"+" "+num1+" "+"and the second number"+" "+num2+" "+"is:"+" "+result);
            break;
            default:
                System.out.println("Please enter the specific character above. Thank you");
            break;
        }
        System.out.println("Switch done!!");
            
        
       
        
        
    }
    
}
