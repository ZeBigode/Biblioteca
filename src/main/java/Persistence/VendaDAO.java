/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Classes.Venda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class VendaDAO {
    public List<Venda> listar(){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            Query consulta = em.createQuery("SELECT v FROM venda v");
            List<Venda> vendas = consulta.getResultList();
            return vendas;
        }finally{
            JPAUtil.closeEtityManager();
        }
    }

    public void cadastrar(Venda newved){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(newved);
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
