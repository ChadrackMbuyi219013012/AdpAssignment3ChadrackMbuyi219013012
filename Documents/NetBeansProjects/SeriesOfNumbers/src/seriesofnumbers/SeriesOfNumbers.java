/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriesofnumbers;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class SeriesOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int n;
        double Tn;
        int series;
        System.out.print("Please Enter the value of n: ");
        n = input.nextInt();
        System.out.println("The first " + n + " terms of the series are as follow :");
        
        for (int x = 1; x <= n; x++)
        {
            Tn = (0.5*(Math.pow(x, 2))) + (0.5*x);
            series = (int)Math.round(Tn);
            System.out.print(" " + series + " ");
            
            if (series == 561)
            {
                System.out.print("\n");
            }
        }
        System.out.print("\n");
        
    }
    
}
