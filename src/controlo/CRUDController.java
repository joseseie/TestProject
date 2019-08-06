
package controlo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import util.DBConection;

/**
 *
 * @author joseseie
 */
public class CRUDController {
 
    public void save() {
        try {
            
            Connection conn = DBConection.conect();
            
            // the mysql insert statement
            String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
              + " values (?, ?, ?, ?, ?)";

            // create a sql date object so we can use it in our INSERT statement
            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

     
            // criando a mysql preparedstatement para inserção dos dados
              PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, "Barney");
            preparedStmt.setString (2, "Rubble");
            preparedStmt.setDate   (3, startDate);
            preparedStmt.setBoolean(4, false);
            preparedStmt.setInt    (5, 5000);

            // executando a preparedstatement
            preparedStmt.execute();

            conn.close();
            
        } catch (Exception e)
        {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Infelizmente, ocorreu um erro gravando os dados");
        }
    }
    
    public void read() {
        try
            {
              Connection conn = DBConection.conect();

              // our SQL SELECT query. 
              // if you only need a few columns, specify them by name instead of using "*"
              String query = "SELECT * FROM users";

              // create the java statement
              Statement st = conn.createStatement();

              // execute the query, and get a java resultset
              ResultSet rs = st.executeQuery(query);

              // iterate through the java resultset
              while (rs.next())
              {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                Date dateCreated = rs.getDate("date_created");
                boolean isAdmin = rs.getBoolean("is_admin");
                int numPoints = rs.getInt("num_points");

                // print the results
                System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
              }
              st.close();
            }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Infelizmente, ocorreu um erro enquanto carregava os dados");
        }
  }
    
    public void update ()
    {
      try
        {
            // create a java mysql database connection
            Connection conn = DBConection.conect();

            // create the java mysql update preparedstatement
            String query = "update users set num_points = ? where first_name = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt   (1, 6000);
            preparedStmt.setString(2, "Fred");

            // execute the java preparedstatement
            preparedStmt.executeUpdate();

            conn.close();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Infelizmente, ocorreu um erro enquanto carregava os dados");

        }
    }
    
    public void delete ()
  {
    try
    {
      // create a java mysql database connection
      Connection conn = DBConection.conect();
      
      //Query para deletar
      String query = "delete from users where id = ?";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setInt(1, 3);

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
        System.err.println(e.getMessage());
        JOptionPane.showMessageDialog(null, "Infelizmente, ocorreu um erro ao deletar o registo.");

    }

  }
}
