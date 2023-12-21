/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Classes.funcionario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class FuncionarioDAO {
    
    
    public List<funcionario> listar(){
      EntityManager em = JPAUtil.getEntityManager();
      try{
          Query consulta = em.createQuery("SELECT f FROM funcionario f");
          List<funcionario> funcios = consulta.getResultList();
          return funcios;
      }finally{
          JPAUtil.closeEtityManager();
      }
    }

    public void cadastrar(funcionario newfun){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(newfun);
              em.getTransaction().commit();
          }catch(Exception e){
              em.getTransaction().rollback();
              throw e;
          }
          finally{
              JPAUtil.closeEtityManager();
          }
      }
}
