/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Clientes_PessoaJuridica extends Clientes {
   //Atributos criados ppara nome, endereço, email e telefone.
    String cnpj ,IE ;
    
    //métodos que permitem atribuir dados aos atributos
     public void setCnpj(String sCnpj){
        this.cnpj = sCnpj;
    }
        
     public void setIE(String IE){
        this.IE = IE;
    }
    //método que permite recuperar o conteúdo dos atributos
 
      public String retorna_cnpj(){
         return cnpj;
     }
      
     public String retorna_IE(){
         return IE;
     }
}


