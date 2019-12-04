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

public class que3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        int weight = sc.nextInt();

        if (weight <= 116) {
            System.out.println("Eat 5 banana splits");
        } else if (116 < weight && weight <= 130) {
            System.out.println("Eat a banana split");
        } else if (131 < weight && weight <= 200) {
            System.out.println("Perfect!");
        } else if (weight > 200) {
            System.out.println("Plenty of banana splits have been consumed!");
        }

    }

}
