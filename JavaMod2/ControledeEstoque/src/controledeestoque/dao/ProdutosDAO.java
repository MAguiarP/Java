/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoque.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author mathe
 */
public class ProdutosDAO {
    Connection conn ;
    
    public ProdutosDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
    public void atualizar(int id, int qtde) throws SQLException {
        String sql = "UPDATE produtos SET quantidade = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, qtde);
        pstmt.setInt(2, id);
        pstmt.execute();
        pstmt.close();
    }
    
    public Integer buscarQuantidadeDeEstoque(int id) {
          try{
              String sql = "Select Quantidade from produtos where id = ?"
              
          }
          }
    }
    
}
