/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esaycalculator;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class EsayCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //declare variable num1, num2, result and operator
        int num1, num2;
        double result;
        String operator;
        //input num1
        System.out.print("Please enter the first number:");
        num1 = input.nextInt();
        //input num2
        System.out.print("Please enter the second number:");
        num2 = input.nextInt();
        
        System.out.print("Please enter the operator: a(addition), e(power of), m(multiply), d(divise), r(remainder), s(substraction), i(circonference), c(compare) ");
        operator = input.next();
        
            switch (operator.charAt(0))
            {
                case 'm':
                case 'M': result = num1 * num2;
                          System.out.print("The multiplication of num1:"+num1 + " and num 2: "+ " is " +result);
                break;
                case 's': 
                case 'S': result = num1 - num2;
                          System.out.print("The substraction of num1:"+num1 + " and num 2: "+ " is " +result);
                break;
                case 'd': 
                case 'D': result = num1 / num2;
                          System.out.print("The division of num1:"+num1 + " and num 2: "+ " is " +result);
                break;
                case 'a':
                case 'A': result = num1 + num2;
                          System.out.print("The addition of num1:"+num1 + " and num 2: "+ " is " +result);
                break;
                case 'r': 
                case 'R': result = num1 % num2;
                          System.out.print("The remainder of num1:"+num1 + " and num 2: "+ " is " +result);
                break;
                case 'e': 
                case 'E': result = Math.pow(num1, num2);
                          System.out.print("The power of num1:"+num1 + " and num 2: "+ " is " +result);
                break;
                case 'c': 
                case 'C': if(num1>num2)
                            System.out.print("First number"+" "+num1+" "+"is greater than Second number"+" "+ num2);
                          else
                                if(num1<num2)
                                  System.out.print("First number"+" "+num1+" "+"is less than Second number"+" "+ num2);
                                else
                                  System.out.print("First number"+" "+num1+" "+"is equal to the second number"+" "+ num2);
                break;
                case 'i': 
                case 'I': result = Math.PI * Math.pow(num1, 2);
                          System.out.print("The circonference of a circle with a radius of"+num1 + " and num 2: "+" is " +result);
                break;
                
                default :
                        System.out.print("Please enter one of the letter specify above");
                        break;
                    
            }
                
    }
    
}
