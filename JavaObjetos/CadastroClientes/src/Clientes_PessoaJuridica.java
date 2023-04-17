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
    String cpf , cnpj ,incricraoestadual  ;
    
    //métodos que permitem atribuir dados aos atributos
    public void setcpf(String scpf){
        this.cpf = scpf;
    }
    
     public void setrg(String scnpj){
        this.cnpj = scnpj;
    }
        
     public void setincricaoestadual(String sincricaoestadual){
        this.incricraoestadual = sincricaoestadual;
    }
    //método que permite recuperar o conteúdo dos atributos
     public String retorna_cpf(){
         return cpf;
     }
     
      public String retorna_cnpj(){
         return cnpj;
     }
      
     public String retorna_incricaoestadual(){
         return incricraoestadual;
     }
}


