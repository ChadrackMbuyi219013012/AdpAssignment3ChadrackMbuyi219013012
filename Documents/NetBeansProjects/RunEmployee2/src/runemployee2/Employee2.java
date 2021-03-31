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
public class Employee2 
{
    
    private String name; 
    private String surname;
    private int employeeId;
    private double salary;
    private double hours;
    private int leaveDays;
    private String address;
    private String gender;
    private String race;
    private String emailAddress;
    private String city;
    
    
  public Employee2()
  {
    
  }
  
  public Employee2(String name,String surname,int employeeId,double salary,double hours,int lDays, String address,String gender,String race,String emailAddress,String city)
  {
     this.name = name;
     this.surname = surname;
     this.employeeId = employeeId;
     this.salary = salary;
     this.hours = hours;
     this.leaveDays = lDays;
     this.address = address;
     this.gender = gender;
     this.race = race;
     this.emailAddress = emailAddress;
     this.city = city;
    
    
   
  }

  

  public void setName(String name)
  {
      this.name = name;
  }
  public String getName()
  {
    return name;  
  }
  public void setSurname(String surname)
  {
      this.surname = surname;
  }
  public String getSurname()
  {
     return surname; 
  }
  public void setEmployeeId(int employeeId)
  {
      this.employeeId = employeeId;
  }
  public int getEmployeeId()
  {
     return employeeId; 
  }
  public void setSalary(double salary)
  {
      this.salary = salary;
  }
  public double getSalary()
  {
   return salary;   
  }
  public void setHours(double hours)
  {
     this.hours = hours; 
  }
  public double getHours()
  {
      return hours;
  }
  public void setLeaveDays(int leaveDays)
  {
     this.leaveDays = leaveDays; 
  }
  public int getLeaveDays()
  {
    return leaveDays;  
  }
  public void setAddress(String address)
  {
      this.address = address;
  }
  public String getAddress()
  {
    return address;  
  }
  public void setGender(String gender)
  {
    this.gender = gender;  
  }
  public String getGender()
  {
      return gender;
  }
  public void setRace(String race)
  {
     this.race = race; 
  }
  public String getRace()
  {
    return race;  
  }
  public void setEmailAddress(String emailAddress)
  {
      this.emailAddress = emailAddress;
  }
  public String getEmailAddress()
  {
      return emailAddress;
  }
  public void setCity(String city)
  {
      this.city = city;
  }
  public String getCity()
  {
      return city;
  }
  public void leaveApplication()
  {
    System.out.println("I can take a leave spplication");  
  }
  public void work()
  {
     System.out.println("I can work"); 
  }

    /**
     *
     * @return
     */
  public String toSting()
  {
   String Employee = String.format("Name : %S\nSurname : %S\nEmployeeID : %d\nSalary : %.2f\nHours : %.2fLeaveDays : %d\nAddress : %S\nGender %S\nRace : %S\nEmailAdress : %S\nCity : %S " , this.name, this.surname, this.employeeId,this.salary ,  this.hours,this.leaveDays ,this.address , this.gender, this.race,this.emailAddress , this.city); 
       return Employee;                
  }
    
}
