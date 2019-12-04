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

public class que2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int p, q, r, s;
        
        p = a + b;
        q = a - b;
        r = a * b;
        s = a / b;
        
        System.out.println("The addition of " +a +" and " +b +" is: " +p);
        System.out.println("The subtraction of " +a+" and " +b +" is: " +q);
        System.out.println("The multiplication of " +a +" and " +b +" is: " +r);
        System.out.println("The division of " +a +" and " +b +" is: " +s);
        
    }
    
}
