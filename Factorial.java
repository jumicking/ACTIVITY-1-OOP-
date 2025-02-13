/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author MALILONG_CpE121
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
           Scanner in = new Scanner(System.in);

        System.out.println("Note: the number should not be negative \nEnter a number: ");
        int n = in.nextInt();
        if (n < 0) {
            System.out.println("INVALID!!!\nThe number should be non-negative");
        } else {
            FactorialCal T = new FactorialCal(n);
            T.displayResult();
        }

    }

    }
    

    
