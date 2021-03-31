/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayloop;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class ArrayLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Index\tValue");
        int smith[]={10,20,30,40,50};
        
        for (int counter=0;counter<smith.length;counter++){
            
            System.out.println(counter + "\t" + smith[counter]);
        
        }
    }
    
}
