/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedinglimit;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Speedinglimit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double speedLimit, speedVehicle, fine;
        String speed = "Km/h";
        String currency = "R";
        
        
        System.out.print("Please enter the Speed Limit : ");
        speedLimit = input.nextDouble();
        System.out.print("Please enter the Speed of the vehicle :");
        speedVehicle = input.nextDouble();
        
        System.out.println("====================================");
        System.out.println("=============RESULT=================");
        System.out.println("====================================");
        
        System.out.println("The road average speed limit is :" + speedLimit + speed);
        System.out.println("Your vehicle speed is :" + speedVehicle + speed);
        
        if (speedVehicle>speedLimit){
            fine = (speedVehicle - speedLimit)*0.20;
            System.out.println("This is your total fine : " + currency + fine);
            
        } else {
            
            System.out.println("Your vehicle is on the right running speed");
            System.out.println("Have a safe journey!");
        
        }
        
        
    }
    
}
