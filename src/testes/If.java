
package testes;

import java.util.Scanner;

/**
 *
 * @author joseseie
 */
public class If {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Que horas são agora? : ");
        int time = s.nextInt();
        
        
        
        if (time < 10) {
          System.out.println("Good morning.");
        } else if (time < 20) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }
        
    }
    
}
