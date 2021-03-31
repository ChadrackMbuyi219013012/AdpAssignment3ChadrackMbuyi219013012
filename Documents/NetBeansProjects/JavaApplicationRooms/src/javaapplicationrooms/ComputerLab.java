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
public class ComputerLab extends Venue
{
    
private int numberOfWorkingComputers;


public ComputerLab()
{
    
}
public ComputerLab(String buildingNm, String roomNum,int numSeat,int numOfWkngCom)
{
super(buildingNm,roomNum,numSeat);
numberOfWorkingComputers=numOfWkngCom;

}

public int getNumberOfWorkingComputers() 
{
    return numberOfWorkingComputers;
}

public void setNumberOfWorkingComputers(int numberOfWorkingComputers) 
{
    this.numberOfWorkingComputers = numberOfWorkingComputers;
}

public String toString()
{
    String str=super.toString()+"Number of Computers: "+ this.numberOfWorkingComputers;
    return str;
}
public void show()
{
    super.show();
    System.out.println("Number of Working Computers: "+getNumberOfWorkingComputers());
}

public boolean  problemVenue ()
{
 boolean PV;
  if (getNumberSeat()>getNumberOfWorkingComputers())
  {
   PV=true;
  }
    else{
      //super.problemVenue();
      PV=false;
  }
    return PV;
}
}
