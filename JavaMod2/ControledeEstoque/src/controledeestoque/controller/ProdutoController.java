/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoque.controller;

import controledeestoque.dao.ProdutosDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class ProdutoController {
   
    public void Insetir(int id, int qtde) {
          
    try{
        ProdutosDAO produtosDAO = new ProdutosDAO();
        Integer quantidadeDeEstoque;
        quantidadeDeEstoque = produtosDAO.buscarQuantidadeDeEstoque(id);
    if (quantidadeDeEstoque != null){
        produtosDAO.atualizar(id, qtde + quantidadeDeEstoque );
        JOptionPane.showMessageDialog(null, "Estoque atualizado", "Operação Confirmada", JOptionPane.INFORMATION_MESSAGE );
        
    }

    }
    
    }