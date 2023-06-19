/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhospital.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mathe
 */
public class ConexaoJPA {
    public static EntityManager getEntityManager(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JHospitalPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
}
