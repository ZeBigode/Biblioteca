/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioBD {
    public static usuario validarUsuarioSeguro(usuario usuario) {
        EntityManager em = JPAUtil.getEntityManager();


        String jpql = "SELECT u FROM usuario u WHERE u.login = :login AND u.senha = :senha";
        usuario usuarioEncontrado = null;

        try {
            usuarioEncontrado = em.createQuery(jpql, usuario.class)
                    .setParameter("login", usuario.getLogin())
                    .setParameter("senha", usuario.getSenha())
                    .getSingleResult();
        } catch (NoResultException ex) {
            // Usuário não encontrado
            }
    em.close();
    return usuarioEncontrado;
    }
}