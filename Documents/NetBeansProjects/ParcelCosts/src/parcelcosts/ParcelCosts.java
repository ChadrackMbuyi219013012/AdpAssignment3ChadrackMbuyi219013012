/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcelcosts;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class ParcelCosts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        String mass, parcel;
        mass = "Kg";
        int weight;
        
        
        System.out.print("Please Enter the parcel description :");
        parcel = input.nextLine();
        System.out.print("Enter the weight of your parcel :");
        weight = input.nextInt();
        System.out.println("************************************");
        
        
        if (weight < 2){
        
            System.out.println("The item"+" "+parcel+" "+"will cost R10.00"+mass);
            System.out.println("Thank you");
        } else 
            if (weight < 4){
            
            System.out.println("The item"+" "+parcel+" "+"will cost R20.00"+mass);
            System.out.println("Thank you");
        } else 
            if (weight < 6){
            
            System.out.println("The item"+" "+parcel+" "+"will cost R30.00"+mass);
            System.out.println("Thank you");
        } else 
            if (weight == 6){
            
            System.out.println("The item"+" "+parcel+" "+"will cost R50.00"+mass);
            System.out.println("Thank you");
        } else {
            
             System.out.println("Invalid weight value – cannot proceed");
             System.out.println("Bye Bye");
        }
       
            
    
}
}
