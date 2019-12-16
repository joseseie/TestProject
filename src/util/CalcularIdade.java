
package util;

import javax.swing.JOptionPane;

/**
 *
 * @author joseseie
 */
public class CalcularIdade {
    
    public static void main(String[] args) {
        
        int anoAtual = 2019;
        
//        String anoDeNascimentoStr = JOptionPane.showInputDialog("ano de nascimento: ");
//        
//        int idade = anoAtual - Integer.parseInt(anoDeNascimentoStr);
//        
//        JOptionPane.showMessageDialog(null, "A sua idade é: "+ idade + " anos");


        int resp = JOptionPane.showConfirmDialog(null, "Confirma?");
        
        System.out.println("Selected int option: " + resp);
        
    }
    
}
