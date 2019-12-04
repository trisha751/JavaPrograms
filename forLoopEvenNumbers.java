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
public class forLoopEvenNumbers {

    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (i = 2; i <= 100; i = i + 2) {

            System.out.println(i);

        }
    }
}


