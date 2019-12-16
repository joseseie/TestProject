
package testes;

/**
 *
 * @author joseseie
 */
public class Loop {
    
    public static void main(String[] args) {
        
        int i = 0;

        while (i < 10) {
            
            if (i == 4) {
              i++;
              continue;
            }
            System.out.println(i);
            i++;
        }
        
    }
    
}
