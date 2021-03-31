/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;

import java.util.Scanner;

/**
 *
 * @author Chadrack Mbuyi
 */
public class Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loadCapacity, weight1, weight2, weight3;
        double sum;

        String item1, item2, item3, mass = "Kg";

        System.out.print("Please Enter the correct load capacity of the vehicle >>>");
        loadCapacity = input.nextInt();

        System.out.print("Enter the first item >>>");
        item1 = input.next();

        System.out.print("Mention the first item weight >>>");
        weight1 = input.nextInt();

        System.out.print("Enter the second item >>>");
        item2 = input.next();

        System.out.print("Mention the second item weight >>>");
        weight2 = input.nextInt();

        System.out.print("Enter the third item >>>");
        item3 = input.next();

        System.out.print("Mention the third item weight >>>");
        weight3 = input.nextInt();

        System.out.println("==========================================");

        sum = (weight1 + weight2 + weight3);
        System.out.println("Total weight of all items is >>>" + sum + mass);
        System.out.println("The first item" + " " + item1 + " " + "is weight:" + " " + weight1 + mass);
        System.out.println("The second item" + " " + item2 + " " + "is weight:" + " " + weight2 + mass);
        System.out.println("The third item" + " " + item3 + " " + "is weight:" + " " + weight3 + mass);

        if (sum <= loadCapacity) {
            System.out.println("The available weight capacity of the truck is >>>" + (loadCapacity - sum) + mass);
        } else 
            if (sum > loadCapacity) {
            System.out.println("The truck is completely overloaded!!");
            System.out.println("Release at least" + " " + (sum - loadCapacity) + mass + " " + "in order for you to drive well.");

        }

    }

}
