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
public class que1 {
    
    public static void main(String[] args) {
        
        int x = 10, y = 15;
        int p, q;
        
        p = x * ++y;
        q = x * y++;
        
        System.out.println("x * ++y = " +p);
        System.out.println("x * y++ = " +q);
        
    }
    
}
