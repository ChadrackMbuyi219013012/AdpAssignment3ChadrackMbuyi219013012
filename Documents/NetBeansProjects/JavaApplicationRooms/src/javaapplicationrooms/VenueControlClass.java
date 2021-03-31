 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationrooms;
import java.util.*;

/**
 *
 * @author CHADRACK MBUYI
 */
public class VenueControlClass 
{
    Venue [] ven=new Venue [20];
    int numOFVenue= 0;
    
    public VenueControlClass ()
    {
    ven [0]=new Venue("Engineering","2.7",8);
    ven [1]=new Venue("Engineering","2.7",8);
    ven [2]=new Venue("Engineering","2.7",8);
    ven [3]= new ComputerLab("Engineering","2.4",8,9);
    ven [4]= new ComputerLab("Engineering","2.4",8,9);
    ven [5]= new ComputerLab("Engineering","2.4",8,9);
     
    int numOFVenue= 6;
    
    }
    public int menu()
    {
    Scanner kbd = new Scanner(System.in);
    int option ; 
        System.out.println("1: Add room");
        System.out.println("2: Display room");
        System.out.println("3: Display problem Labs");
        System.out.println("4: Exit");
        option =kbd.nextInt();
        return option;
    }
    public Venue createVenue()
    {
     Scanner kbd = new Scanner(System.in);
     String buildingName,venueNumber;
     int numberSeat;
        System.out.println("Please enter the name of the building: ");
        buildingName= kbd.next();
        System.out.println("Please enter the venue number of the building: ");
        venueNumber=kbd.next();
        System.out.println("Please enter the seat number: ");
        numberSeat=kbd.nextInt();
        Venue ven = new Venue(buildingName,venueNumber,numberSeat);
        return ven;
    }
    public ComputerLab createComputerLab()
    {
     Scanner kbd = new Scanner(System.in);
     String buildingName,venueNumber;
     int numberSeat,numberOfWorkingComputers;
        System.out.println("Please enter the name of the building: ");
        buildingName= kbd.next();
        System.out.println("Please enter the venue number of the building: ");
        venueNumber=kbd.next();
        System.out.println("Please enter the seat number: ");
        numberSeat=kbd.nextInt();
        System.out.println("Please enter the number of computers that are working: ");
        numberOfWorkingComputers=kbd.nextInt();
        ComputerLab computerLab=new ComputerLab(buildingName,venueNumber,numberSeat,numberOfWorkingComputers);
        return  computerLab;
   
    }
   public void displayAllRooms()
   {
       System.out.println("Review of all Venues ");
       System.out.println("===========================");
       for (int i=0;i<numOFVenue;i++)
       {
           ven[i].show();
           //System.out.println(ven[i].toString());
           System.out.println("--------------------------");
       }
   }
    public void add()
            
    {
    Scanner kbd =new Scanner(System.in);
    int Choice;
        System.out.println("enter 1 for normal venue");
        System.out.println("enter 2 for computer lab");
        Choice=kbd.nextInt();
        switch(Choice)
        {
            case 1:Venue venue=createVenue();
                    ven [numOFVenue]=venue;
                    numOFVenue++;
            break;
            case 2:ComputerLab computerLab=createComputerLab();
                    ven[numOFVenue]=computerLab;
                    numOFVenue++;
            break;
        }
    }
   public void problemLab()
   {
       System.out.println("Problem computerlabs");
       System.out.println("======================");
       for (int i=0;i<numOFVenue;i++)
       {
       if(ven[i] instanceof ComputerLab)
       {
        
       if(ven[i].problemVenue())
       {  ven[i].show();
        System.out.println("================");}
       }
       
       }
   
   }
    public void menuControl()
    {
    int option;
    while(true)
    {
    option=menu();
    switch(option)
    {
        case 1:add();
        break;
        case 2:displayAllRooms();
        break;
        case 3:problemLab();
        break;
        case 4:System.out.println("Thank you");
               System.exit(0);
        default:System.out.println("Invalid option");
                System.out.println("Please try again");
    }
    }
    }
}

