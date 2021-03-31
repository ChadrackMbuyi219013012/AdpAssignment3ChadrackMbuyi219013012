/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexercise3;

/**
 *
 * @author Chadrack Mbuyi Kalala 219013012
 */
public class ArrayExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[ ] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[ ] suit = {"♠", "♡","♢","♣"};

        String[ ] deck = new String [52];
        
        int i,j=0;
        System.out.println("% Java Deck");
        for(i=0;i<suit.length;i++){
            for(j=0;j<rank.length;j++){
                
                deck[rank.length*i+j] =  rank[j]+suit[i];
                
                System.out.print(deck[rank.length*i+j]+"\t");
        }
            
        System.out.println("\n");
        
        }
        System.out.println("%");
        

    }
    
}
