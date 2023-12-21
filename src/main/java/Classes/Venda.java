/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "status_compra")
    private String status_compra;

    @Column(name = "tipo_pagamento")
    private String tipo_pagamento;

    @Column(name = "valor")
    private double valor;

    @ManyToOne
    @JoinColumn(name="funcionario_id")
    private funcionario funcionario_id;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private cliente cliente_id;

    public Venda() {
        // Construtor vazio necessário para JPA
    }

    public Venda(LocalDate data, String status_compra, String tipo_pagamento, double valor, funcionario funcionario_id, cliente cliente_id) {
        this.data = data;
        this.status_compra = status_compra;
        this.tipo_pagamento = tipo_pagamento;
        this.valor = valor;
        this.funcionario_id = funcionario_id;
        this.cliente_id = cliente_id;
    }

    // Métodos getter e setter
    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public String getStatus_compra() {
        return status_compra;
    }

    public String getTipo_pagamento() {
        return tipo_pagamento;
    }

    public double getValor() {
        return valor;
    }

    public funcionario getFuncionario_id() {
        return funcionario_id;
    }

    public cliente getCliente_id() {
        return cliente_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setStatus_compra(String status_compra) {
        this.status_compra = status_compra;
    }

    public void setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setFuncionario_id(funcionario funcionario_id) {
        this.funcionario_id = funcionario_id;
    }

    public void setCliente_id(cliente cliente_id) {
        this.cliente_id = cliente_id;
    }
}
