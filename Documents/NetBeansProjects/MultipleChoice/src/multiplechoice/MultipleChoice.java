/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplechoice;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class MultipleChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        char choice;
        
        
        System.out.println("\nWhat is the correct way to declare a variable to store a double value in Java?");
        System.out.println("\n\ta. Double num = 20;");
        System.out.println("\tb. double 1stnum = 20;");
        System.out.println("\tc. double num = 20;");
        System.out.println("\td. double num = '20';");
        System.out.println("==================================");
        System.out.println("\nEnter your choice: ");
        choice = input.nextLine().charAt(0);
        
        switch (choice)
        {
            case 'a':
            case 'A':
                System.out.println("a. Double num = 20;");
                System.out.println("Incorrect. Variable double must always start in lower case d");
                break;
            case 'b':
            case 'B':
                System.out.println("b. double 1stnum = 20;");
                System.out.println("Incorrect. Variable identifier cannot start with a number.");
                break;
            case 'c':
            case 'C':
                System.out.println("c. double num = 20;");
                System.out.println("Correct. Well Done!!!");
                break;
            case 'd':
            case 'D':
                System.out.println("d. double num = '20';");
                System.out.println("Incorrect. The assigned value of the variable double cannot have single quote as char values");
                break;
            default:
                System.out.println("Wrong choice. Bye bye!");
                break;
        }
        System.out.println("Switch done.");
        
    }
    
}
