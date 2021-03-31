/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydepth;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class ArrayDepth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Index" + "\t" + "Student");
        String name[]={"Lana Africa","Chadrack Smith","Farai","Joshua","Charles","Isaac Kissimba"};
        
        
        
        for (int counter=0;counter<name.length;counter++){
            
            System.out.println(counter + "\t" + name[counter]);
        
        }
    }
    
}
