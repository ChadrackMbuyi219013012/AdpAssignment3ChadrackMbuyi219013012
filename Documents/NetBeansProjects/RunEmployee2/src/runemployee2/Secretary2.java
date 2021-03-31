/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runemployee2;

/**
 *
 * @author Chadrack
 */
public class Secretary2 extends Employee2 
{
     public Secretary2()
    {
 
    }
    public Secretary2(String name,String surname ,int employeeId,double salary,int hours,int lDays, String address,String gender,String race,String emailAddress,String city)
    {
        super(name,surname,employeeId,salary,hours,lDays,address,gender,race,emailAddress,city);

    }

  
    @Override
     public void work()
     {
        super.work(); 
     }
    
}
