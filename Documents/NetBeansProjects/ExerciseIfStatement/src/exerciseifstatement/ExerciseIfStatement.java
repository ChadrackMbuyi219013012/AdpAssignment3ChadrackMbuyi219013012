/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseifstatement;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO
 */
public class ExerciseIfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Question 3
        int x, y;

        System.out.println("Please enter the value of x");
        x = input.nextInt();
        System.out.println("Please enter the value of y");
        y = input.nextInt();

        if (x < y) {
            System.out.println(x + " " + "is smaller than" + " " + y);
        }
        if (x > y) {
            System.out.println(x + " " + "is greater than" + " " + y);
        } else if (x == y) {
            System.out.println(x + " " + "is equal than" + " " + y);
        }
        if (x == 4) {
            if (y == 6) {
                System.out.println("x equals 4 and y equals 6");
            }
        }

    }

}
