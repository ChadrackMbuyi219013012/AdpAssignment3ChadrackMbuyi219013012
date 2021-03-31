/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runemployee;

/**
 *
 * @author CHADRACK MBUYI 
 * KALALA
 */
public class Employee 
{
    private int empNr;
    private String surname;
    private double salary;
    
    public Employee( ){
        empNr = 999999;
        surname = "XXXXX";
        salary = 0;
    }
    public Employee (int empNr,String surname,double salary){
        this.empNr = empNr;
        this.surname = surname;
        this.salary = salary;
    }
    public void setEmpNr(int empNr){
        this.empNr = empNr;
    }
    public int getEmpNr(){
        return this.empNr;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
    
    @Override
    public String toString(){
        String empString = "Emp#: " + empNr + ", Surname: " + this.surname 
                            + ", Salary: R" + this.salary;      
        return empString;
    }
    public void displayDetails(){
        System.out.println("Employee number: " + empNr);
        System.out.println("Surname: " + this.surname);
        System.out.println("Salary: " + this.salary);
    }
    
    
    
}

