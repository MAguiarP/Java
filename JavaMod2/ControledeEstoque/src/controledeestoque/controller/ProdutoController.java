/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoque.controller;

import controledeestoque.dao.ProdutosDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import org.postgresql.core.Logger;

/**
 *
 * @author mathe
 */
public class ProdutoController {
   
    public void Inserir(int id, int qtde) {
          
    try{
        ProdutosDAO produtosDAO = new ProdutosDAO();
        Integer quantidadeDeEstoque;
        quantidadeDeEstoque = produtosDAO.buscarQuantidadeDeEstoque(id);
    if (quantidadeDeEstoque != null){
        produtosDAO.atualizar(id, qtde + quantidadeDeEstoque );
        JOptionPane.showMessageDialog(null, "Estoque atualizado", "Operação Confirmada", JOptionPane.INFORMATION_MESSAGE );
 }
    else{
        JOptionPane.showMessageDialog(null, "Código Inválido", "Operação Incorreta", JOptionPane.ERROR);
    }

    //limparcampos();
    } catch (SQLException ex ){
        Logger.getLogger(InserirProdutosView.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Código Inválido", "Operação Incorreta", JOptionPane.ERROR);
        
    }
    
    }
    
     public void Baixar(int id, int qtde) {
          
    try{
        ProdutosDAO produtosDAO = new ProdutosDAO();
        Integer quantidadeDeEstoque;
        quantidadeDeEstoque = produtosDAO.buscarQuantidadeDeEstoque(id);
    if (quantidadeDeEstoque != null){
        produtosDAO.atualizar(id, quantidadeDeEstoque - qtde);
        JOptionPane.showMessageDialog(null, "Estoque atualizado", "Sucesso", JOptionPane.OK_OPTION );
 }
    else{
        JOptionPane.showMessageDialog(null, "Código Inválido", "Erro", JOptionPane.ERROR);
    }

    //limparcampos();
    } catch (SQLException ex ){
        Logger.getLogger(BaixarProdutosView.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Digite valores numéricos ", "Erro", JOptionPane.ERROR);
        
    }
    
    }
}
    