/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 1913083
 */
import java.util.Scanner;

public class conditionalOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int r = a > b ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is: " + r);
    }
}
