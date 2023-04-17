/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Clientes_PessoaFisica extends Clientes{
      
     String cpf , rg;
    
    //métodos que permitem atribuir dados aos atributos
    public void setcpf(String scpf){
        this.cpf = scpf;
    }
    
     public void setrg(String srg){
        this.rg = srg;
    }
     
    //método que permite recuperar o conteúdo dos atributos
     public String retorna_cpf(){
         return cpf;
     }
     
      public String retorna_rg(){
         return rg;
     }
     
}
