/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Program3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner console = new Scanner (System.in);
    
        
        System.out.println("============================================================");
           System.out.println("===================VOTING APPLICATION======================="+"\n");
           
        String names[] = {"Chadrac", "Smith", "John", "Jerome", "Lana", "Josh", "Chris", "Farai", "Aron", "Ester"};
        int votes[] = {45, 65, 21, 22, 67, 43, 28, 38, 72, 36};
        for (int i = 0; i <= names.length; i++) {
            System.out.println("Candidate: " + names[i] + "\n" + "Number of votes: " + votes[i] + "\n");
        }
        int sum = 0;
        for (int i : votes) {
            sum += i;

        }
        System.out.println("Sum of votes is: " + sum);

        System.out.println("=========================================================");
           System.out.println("=====================1 VOTE ADDED=======================");
           
           for (int i = 0; i < names.length; i++) {
               
            if (names[i]== "Smith") {
                votes[i] += 1;
                System.out.println("Candidate:" + names[i] + "\n" + "Votes updated: " + votes[i] + "\n");
                System.out.println("----------------------------------------------------------");
             
            }   
    }
    
}
}
