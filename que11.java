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

public class que11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit till which you want to find prime numbers: ");
        int a = sc.nextInt();
        int i = 0, b;
        String primeNumbers = " ";

        for (i = 1; i <= a; i++) {

            int cnt = 0;
            for (b = i; b >= 1; b--) {

                if (i % b == 0) {
                    cnt = cnt + 1;
                }
            }
            if (cnt == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("prime numbers from 1 to " + a + " are: ");
        System.out.println(primeNumbers);
    }

}
