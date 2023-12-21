/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;


import Classes.livro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class LivroDAO {
    
    public List<livro> listarNome(String filtroNome){
        EntityManager em = JPAUtil.getEntityManager();
        List livros = null;
        try{
            String textoQuery = "SELECT l FROM livro l "+
                    "WHERE (:nome is null OR l.nome LIKE :nome )";

            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("nome", filtroNome.isEmpty() ? null : "%" + filtroNome + "%" );

            livros = consulta.getResultList();
        }finally{
            JPAUtil.closeEtityManager();
        }
        return livros;
    }
    
    public List<livro> listarAutor(String filtroAutor){
        EntityManager em = JPAUtil.getEntityManager();
        List livros = null;
        try{
            String textoQuery = "SELECT l FROM livro l "+
                    "WHERE (:autor is null OR l.autor LIKE :autor )";

            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("autor", filtroAutor.isEmpty() ? null : "%" + filtroAutor + "%" );

            livros = consulta.getResultList();
        }finally{
            JPAUtil.closeEtityManager();
        }
        return livros;
    }
    public List<livro> listarTipo(String filtrotipo){
        EntityManager em = JPAUtil.getEntityManager();
        List livros = null;
        try{
            String textoQuery = "SELECT l FROM livro l "+
                    "WHERE (:tipo is null OR l.tipo LIKE :tipo )";

            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("tipo", filtrotipo.isEmpty() ? null : "%" + filtrotipo + "%" );

            livros = consulta.getResultList();
        }finally{
            JPAUtil.closeEtityManager();
        }
        return livros;
    }
    
    public List<livro> listar(){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            Query consulta = em.createQuery("SELECT l FROM livro l");
            List<livro> livros = consulta.getResultList();
            return livros;
        }finally{
            JPAUtil.closeEtityManager();
        }
    }

    public void cadastrar(livro newliv){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(newliv);
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
