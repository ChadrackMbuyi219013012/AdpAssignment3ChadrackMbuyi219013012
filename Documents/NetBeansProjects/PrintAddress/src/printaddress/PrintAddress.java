/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printaddress;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class PrintAddress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name:   ");
        String navn = in.nextLine();
        System.out.print("Enter address: ");
        String adres = in.nextLine();
        System.out.print("Enter zipcode: ");
        String postnr = in.nextLine();
        System.out.print("Enter town: ");
        String bynavn = in.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("=============================================");
        System.out.println("  Name:     " + navn);
        System.out.println("  Address:  " + adres);
        System.out.println("            " + postnr + " " + bynavn);
    }
    
}
