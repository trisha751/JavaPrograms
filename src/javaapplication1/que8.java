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
//package prjstrings;
import java.io.*;

public class que8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a student id between 0 and 9999999: ");
        long a = sc.nextInt();

        if (a < 0 || a > 9999999) {
            System.out.println("invalid student id");
            System.exit(0);
        }

        System.out.println("Student id: " + a);

        System.out.println("Enter a password with the length between 6 and 20: ");
        String b = sc.next();

        if (b.length() < 6 || b.length() > 20) {
            System.out.println("invalid password ");
            System.exit(0);
        }

        System.out.println("Password: " + b);

        System.out.println("Enter a string: ");
        String c = sc.next();

        System.out.println("String: " + c);
        String result = c.toUpperCase();

        System.out.println("String in uppercase: " + result);

    }

}
