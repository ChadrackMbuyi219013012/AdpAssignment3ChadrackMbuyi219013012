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
public class MyFirstClassProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Hello world");
        Person personObject = new Person();
        personObject.setSurName("");
        personObject.setAge(0);
        personObject.show();
        System.out.println(personObject.toString());
    }
    
}
