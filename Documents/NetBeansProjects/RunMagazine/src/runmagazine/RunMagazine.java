/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runmagazine;

/**
 *
 * @author Chadrack Mbuyi
 */
public class RunMagazine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("MAGAZINE REPORT DETAILS\n-----------------------");
        
        Magazine mag1=new Magazine("People",45.4,"Chadrack Mbuyi","cm@gmail.com");
        Magazine mag2=new Magazine("Political",96.4,"Ester Mukendi","em@gmail.com");
        Magazine mag3=new Magazine("Fighters",37.4,"Cedric Kande","ck@gmail.com");
        Magazine mag4=new Magazine("Music",96.4,"Daniel Nkashama","dk@gmail.com");
        Magazine mag5=new Magazine("Festival",47.6,"Anelisa Mrubata","am@gmail.com");
        Magazine allMag []= new Magazine [5];
        
         allMag [0]=mag1;
         allMag [1]=mag2;
         allMag [2]=mag3;
         allMag [3]=mag4;
         allMag [4]=mag5;
         
         for(Magazine m: allMag)
         {
             System.out.println(m);
         }
        System.out.println("END OF REPORT");
        // TODO code application logic here
    }
        
}
    
