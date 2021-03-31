/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runrectangle;

import java.util.Scanner;

/**
 *
 * @author Chadrack Mbuyi
 */
public class RunRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Rectangle rec = new Rectangle(2,3);
        
        System.out.println("Please Enter the length of the rectangle");
        int length = input.nextInt();
        System.out.println("Please Enter the width of the rectangle");
        int width = input.nextInt();
        rec.setLength(length);
        rec.setWidth(width);
        System.out.println(rec);
        rec.displayDetails();
    }
    
}
