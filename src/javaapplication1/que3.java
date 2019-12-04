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
public class que3 {
    
    public static void main(String[] args) {
        
        int x = 60, y = 200, c = 160, b = 2;
        
        boolean p, q, r, s, t, u;
        p = x < y;
        q = x + y < y;
        r = x * b == 120;
        s = (x==60) && y < b;
        t = (y!=60) || (c > x);
        u = !(x > 60);
        
        System.out.println("the values are: ");
        System.out.println("x < y: " +p);
        System.out.println("x + y < y: " +q);
        System.out.println("x * b == 120: " +r);
        System.out.println("(x==60) && y < b: " +s);
        System.out.println("(y!=60) || (c > x): " +t);
        System.out.println("!(x > 60): " +t);
        
    }
    
}
