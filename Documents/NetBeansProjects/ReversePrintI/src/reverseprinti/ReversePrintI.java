/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseprinti;
import java.util.*;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class ReversePrintI {
    
    static Scanner console = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] items = new int[5];
        int sum;
        
        System.out.println("Enter five integers");
        
        sum = 0;
        
        for (int counter=0; counter <items.length; counter++)
        {
            items[counter] = console.nextInt();
            sum = sum + items[counter];
        }
        System.out.println("The sum of the numbers = " + sum);
        System.out.println("The numbers in the reverse " + "order are: ");
        
        //Print the numbers in the reverse order
        
        for (int counter = items.length-1; counter >=0; counter--)
            
            System.out.println(items[counter] + " ");
        
        System.out.println();
         
    }
    
}
