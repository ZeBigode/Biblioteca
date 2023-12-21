/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Classes.cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class ClienteDAO {
        public List<cliente> listar(){
      EntityManager em = JPAUtil.getEntityManager();
      try{
          Query consulta = em.createQuery("SELECT c FROM cliente c");
          List<cliente> clientes = consulta.getResultList();
          return clientes;
      }finally{
          JPAUtil.closeEtityManager();
      }
    }

    public void cadastrar(cliente newcle){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(newcle);
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
