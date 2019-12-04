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

public class que7 {

    public static void main(String[] args) {

        Scanner myKeyboard = new Scanner(System.in);
        String msg = myKeyboard.next();
        int x = 0;
        int y = 10;
        int z = 100;
        switch (msg.charAt(0)) {
            case 'a':
                
            case 'b':
                System.out.println("case 1");
                x = (msg.equals("abc") ? (5 + y++) : (--y + z--));
                break;
                
            case 'c' :
                System.out.println("case 2");
                y /= 5;
                
            default:
                System.out.println("default");        
        }
        System.out.println(x + " " + y + " " + z);
    }
}
