/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication89;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class JavaApplication89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstarray [][] = {{12,42,1,52,14},{32,52,55,1,4},{12,32,41,23}};
        int secondarray [][] = {{4,6,33,5,12},{32,5,7,88,74,96},{2,3,5,4,8,7}};
        
        System.out.println("This is the first array");
        display(firstarray);
        
        System.out.println("This is the second array");
        display(secondarray);
    }
    public static void display(int x[][]){
        
        for (int row = 0;row<x.length;row++){
            for (int column = 0;column<x[row].length;column++){
                System.out.print(x[row][column]+"\t");
            }
            
        System.out.println();
        }
        
    }
    
}
