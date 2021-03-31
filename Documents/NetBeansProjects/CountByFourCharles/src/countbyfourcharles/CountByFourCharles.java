/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countbyfourcharles;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class CountByFourCharles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println(" Counting by four report.");
        for (int i=4; i<=200; i+=4){
            System.out.print(" "+i);
            if (i == 40){
                System.out.print("\n");
                continue;
            } if (i == 80){
                System.out.print("\n");
                continue;
            } if (i == 120){
                System.out.print("\n");
                continue;
            } if (i == 160){
                System.out.print("\n");
                continue;
            } if (i == 200){
                System.out.print("\n");
                
            }
        
        }
        System.out.println(" End of report.");
        
    }
    
}
