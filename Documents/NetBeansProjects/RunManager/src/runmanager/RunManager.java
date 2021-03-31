/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runmanager;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class RunManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kbd = new Scanner (System.in);
        
        Manager man1 = new Manager ();
        System.out.println(man1);
        
        System.out.println("------------------------------------------------------");
        System.out.print("Enter the department that the employee manages: ");
        String dept = kbd.next();
        man1.setDept(dept);
        
        System.out.println("Enter the performance Bonus: R ");
        double performanceBonus = kbd.nextDouble();
        man1.setPerformanceBonus(performanceBonus);
        System.out.println("-------------------------------------------------------");
        
        System.out.println(man1);
        System.out.println("-------------------------------------------------------");
        
        man1.displayDetails();
        System.out.println("-------------------------------------------------------");
        
        
    }
    
}
