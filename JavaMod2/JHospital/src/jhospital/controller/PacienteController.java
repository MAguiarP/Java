/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhospital.controller;

import java.util.List;
import javax.swing.JTabbedPane;
import jhospital.dao.PacienteDAO;
import jhospital.model.Paciente;

/**
 *
 * @author mathe
 */
public class PacienteController {

      
    
    public void inserir(String nome, String email, String endereco, String telefone, String quarto, String doenca,
             String diasInternado, String temPlanoDeSaude)
    {     Paciente paciente = new Paciente();
            paciente.setNome(nome);
            paciente.setEmail(email);
            paciente.setTelefone(telefone);
            paciente.setEndereco(endereco);
            paciente.setNumerodoquarto(Integer.parseInt(quarto));
            paciente.setDoenca(doenca);
            paciente.setDiasdeinternacao(Integer.parseInt(diasInternado));
            
            if(temPlanoDeSaude.equalsIgnoreCase(" Sim")){
                paciente.setTemplanodesaude(true);
            } else {
                paciente.setTemplanodesaude(false);
            }
      
    }
    public void alterar(Integer id, String nome, String email, String endereco, String telefone, String quarto, String doenca,
             String diasInternado, String temPlanoDeSaude)throws Exception{
        
        Paciente paciente = new Paciente();
            paciente.setNome(nome);
            paciente.setEmail(email);
            paciente.setTelefone(telefone);
            paciente.setEndereco(endereco);
            paciente.setNumerodoquarto(Integer.parseInt(quarto));
            paciente.setDoenca(doenca);
            paciente.setDiasdeinternacao(Integer.parseInt(diasInternado));
            
            if(temPlanoDeSaude.equalsIgnoreCase(" Sim")){
                paciente.setTemplanodesaude(true);
            } else {
                paciente.setTemplanodesaude(false);
            }
            new PacienteDAO().edit(paciente);
        
    }
    
    public Paciente buscarPacientePeloId(Integer id)
            throws Exception {
        return new PacienteDAO().findPaciente(id);
    }
    
    public void excluir(Integer id)
     throws Exception{
    }
    
    public List<Paciente> buscar(String nome, String email)
     throws Exception{
        return new PacienteDAO().getListaDePacientes(nome, email);
    }
}

