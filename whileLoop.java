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

public class whileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int a = sc.nextInt();

        int sum = 0;
        while (a > 0) {
            int d = a % 10;
            sum = sum + d;
            a = a / 10;
        }
        System.out.println("The sum of the number is: " + sum);
    }

}
