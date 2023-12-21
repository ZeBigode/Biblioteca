/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Biblioteca {
    
    // Instância estática única da Biblioteca (Singleton)
    private static Biblioteca instance;

    // Lista de livros na biblioteca
    private List<livro> Lista_livros;

    // Construtor privado para impedir a criação de instâncias adicionais
    private Biblioteca() {
        Lista_livros = new ArrayList<>();
    }
    
    public void adicionarLivro(livro livro) {
        Lista_livros.add(livro);
    }

    public List<livro> Lista_livros() {
        return Lista_livros;
    }
    // Método estático para obter a instância única da Biblioteca
    public static Biblioteca getInstance() {
        if (instance == null) {
            instance = new Biblioteca();
        }
        return instance;
    }
}
