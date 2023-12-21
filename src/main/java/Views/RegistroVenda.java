/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Classes.cliente;
import Classes.funcionario;
import Classes.Venda;
import Persistence.ClienteDAO;
import Persistence.FuncionarioDAO;
import Persistence.VendaDAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class RegistroVenda extends javax.swing.JFrame {

    /**
     * Creates new form RegistroVenda
     */
    public RegistroVenda() {
        initComponents();
        preencheComboClientes();
        preencheComboFuncionario();
        
        
        
    }
    private void preencheComboClientes() {
        ClienteDAO clienteDao = new ClienteDAO();
        List<cliente> clirntes = clienteDao.listar();

        for (cliente c : clirntes) {
            cboxCliente.addItem(c);
        }

        
}
    private void preencheComboFuncionario() {
        FuncionarioDAO funcioDao = new FuncionarioDAO();
        List<funcionario> funiconas = funcioDao.listar();

    
        for (funcionario f : funiconas) {
            cboxFuncionario.addItem(f);
        }

}

    public void atl_info(String nome , String tipoo){
        labUsuario.setText(nome);
        labCargo.setText(tipoo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labCargo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrarVenda = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cboxCliente = new javax.swing.JComboBox<>();
        fmtData = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        cboxFormaPagamento = new javax.swing.JComboBox<>();
        cboxStatusCompra = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cboxFuncionario = new javax.swing.JComboBox<>();
        fmtValor = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Vendas");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(680, 400));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Desktop\\CURSO TI\\M1\\PI\\Atividade4\\Biblioteca\\src\\main\\java\\Imagens\\icons8-macho-de-configurações-de-admin-24.png")); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(6, 7, 24, 24);

        labUsuario.setBackground(new java.awt.Color(0, 102, 153));
        labUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labUsuario.setText("Usuario");
        labUsuario.setOpaque(true);
        jPanel1.add(labUsuario);
        labUsuario.setBounds(36, 7, 140, 25);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Desktop\\CURSO TI\\M1\\PI\\Atividade4\\Biblioteca\\src\\main\\java\\Imagens\\chaise-de-bureau.png")); // NOI18N
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(182, 6, 24, 26);

        labCargo.setBackground(new java.awt.Color(0, 102, 153));
        labCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labCargo.setForeground(new java.awt.Color(255, 255, 255));
        labCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCargo.setText("Cargo");
        labCargo.setOpaque(true);
        jPanel1.add(labCargo);
        labCargo.setBounds(212, 7, 140, 25);

        jLabel6.setBackground(new java.awt.Color(0, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Data");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 80, 140, 30);

        btnRegistrarVenda.setBackground(new java.awt.Color(0, 153, 51));
        btnRegistrarVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVenda.setText("Registar Venda");
        btnRegistrarVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        btnRegistrarVenda.setContentAreaFilled(false);
        btnRegistrarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarVenda.setFocusPainted(false);
        btnRegistrarVenda.setOpaque(true);
        btnRegistrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVendaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarVenda);
        btnRegistrarVenda.setBounds(490, 360, 150, 23);

        btnVoltar.setBackground(new java.awt.Color(0, 51, 102));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setOpaque(true);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(20, 360, 45, 24);

        jLabel10.setBackground(new java.awt.Color(0, 51, 51));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Status Compra");
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 230, 230, 30);

        cboxCliente.setBackground(new java.awt.Color(255, 255, 255));
        cboxCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboxCliente.setForeground(new java.awt.Color(51, 51, 51));
        cboxCliente.setBorder(null);
        jPanel1.add(cboxCliente);
        cboxCliente.setBounds(360, 110, 141, 32);

        fmtData.setBackground(new java.awt.Color(255, 255, 255));
        fmtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        fmtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        fmtData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(fmtData);
        fmtData.setBounds(20, 110, 140, 30);

        jLabel11.setBackground(new java.awt.Color(0, 51, 51));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Funcionario");
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(190, 80, 140, 30);

        cboxFormaPagamento.setBackground(new java.awt.Color(255, 255, 255));
        cboxFormaPagamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboxFormaPagamento.setForeground(new java.awt.Color(51, 51, 51));
        cboxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Debito", "Credito", "Dinheiro", "Pix" }));
        cboxFormaPagamento.setBorder(null);
        jPanel1.add(cboxFormaPagamento);
        cboxFormaPagamento.setBounds(400, 260, 200, 32);

        cboxStatusCompra.setBackground(new java.awt.Color(255, 255, 255));
        cboxStatusCompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboxStatusCompra.setForeground(new java.awt.Color(51, 51, 51));
        cboxStatusCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagamento Confirmado", "Erro de Pagamento", "Devolução", "Aguardando Pagamento" }));
        cboxStatusCompra.setBorder(null);
        jPanel1.add(cboxStatusCompra);
        cboxStatusCompra.setBounds(60, 260, 230, 32);

        jLabel12.setBackground(new java.awt.Color(0, 51, 51));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Forma Pagamento");
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(400, 230, 200, 30);

        jLabel13.setBackground(new java.awt.Color(0, 51, 51));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cliente");
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(360, 80, 140, 30);

        cboxFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        cboxFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboxFuncionario.setForeground(new java.awt.Color(51, 51, 51));
        cboxFuncionario.setBorder(null);
        cboxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(cboxFuncionario);
        cboxFuncionario.setBounds(190, 110, 140, 32);

        fmtValor.setBackground(new java.awt.Color(255, 255, 255));
        fmtValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        fmtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        fmtValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fmtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmtValorActionPerformed(evt);
            }
        });
        jPanel1.add(fmtValor);
        fmtValor.setBounds(530, 110, 140, 30);

        jLabel7.setBackground(new java.awt.Color(0, 51, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Valor");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(530, 80, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVendaActionPerformed
        Venda newVenda = new Venda();
        String status = (String) cboxStatusCompra.getSelectedItem();
        String forma_pag = (String) cboxFormaPagamento.getSelectedItem();
        funcionario contafuncionarioselect; 
        contafuncionarioselect =(funcionario) cboxFuncionario.getSelectedItem();
        cliente contaclienteselect;
        contaclienteselect = (cliente) cboxCliente.getSelectedItem();
        
        try{
            
            newVenda.setData(LocalDate.parse(fmtData.getText(),
             DateTimeFormatter.ofPattern("dd/MM/y")));
            
            newVenda.setStatus_compra(status);
            
            newVenda.setTipo_pagamento(forma_pag);
            
            newVenda.setValor(Double.parseDouble(fmtValor.getText().replace(",", ".")));
            
            newVenda.setFuncionario_id(contafuncionarioselect);
            
            newVenda.setCliente_id(contaclienteselect);
            
            VendaDAO vendaDao = new VendaDAO();
            vendaDao.cadastrar(newVenda);
            
            JOptionPane.showMessageDialog(this, "Venda Registrada com sucesso:\n" +
                "Data: " + newVenda.getData()+ "\n" +
                "Status_compra: " + newVenda.getStatus_compra()+ "\n" +
                "Tipo_pagamento: " + newVenda.getTipo_pagamento()+ "\n" +
                "Valor: " + newVenda.getValor()+ "\n" +
                "Funcionario: " + contafuncionarioselect.getNome()+ "\n" +
                "Cliente: " + contaclienteselect.getNome());
            

        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Ocorreu uma falha:\n" + e.getMessage());
            }
        
        
        
    }//GEN-LAST:event_btnRegistrarVendaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        TMenu telanova = new TMenu();
        telanova.atl_info(labUsuario.getText(), labCargo.getText());
        telanova.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void fmtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmtValorActionPerformed

    private void cboxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxFuncionarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarVenda;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<cliente> cboxCliente;
    private javax.swing.JComboBox<String> cboxFormaPagamento;
    private javax.swing.JComboBox<funcionario> cboxFuncionario;
    private javax.swing.JComboBox<String> cboxStatusCompra;
    private javax.swing.JFormattedTextField fmtData;
    private javax.swing.JFormattedTextField fmtValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labCargo;
    private javax.swing.JLabel labUsuario;
    // End of variables declaration//GEN-END:variables
}
