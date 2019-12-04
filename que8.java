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
public class que8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        short age = sc.nextShort();

        double rebate = 0;

        System.out.println("Is the person student?: ");
        boolean isAStudent = sc.nextBoolean();

        System.out.println("Enter work experience: ");
        int workExperience = sc.nextInt();

        if (age < 10 || age > 70) {
            rebate = 20;
        }

        else if ((age < 20 && workExperience > 4) && isAStudent) {

            rebate = 15;

        }
        System.out.println("Value of rebate: " + rebate);
    }

}
