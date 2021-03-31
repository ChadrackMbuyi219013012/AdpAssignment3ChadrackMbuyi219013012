/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication86;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class JavaApplication86 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        String[ ] floor = {"basement", "ground", "1st"}; 

        String[ ] room = {"Rm1", "Rm2", "Rm3", "Rm4", "Rm5", "Rm6", "Rm7"};
        String[ ] building = new String[room.length * floor.length];

        int i, j=0;
        for (i = 0; i < room.length; i++) {
            for (j = 0; j < floor.length; j++) {

            building[floor.length*i + j] = room[i] + " on " + floor[j] + " floor";
 
            System.out.print(building[floor.length*i + j]+ ";\t");  
       
        }//end for j

        System.out.println("\n");         
    }//end for i

    


   
}
}
    

