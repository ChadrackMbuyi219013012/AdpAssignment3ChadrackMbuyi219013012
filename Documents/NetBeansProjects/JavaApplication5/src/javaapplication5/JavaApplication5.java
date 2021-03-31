/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class JavaApplication5 
{
    
    public static void main(String[] args) 
    {
        String mess1, mess2, mess3;
        mess1 = "Hello";
        //       01234
        mess2 = "my Friend";
        mess3 = "Chad";
        double dnum = 3.14;
        char lettl='G';
        
        
        System.out.printf("%s %s %s\n", mess1, mess2,mess3);
        System.out.println(mess1+" "+mess1.toLowerCase());
        System.out.println(mess1.substring(1, 3));
        System.out.println("The length is:"+mess1.length());
        System.out.println("The length is:"+mess1.charAt(3));
        System.out.println("The Double number is:"+dnum+" "+dnum);
        System.out.println("The Double number is:"+(dnum+dnum));
        System.out.printf("The Double number is: %.2f",dnum);
        mess1 = mess1+lettl; //Hello + G
        
        
    
    }//End of the main method
    
}//End of the main class
