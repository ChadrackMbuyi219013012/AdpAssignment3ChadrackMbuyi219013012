/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseorder2;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10 PRO
 */
public class ReverseOrder2 {

    
    public static void main(String[] args) 
    {
        Scanner console = new Scanner (System.in);
        //Program to read five numbers, find their sum, and print the numbers in the reverse order
        
        int item0, item1, item2, item3, item4;
        int sum;
        
        
        
        System.out.println("Please insert five integers:" );
        item0 = console.nextInt();
        item1 = console.nextInt();
        item2 = console.nextInt();
        item3 = console.nextInt();
        item4 = console.nextInt();
        
        sum = item0 + item1 + item2 + item3 + item4;
        
        System.out.println("The sum of the numbers = "+ sum);
        System.out.print("The numbers in reverse order are = ");
        System.out.print(item4 + " " + item3 + " " + item2 + " " + item1 + " " + item0 + " ");
        
        
        
    }
    
}
