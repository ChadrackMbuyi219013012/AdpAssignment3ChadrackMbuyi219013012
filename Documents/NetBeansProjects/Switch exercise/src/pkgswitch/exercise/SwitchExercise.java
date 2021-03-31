/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch.exercise;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class SwitchExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner (System.in);
        int month;
        String season1, season2, season3, season4;
        season1 = "Summer";
        season2 = "Autumn";
        season3 = "Winter";
        season4 = "Spring";
               
        
        System.out.println("Please enter a number between 1 - 12");
        month = scn.nextInt();
        
        switch (month) 
        {
            case 1:
                System.out.println("January is in"+" "+season1+" "+"season");
                System.out.println("January is the first month of the year");
                 break;
            case 2:
                System.out.println("February is in"+" "+season1+" "+"season");
                System.out.println("February is the second month of the year");
                 break;
            case 3:
                System.out.println("March is in"+" "+season2+" "+"season");
                System.out.println("March is the third month of the year");
                 break;
            case 4:
                System.out.println("April is in"+" "+season2+" "+"season");
                System.out.println("April is the fourth month of the year");
                 break;
            case 5:
                System.out.println("May is in"+" "+season2+" "+"season");
                System.out.println("May is the fifth month of the year");
                 break;
            case 6:
                System.out.println("June is in"+" "+season3+" "+"season");
                System.out.println("June is the sixth month of the year");
                 break;
            case 7:
                System.out.println("July is in"+" "+season3+" "+"season");
                System.out.println("July is the seventh month of the year");
                 break;
            case 8:
                System.out.println("August is in"+" "+season3+" "+"season");
                System.out.println("August is the eighth month of the year");
                 break;
            case 9:
                System.out.println("September is in"+" "+season4+" "+"season");
                System.out.println("September is the nineth month of the year");
                 break;
            case 10:
                System.out.println("October is in"+" "+season4+" "+"season");
                System.out.println("October is the tenth month of the year");
                 break;
            case 11:
                System.out.println("Novermber is in"+" "+season1+" "+"season");
                System.out.println("November is the eleventh month of the year");
                 break;
            case 12:
                System.out.println("December is in"+" "+season1+" "+"season");  
                System.out.println("December is the twelfth month of the year");
                 break;
            default :
                System.out.print("Please enter one of the letter specified above");
                 break;
        }
        
    }
    
}
