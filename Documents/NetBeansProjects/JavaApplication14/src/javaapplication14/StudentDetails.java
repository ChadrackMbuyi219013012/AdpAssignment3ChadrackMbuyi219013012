/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class StudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        String first_name, surname, university;
        int  stnb, term1, term2, term3, term4;
        double mark;
        
        System.out.println("Please Enter the Institution or College: ");
        university = scn.nextLine();
        
        System.out.println("Please Enter the Student First name: ");
        first_name = scn.nextLine();
        
        System.out.println("Please Enter the Student Surname");
        surname = scn.nextLine();
        
        System.out.println("Please Enter the Student number: ");
        stnb = scn.nextInt();
        
        System.out.println("Please enter mark for term1 =");
        term1 = scn.nextInt();
        
        System.out.println("Please enter mark for term2 =");
        term2 = scn.nextInt();
        
        System.out.println("Please enter mark for term3 =");
        term3 = scn.nextInt();
        
        System.out.println("Please enter mark for term4 =");
        term4 = scn.nextInt();
        
        mark = (term1 * 15 + term2 * 30 + term3 * 25 + term4 * 30) / 100;
        
        //Term1 weighs 15%
        //Term2 weighs 30%
        //Term3 weighs 25%
        //Term4 weighs 30%
        
        
        System.out.println("=================================");
        System.out.println("\nInstitution: " + university);
        System.out.println("Student First name: " + first_name);
        System.out.println("Student Surname" + surname);
        System.out.println("Student Number: " + stnb);
        System.out.println("Term1 result: " + term1);
        System.out.println("Term2 result: " + term2);
        System.out.println("Term3 result: " + term3);
        System.out.println("Term4 result: " + term4);
        System.out.println("**********************************");
        System.out.println("The final average mark of the subject is: " + mark + "%");
        
        System.out.println("**********************************");
        
        if (mark>=75){
            System.out.println("You have passed with a distinction. Congratulations " + surname + "!!");
        
        }else 
            {
                if (mark>=50){
                    System.out.println("You have passed normally the subject. Well done " + surname);
                
                }else 
                    {
                    System.out.println("You have failed the subject. Sorry " + surname + "!!");
            
                }                    
            }

    }
}
