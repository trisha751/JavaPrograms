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
public class que4 {
    
    public static void main(String[] args) {
        boolean a = (1 + 2) > (4 - 2) && 12 < 23;
        boolean b = (1 + 2) > (4 - 2) || 12 < 23;
        boolean c = (1 + 2) > (4 - 2) && 12 > 23;
        boolean d = (1 + 2) > (4 - 2) || 12 > 23;
        
        System.out.println("Values of a: " +a);
        System.out.println("Values of b: " +b);
        System.out.println("Values of c: " +c);
        System.out.println("Values of d: " +d);
        
    }
    
}
