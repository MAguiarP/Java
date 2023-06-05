/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhospital.model;

/**
 *
 * @author mathe
 */
public class Medico extends Pessoa{
    
    private String especialidade;
    private String horasMensais;
    private String valorDasHoras;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getHorasMensais() {
        return horasMensais;
    }

    public void setHorasMensais(String horasMensais) {
        this.horasMensais = horasMensais;
    }

    public String getValorDasHoras() {
        return valorDasHoras;
    }

    public void setValorDasHoras(String valorDasHoras) {
        this.valorDasHoras = valorDasHoras;
    }
    
    
}
