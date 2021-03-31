/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myexercises;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class MyExercises {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char letter = 'A';
        int var1, var2, var3, num;
        double total;
        String member1, member2, member3, member4, member5;
        member1 = "Ester";
        member2 = "Kaludji";
        member3 = "Cedric";
        member4 = "Chadrac";
        member5 = "Daniel";
        
        System.out.println("Please enter any number between 1 - 5");
        num = input.nextInt();
        
        switch (num)
        {
            case 1:
                System.out.println("The first born is"+" "+member1);
                break;
            case 2:
                System.out.println("The second born is"+" "+member2);
                break;
            case 3:
                System.out.println("The third born is"+" "+member3);
                break;
            case 4:
                System.out.println("The fourth born is"+" "+member4);
                break;
            case 5:
                System.out.println("The fifth born is"+" "+member5);
                break;
            default:
                System.out.println("The number entered is incorrect, fix please!");
                break;
        
        }
        
       
        
        System.out.print("Enter the first variable = ");
        var1 = input.nextInt();
        System.out.print("Enter the second variable = ");
        var2 = input.nextInt();
        System.out.print("Enter the third variable = ");
        var3 = input.nextInt();
        System.out.println("*******************************");
        
        total = ((var1 * var2)/var3);
        
        System.out.println("The outcome is ="+" "+total);
        
        while (letter <= 'Z'){
            System.out.println(letter +" "+"Succeed");
            letter++;
            
        
        }
        
       
        
    }
    
}
