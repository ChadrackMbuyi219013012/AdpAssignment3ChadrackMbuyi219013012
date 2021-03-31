/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmm1;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Programmm1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int loadCapacity, weight1, weight2, weight3;
        double total;

        String item1, item2, item3, mass = "Kg";

        System.out.print("PLEASE ENTER THE LOAD CAPACITY OF THE VEHICLE:");
        loadCapacity = input.nextInt();

        System.out.print("PLEASE INSERT FIRST ITEM:");
        item1 = input.next();

        System.out.print("Add the weight for item1:");
        weight1 = input.nextInt();

        System.out.print("PLEASE INSERT SECOND ITEM:");
        item2 = input.next();

        System.out.print("Add the weight for item2:");
        weight2 = input.nextInt();

        System.out.print("PLEASE INSERT THIRD ITEM:");
        item3 = input.next();

        System.out.print("Add the weight for item3:");
        weight3 = input.nextInt();

        System.out.println("--------------------------------------------");

        total = (weight1 + weight2 + weight3);
        System.out.println("Total weight of your items is =" + total + mass);
        System.out.println("The item" + " " + item1 + " " + "is weight:" + " " + weight1 + mass);
        System.out.println("The item" + " " + item2 + " " + "is weight:" + " " + weight2 + mass);
        System.out.println("The item" + " " + item3 + " " + "is weight:" + " " + weight3 + mass);

        if (total <= loadCapacity) {
            System.out.println("The available load capacity of the truck is =" + (loadCapacity - total) + mass);
        } else 
            if (total > loadCapacity) {
            System.out.println("Attention Graziella! Your truck is overloaded");
            System.out.println("Remove in total" + " " + (total - loadCapacity) + mass + " " + "to have a balance.");

        }
    }
    
}
