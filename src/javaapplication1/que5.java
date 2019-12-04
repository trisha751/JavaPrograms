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

public class que5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a three digit number: ");
        
        int a = sc.nextInt();
        
        int x, y, z, sum;
        
        x = a / 100;
        y = ((a % 100)/10);
        z = a % 10;
        
        sum = x + y + z;
        
        System.out.println("The sum of the numbers " +x + ", " +y + ", and " +z + " is: " +sum);
        
    }
    
}
