/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Classes.livro;
import Persistence.LivroDAO;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class PesquisarLivro extends javax.swing.JFrame {

    private String tipo_usu = "";
    public PesquisarLivro() {
        initComponents();
        
        LivroDAO livroDao = new LivroDAO();
        List<livro> livros = livroDao.listar();
        preencheTabela(livros);
    }

    public void setTipo_usu(String tipo_usu) {
        this.tipo_usu = tipo_usu;
    }

    public void preencheTabela(List<livro> livros){      
        String columns[] = {"Id", "Nome", "Autor", "Tipo","Valor"};
        String dados[][] = new String[livros.size()][columns.length];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/y");
        int i=0;
        for(livro l: livros){
            dados[i] = new String[]{ 
                String.valueOf(l.getId()), 
                l.getNome(), 
                l.getAutor(),
                l.getTipo(),
                String.valueOf(l.getValor())
            }; 
                
            i++;
        }

        DefaultTableModel model = new DefaultTableModel(dados, columns);
        tabela.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labCargo = new javax.swing.JLabel();
        btnPesquisarPor = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        cboxpes_por = new javax.swing.JComboBox<>();
        btnPesquisar = new javax.swing.JButton();
        txtPes_por = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquiar Livros");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 400));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Desktop\\CURSO TI\\M1\\PI\\Atividade4\\Biblioteca\\src\\main\\java\\Imagens\\icons8-macho-de-configurações-de-admin-24.png")); // NOI18N
        jLabel1.setOpaque(true);

        labUsuario.setBackground(new java.awt.Color(0, 102, 153));
        labUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labUsuario.setText("Usuario");
        labUsuario.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Desktop\\CURSO TI\\M1\\PI\\Atividade4\\Biblioteca\\src\\main\\java\\Imagens\\chaise-de-bureau.png")); // NOI18N
        jLabel4.setOpaque(true);

        labCargo.setBackground(new java.awt.Color(0, 102, 153));
        labCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labCargo.setForeground(new java.awt.Color(255, 255, 255));
        labCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCargo.setText("Cargo");
        labCargo.setOpaque(true);

        btnPesquisarPor.setBackground(new java.awt.Color(0, 153, 51));
        btnPesquisarPor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisarPor.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarPor.setText("Pesquisar");
        btnPesquisarPor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        btnPesquisarPor.setContentAreaFilled(false);
        btnPesquisarPor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisarPor.setFocusPainted(false);
        btnPesquisarPor.setOpaque(true);
        btnPesquisarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPorActionPerformed(evt);
            }
        });

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

        cboxpes_por.setBackground(new java.awt.Color(255, 255, 255));
        cboxpes_por.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboxpes_por.setForeground(new java.awt.Color(51, 51, 51));
        cboxpes_por.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Autor", "Tipo" }));
        cboxpes_por.setBorder(null);

        btnPesquisar.setBackground(new java.awt.Color(0, 153, 51));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisar.setFocusPainted(false);
        btnPesquisar.setOpaque(true);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtPes_por.setBackground(new java.awt.Color(255, 255, 255));
        txtPes_por.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPes_por.setForeground(new java.awt.Color(0, 0, 0));
        txtPes_por.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        txtPes_por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPes_porActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 51, 51));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Pesquisar por");
        jLabel11.setOpaque(true);

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2), "Livros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        tabela.setBackground(new java.awt.Color(153, 255, 255));
        tabela.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tabela.setForeground(new java.awt.Color(0, 51, 51));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela.setOpaque(false);
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboxpes_por, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPes_por, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(473, 473, 473)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labUsuario)
                        .addComponent(labCargo)
                        .addComponent(jLabel1))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxpes_por, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPes_por, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar))
                .addGap(9, 9, 9))
        );

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

    private void btnPesquisarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPorActionPerformed
        String filtro = (String)cboxpes_por.getSelectedItem();
        String txtFiltro = txtPes_por.getText();
        
        if (filtro.equalsIgnoreCase("Nome")){
            LivroDAO livroDao = new LivroDAO();
            List<livro> livros = livroDao.listarNome(txtFiltro);
            preencheTabela(livros);
        }
        else if(filtro.equalsIgnoreCase("Autor")){
            LivroDAO livroDao = new LivroDAO();
            List<livro> livros = livroDao.listarAutor(txtFiltro);
            preencheTabela(livros);
        }
        else{
            LivroDAO livroDao = new LivroDAO();
            List<livro> livros = livroDao.listarTipo(txtFiltro);
            preencheTabela(livros);
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnPesquisarPorActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        LivroDAO livroDao = new LivroDAO();
        List<livro> livros = livroDao.listar();
        preencheTabela(livros);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPes_porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPes_porActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPes_porActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if(tipo_usu.equalsIgnoreCase("Cliente")){
            dispose();
        }else{
            dispose();
            TMenu telanova = new TMenu();
            telanova.atl_info(labUsuario.getText(), labCargo.getText());
            telanova.setVisible(true);
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarPor;
    private javax.swing.JButton btnVoltar;
    javax.swing.JComboBox<String> cboxpes_por;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labCargo;
    private javax.swing.JLabel labUsuario;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPes_por;
    // End of variables declaration//GEN-END:variables

    public void atl_info(String nome , String tipoo){
        labUsuario.setText(nome);
        labCargo.setText(tipoo);
    }
}
