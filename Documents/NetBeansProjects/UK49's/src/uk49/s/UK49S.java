/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk49.s;

import java.util.Random;
/**
 *
 * @author WINDOWS 10 PRO
 */
public class UK49S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random ();
        
        int numbers []= new int[8];
        
        for (int list=1;list<49;list++){
            
            ++numbers[1+rand.nextInt(7)];
        
        }
        System.out.println("List\tNumbers" );
        
        for (int list=1;list<numbers.length;list++){
            
            System.out.println(list + "\t" + numbers[list]);
        
        }
        
    }
    
}
