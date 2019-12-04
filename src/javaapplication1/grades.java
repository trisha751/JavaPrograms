
package javaapplication1;

import java.util.Scanner;

public class grades {

    
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter your grades: ");
        
        int a = sc.nextInt();
        
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
