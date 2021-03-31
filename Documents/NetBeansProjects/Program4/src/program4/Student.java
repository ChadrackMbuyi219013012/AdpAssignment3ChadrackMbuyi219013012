/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program4;

/*
Name: Chadrack Mbuyi
Surname: Kalala
Student number: 219013012
 */
public class Program4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         StudentAccount test = new StudentAccount();
        
        test.setName("Chadrack Mbuyi");
        test.setCourse("ADF152S");
        test.setBalance(900);
        test.addFees(100);
        test.Pay(300); //When we on negative 
        test.refund();
       System.out.println(test.toString());
    }
    
}
