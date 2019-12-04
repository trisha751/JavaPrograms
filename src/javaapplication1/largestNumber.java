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

public class largestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("The largest number is: " + a);
        }
        else if (b > c) {
            System.out.println("The largest number is: " + b);
                } 
        else {
            System.out.println("The largest number is: " + c);
        }
    
    }
}
