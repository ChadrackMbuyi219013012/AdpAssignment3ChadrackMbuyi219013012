/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keypressvalidation;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class KeyPressValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int num;
        
        System.out.println("Please enter a number between 0 - 9");
        num = input.nextInt();
        
        switch (num)
        {
            case 1:
                System.out.println("Number valid");
                break;
            case 2:
                System.out.println("Number valid");
                break;
            case 3:
                System.out.println("Number valid");
                break;
            case 4:
                System.out.println("Number valid");
                break;
            case 5:
                System.out.println("Number valid");
                break;
            case 6:
                System.out.println("Number valid");
                break;
            case 7:
                System.out.println("Number valid");
                break;
            case 8:
                System.out.println("Number valid");
                break;
            case 9:
                System.out.println("Number valid");
                break;
            default:
                System.out.println("Not allowed");
                break;
        
        }
    }
    
}
