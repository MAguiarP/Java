
import sun.security.krb5.internal.rcache.AuthList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Clientes {
    //atributos privados para nome, endereço, email e telefone.
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    
    //método que permite atribuir o nome do cliente, endereço, email e telefone

    public void setnome(String snome){
        this.nome = snome;
    }
    
    public void setendereco(String sEndereco){
        this.endereco = sEndereco;
    }
    
    public void setEmail(String sEmail){
        this.email = sEmail;
    }
    
    public void setTelefone(String sTelefone){
        this.telefone = sTelefone;
    }
    
    
    
}