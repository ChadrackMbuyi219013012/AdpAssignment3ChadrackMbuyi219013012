/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int pc1, pc2, pc3;

        System.out.print("Please mention Computer1:");
        pc1 = scn.nextInt();
        System.out.print("Please mention Computer2:");
        pc2 = scn.nextInt();
        System.out.print("Please mention Computer3:");
        pc3 = scn.nextInt();
        
        System.out.println("=======================================");

        if (pc1 > pc2 && pc1 > pc3) {
            System.out.println(pc1 + " " + "is faster than" + " " + " " + pc2 + "and" + pc3);
        } else if (pc2 > pc1 && pc2 > pc3) {
            System.out.println(pc2 + " " + "is faster than" + " " + " " + pc1 + "and" + pc3);
        } else if (pc3 > pc1 && pc3 > pc2) {
            System.out.println(pc3 + " " + "is faster than" + " " + " " + pc1 + "and" + pc2);
        }

    }

}
