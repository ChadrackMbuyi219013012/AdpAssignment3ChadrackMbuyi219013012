/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class JavaApplication3 {

    public static void main(String[] args) 
    {
        boolean  IsSouthAfricaacountry =true;
        boolean IsSouthAfricaacity=false;
        int test= 5;
        int age = 45;
        int girls, boys, people;
            girls = 15;
            boys = 25;
            people = girls + boys;
        int num1 = 10;
        int num2 = 20;
        String a = "Hello";
        String b = "my friend";
        double first_number, second_number, answer;
               first_number = 14.5;
               second_number = 16.5;
               answer = first_number + second_number;
        char character;
        
        character = 'A';
        
        System.out.print(character);
        
        character ++;
        
        System.out.println(character);
        
        System.out.println(a+" "+b);
        //The following output is:10 1020
        System.out.println(num1+" "+num1+num2);
        //The following output is: 30
        System.out.println(num1+num2);
        //The following output is: 10 2030
        System.out.println(num1+" "+num2+(num1+num2));
        //The following output is: 10 201020
        System.out.println(num1+" "+num2+num1+num2);
        System.out.println("The sum of:"+num1+" + "+num2+" = "+(num1+num2));
        //**********************************************************************
        System.out.println("*************************");
        System.out.print("The sum of:");
        System.out.print("10 + ");
        System.out.print("20 = ");
        System.out.println("30");
        //**********************************************************************
        System.out.println("*************************");
        System.out.printf("%S %d + %d = %d\n","The sum of:", num1 ,num2, (num1+num2));
        System.out.println("*************************");
                
        
        System.out.println(people);
        System.out.println(IsSouthAfricaacountry);
        System.out.println(IsSouthAfricaacity);
        System.out.println("Chadrack Mbuyi Kalala");
        System.out.println("Complex Scolaire Amis du Christ");
        System.out.println("    *       *       *");
        System.out.println("   * *     * *     * *");
        System.out.println("  * * *   * * *   * * *");
        System.out.println(" * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * *");
        
        if (test > 5) {
            System.out.println("Yes");}
        else {
            System.out.println("This is else");
        if (age > 60) {
            System.out.println("You are the biggest madala");}
        else {
            System.out.println("You are a young dick");
            
        }
        }
    }//End of main method 
    
}//End of main class
