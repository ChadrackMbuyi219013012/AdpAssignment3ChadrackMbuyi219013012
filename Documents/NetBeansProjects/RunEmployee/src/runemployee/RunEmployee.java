/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runemployee;

import java.util.*;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class RunEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner kbd = new Scanner (System.in);
        
        Employee emp1 = new Employee( );
        System.out.println(emp1);
        System.out.println("---------------------------------------");
        
        System.out.print("Please Enter Employee number >> ");
        int empNr = kbd.nextInt();
        System.out.print("Please Enter Surname of employee >> ");
        String surname = kbd.next();
        System.out.print("Please Enter Employee salary >> R");
        double salary = kbd.nextDouble();
        
        Employee emp2 = new Employee(empNr, surname, salary);
        System.out.println("---------------------------------------");
        System.out.println(emp2);
        
        System.out.println("---------------------------------------");
        emp2.displayDetails();
        System.out.println("---------------------------------------");
        
        
        
        
        
        
    }
    
}
