/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstclassproject;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Person 
{
    private String surName = "Mr Nobody";
    private int age;
    
    public Person()
    {
        this.age = 0;
        System.out.println("In Person constructor");
    }
    public void setSurName (String surName)
    {
        this.surName = "Mr Nobody";
    }
    public String getSurName()
    {
        return surName;
    }
     public void setAge (int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void show()
    {
        System.out.println("The person specification");
    }
    
    public String toString()
    {
        String str = String.format("Surname: %S\nAge: %d", this.surName, this.age);
        return str;
    }
            
            
            
    
}
