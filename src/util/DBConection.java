
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBConection {
    
    private static String dbName = "poo_db"; //nome da base de dados
    private static String userName = "root"; //nome de usuário para conexão com a db
    private static String password = ""; //Password de acesso
    private static String server = "localhost"; //Servidor or ip, mas geralmente: localhost
    
    public static Connection conect () {
        try {
            
            Class.forName("java.sql.Driver");
            String path = "jdbc:mysql://" + server + "/" + dbName;
            Connection con = DriverManager.getConnection(path, userName, password);
            
            System.out.println("Conexao feita com sucesso com o mysql no server: '" + server + "'...");
            
            return con;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao contactar com o server: " + server + "\nError: " + ex.getMessage());
        }
        
        return null;
    }
    
}