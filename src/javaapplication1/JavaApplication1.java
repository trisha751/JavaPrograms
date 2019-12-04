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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 80;
        if(a <= 100 && a >= 90)
            {
            System.out.println("The grade is: A+");
               
            }
        else if(a < 90 && a >= 80)
            {
               System.out.println("The grade is: A");
            }
        else if(a < 80 && a >= 70)
            {
               System.out.println("The grade is: B+");
            }
        else if(a < 70 && a >= 60)
            {
               System.out.println("The grade is: B");
            }
        else
            {
                System.out.println("You have failed this exam.");
            }
            
    }
    
}
