/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runstudent;

/**
 *
 * @author CHADRACK MBUYI
 */
public class Student 
{
    private String name;
    private long studentNumber;
    double loanAmount;
    
    public Student ()
    {

    }
    
    public Student (String nm, long studentNm, double loanAmt)
    {
        this.name = nm;
        this.studentNumber = studentNm;
        this.loanAmount = loanAmt;
    }
    
    public String getName()
    {
        return name;
    }
    
    public long getStudentNumber()
    {
        return studentNumber;
    }
    
    public double getLoanAmount()
    {
        return loanAmount;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setStudentNumber(long studentNumber)
    {
        this.studentNumber = studentNumber;
    }
    
    public void loanAmount(double loanAmount)
    {
        this.loanAmount = loanAmount;
    }
    
    @Override
    public String toString()
    {
        String str = "Name:"+" "+this.name+"|| "+"Student Number:"+" "+ this.studentNumber+"|| "+"Loan Amount:"+" " + this.loanAmount+"||";
        return str;
    }
    
    public void Show()
    {
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + getStudentNumber());
        System.out.println("Loan Amount: " + getLoanAmount());
    }
    
    public double interest()
    {
        return loanAmount*.05;
    } 
}


