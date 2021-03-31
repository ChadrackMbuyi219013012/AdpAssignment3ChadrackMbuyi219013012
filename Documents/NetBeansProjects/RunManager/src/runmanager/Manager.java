/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runmanager;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Manager extends Employee {
    private String dept;
    private double performanceBonus;
    
    public Manager (){
    
    }
    
    public Manager (int empNr, String surname, double salary, String dept, 
                                                double performanceBonus){
    
    }
    
    public void setDept (String dept){
        this.dept = dept;
    }
    
    public String getDept(){
        return this.dept;
    }
    
    public void setPerformanceBonus (double performanceBonus){
        this.performanceBonus = performanceBonus;
    }
    
    public double getPerformanceBonus(){
        return this.performanceBonus;
    }
    
    @Override
    public String toString (){
        String managerString = super.toString() + ", Manager of: " + this.dept 
                            + ", Performance Bonus: R" + this.performanceBonus;
        return managerString;
    }
    @Override
    public void displayDetails (){
        super.displayDetails();
        System.out.println("Manager of: " + this.dept);
        System.out.println("Performance Bonus of: R " + this.performanceBonus);
        System.out.println("========================================");
        System.out.println("Total salary: R " + (getSalary() + performanceBonus));
    
    }
    
}
