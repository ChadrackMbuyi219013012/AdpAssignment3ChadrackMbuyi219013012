/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymethod;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class Arraymethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int chad[]={4,6,8,9,7,};
        change(chad);
        
        for(int y:chad)
            System.out.println(y);
        
    }
    public static void change(int x[]){
        for (int counter=0;counter<x.length;counter++)
            x[counter]+=5;
            
            }
    
}
