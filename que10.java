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

public class que10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = sc.nextInt();

        System.out.println("Fibonacci series of " + a + " is: ");

        int i, j = 0, k = 1, f = 0;
        System.out.println(j);
        System.out.println(k);
        for (i = 0; i <= a; ++i) {
            f = j + k;
            System.out.println(f);
            j = k;
            k = f;
        }

    }

}
