/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 1913083
 */
import java.util.Scanner;

public class que9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = sc.nextInt();
        
        int i, fact = 1;
        
        for (i = 1; i <= a; i++) {
            fact = fact * i;
        }
        
        System.out.println("Factorial of " + a + "is: " + fact);

    }

}
