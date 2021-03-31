/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vatcalculation;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class VATcalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double price, vat;
        
        
        System.out.println("Please Enter a price: ");
        price = input.nextDouble();
        vat = price * .15;
        System.out.println("The price entered is " + price);
        
        System.out.println("The VAT amount of the price is " + vat);
        
    }
    
}
