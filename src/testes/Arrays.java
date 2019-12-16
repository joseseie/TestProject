
package testes;

import java.util.Scanner;

/**
 *
 * @author joseseie
 */
public class Arrays {
    
    
    public static void main(String[] args) {
        
        String[] cars = {"Test"};
        Scanner s = new Scanner(System.in);
        
        System.out.print("Indique o tamanho do array: ");
        int tam  = s.nextInt();
        
//        cars = new String[tam];
        
        System.out.println("Tamanho do array: " + cars.length);
        
    }
    
}
