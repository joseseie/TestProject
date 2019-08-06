
package util;

/**
 *
 * @author Explicador Inc, LDA.
 * 
 */
public class CursoDeJava {
    
    private int vagasExistentes = 45;

    public boolean aindaHaVagas (int meAndMyFriends) {
        return this.vagasExistentes - meAndMyFriends > 0;
    }
    
    public static void main(String[] args) {
        
        CursoDeJava curso = new CursoDeJava();
        
        int euEMeusColegas = 3;
        
        if (curso.aindaHaVagas(euEMeusColegas)) {
         
            System.out.println("Sim, ainda há vagas. Pode vir inscrever-se.");
            System.err.println("Antes custava 1.000 mt");
            System.out.println("Mas agora baixamos para 750 mt, até a data de início do curso!");
            
        }
        
    }
    
    
    
}
