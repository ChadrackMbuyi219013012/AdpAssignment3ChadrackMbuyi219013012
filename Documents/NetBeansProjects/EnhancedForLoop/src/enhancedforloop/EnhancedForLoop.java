/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enhancedforloop;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class EnhancedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
    }
    
}
