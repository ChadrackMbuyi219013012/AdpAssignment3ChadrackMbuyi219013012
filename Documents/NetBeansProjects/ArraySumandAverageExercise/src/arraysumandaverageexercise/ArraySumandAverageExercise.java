/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysumandaverageexercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class ArraySumandAverageExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val1, val2, val3, val4, val5;
        int average=0;
        int sum=0;
        
           
        System.out.println("Please Enter the value 1 of the price : ");
        val1 = input.nextInt();
        System.out.println("Please Enter the value 2 of the price : ");
        val2 = input.nextInt();
        System.out.println("Please Enter the value 3 of the price : ");
        val3 = input.nextInt();
        System.out.println("Please Enter the value 4 of the price : ");
        val4 = input.nextInt();
        System.out.println("Please Enter the value 5 of the price : ");
        val5 = input.nextInt();
        
        int price[] = {val1,val2,val3,val4,val5};
        System.out.println("Index"+"\t"+"Price");
        
        for (int counter=0;counter<price.length;counter++){
            
            System.out.println(counter + "\t" + price[counter]);
            sum+= price[counter];
            average = sum/price.length;
        }
        System.out.println("The sum of these values is " + sum);
        System.out.println("The average of these values is " + average);
        
        
        
        
        
        
        
    }
    
}
