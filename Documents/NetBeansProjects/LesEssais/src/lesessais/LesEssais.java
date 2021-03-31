/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesessais;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class LesEssais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String answer1, answer2, answer3, answer4, answer5, answer6, result1, result2, result3;
        answer1 = "Yes";
        answer2 = "Yes";
        answer3 = "Yes";
        answer4 = "Yes";
        answer5 = "Yes";
        answer6 = "Yes";
        
        
        
        
        System.out.println("Do you a dry have cough?");
        System.out.println("Please tap Yes or No");
        answer1 = input.next();
        
        System.out.println("Do you have a fever?");
        System.out.println("Please tap Yes or No");
        answer2 = input.next();
        
        System.out.println("Do you have diarrhea?");
        System.out.println("Please tap Yes or No");
        answer3 = input.next();
        
        System.out.println("Do you have a body sore?");
        System.out.println("Please tap Yes or No");
        answer4 = input.next();
        
        System.out.println("Do you have a headache?");
        System.out.println("Please tap Yes or No");
        answer5 = input.next();
        
        System.out.println("Do you have a difficult breathing?");
        System.out.println("Please tap Yes or No");
        answer6 = input.next();
        
        if (answer1 == answer2){
            result1 = (answer1+answer2+answer5+answer6);
            System.out.println("High risk of having COVID-19");
            System.out.println("Please contact you doctor and try to isolate yourself away from your family or friends");
            System.out.println("Do not panic!");
        }
        
        
        
    }
    
}
