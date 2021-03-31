/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationrooms;

/**
 *
 * @author CHADRACK MBUYI
 */
public class Venue 
{
    private String buildingName;
    private String roomNumber;
    private int numberSeat;
    
    public Venue ()
    {
    
    }
    
    public Venue (String buildingNm, String roomNum,int numSeat)
    {
     buildingName = buildingNm;
     roomNumber= roomNum;
     numberSeat= numSeat;
     
    }

    public String getBuildingName() 
    {
        return buildingName;
    }

    public String getRoomNumber() 
    {
        return roomNumber;
    }

    public int getNumberSeat() 
    {
        return numberSeat;
    }

    public void setBuildingName(String buildingName) 
    {
        this.buildingName = buildingName;
    }

    public void setRoomNumber(String roomNumber) 
    {
        this.roomNumber = roomNumber;
    }

    public void setNumberSeat(int numberSeat) 
    {
        this.numberSeat = numberSeat;
    }
    @Override
    public String toString()
    {
     String str= "Buildin name:"+" "+this.buildingName+"|| "+"Room Number:"+" "+ this.roomNumber+"|| "+"Seat Number:"+" " + this.numberSeat+"||";
     return str;
    }
     
    public void show()
    {
        System.out.println("Building name: "+ getBuildingName());
        System.out.println("Venue number: "+ getRoomNumber());
        System.out.println("Number of seat: "+ getNumberSeat());
     
    }
    public boolean  problemVenue ()
    {
      return false;
    }
    
}
