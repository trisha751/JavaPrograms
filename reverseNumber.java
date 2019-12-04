/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author 1913083
 */
public class reverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int a = sc.nextInt();

        int renum = 0;
        int temp = a;
        while (a > 0) {
            int d = a % 10;
            renum = renum * 10 + d;
            a = a / 10;
        }
        System.out.println("The sum of the number is: " + renum);

        if (temp == renum) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }

    }

}
