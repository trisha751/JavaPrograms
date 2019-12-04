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

public class doWhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter any number: ");
        //int a = sc.nextInt();
        int a;
        int sum = 0;

        do {
            System.out.println("Enter a number: ");
            a = sc.nextInt();
            sum = sum + a;
        } while (a != 0);

        System.out.println("The sum of the entered numers is: " + sum);

    }

}
