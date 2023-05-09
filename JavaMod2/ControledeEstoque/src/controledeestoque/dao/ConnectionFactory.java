


package controledeestoque.dao;
import java.sql.*;

/**
 *
 * @author mathe
 */
public class ConnectionFactory {
    private static final String URL = "jdbc:postgresql://localhost:5432/DBControledeEstoque";
    private static String USER = "UserControleEstoque";
    private static final String PASS = "123456";
    


    public static Connection getConnection()
    {
        try
        {
            System.out.print("Conectando ao banco de dados!");
            return DriverManager.getConnection(URL, USER, PASS);                   
        }
        
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        
    }
}