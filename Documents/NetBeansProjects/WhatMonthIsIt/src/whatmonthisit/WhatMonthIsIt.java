/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatmonthisit;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class WhatMonthIsIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int num;
        
        System.out.println("\t What month is it?");
        System.out.println("Please enter any month number between 1-12:");
        num = input.nextInt();
        
        switch (num)
        {
            case 1:
                System.out.println("January is the first month of the year");
                break;
            case 2:
                System.out.println("February is the second month of the year");
                break;
            case 3:
                System.out.println("March is the third month of the year");
                break;
            case 4:
                System.out.println("April is the fourth month of the year");
                break;
            case 5:
                System.out.println("May is the fifth month of the year");
                break;
            case 6:
                System.out.println("June is the sixth month of the year");
                break;
            case 7:
                System.out.println("July is the seventh month of the year");
                break;
            case 8:
                System.out.println("August is the eighth month of the year");
                break;
            case 9:
                System.out.println("September is the ninth month of the year");
                break;
            case 10:
                System.out.println("October is the tenth month of the year");
                break;
            case 11:
                System.out.println("November is the eleventh month of the year");
                break;
            case 12:
                System.out.println("December is the twelfth month of the year");
                break;
            default :
                System.out.println("Not a month number, Mr Smarty pants!");
                break;
        }
        System.out.println("Switch done.");
    }
    
}
