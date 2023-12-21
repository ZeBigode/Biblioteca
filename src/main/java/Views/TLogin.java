/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Classes.UsuarioBD;
import Classes.usuario;
import Persistence.Criptografia;
import Persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class TLogin extends javax.swing.JFrame {

    
    
    public TLogin() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        pstSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(680, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 101, 107));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 400));
        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(0, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Usuario");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 140, 140, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BEM VINDO !!!");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 350, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Desktop\\CURSO TI\\M1\\PI\\Atividade4\\Biblioteca\\src\\main\\java\\Imagens\\icon_biblioteca_rect.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 347, 400);

        btnEntrar.setBackground(new java.awt.Color(0, 153, 51));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar.setFocusPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar);
        btnEntrar.setBounds(500, 370, 72, 23);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inicie sua sessao");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, 30, 210, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Desktop\\CURSO TI\\M1\\PI\\Atividade4\\Biblioteca\\src\\main\\java\\Imagens\\icons8-usuário-96.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(470, 60, 96, 80);

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Senha");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(450, 200, 140, 30);

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome);
        txtNome.setBounds(450, 170, 140, 30);

        pstSenha.setBackground(new java.awt.Color(255, 255, 255));
        pstSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pstSenha.setForeground(new java.awt.Color(0, 0, 0));
        pstSenha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pstSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel1.add(pstSenha);
        pstSenha.setBounds(450, 230, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        usuario usuario = new usuario();

        // Atribuimos os valores Login e Senha baseado nos dados dos componentes JTextField
        usuario.setLogin(txtNome.getText());
        usuario.setSenha(Criptografia.getMD5(pstSenha.getText()));        

        // Exemplo de SQL Injection baseada em booleano
        usuario = UsuarioBD.validarUsuarioSeguro(usuario);


        // "Reescrevemos" os valores do objeto baseado na resposta do método
        // Se nenhum registro for encontrado, teremos um usuário NULO           
        if (usuario != null) {
            // Dependendo do tipo de usuário, levamos a uma página diferente
            if( usuario.getTipo().equalsIgnoreCase("Gerente") ) {
                JOptionPane.showMessageDialog(null, "“Olá "+ usuario.getNome() +", sua permissão é de "+ usuario.getTipo() +". Seja bem-vindo!”" + "");
                TMenu telanova = new TMenu();
                telanova.setTipo(usuario.getTipo());
                telanova.atl_info(usuario.getNome() , usuario.getTipo());
                telanova.setVisible(true);
                
                
            } else if ( usuario.getTipo().equalsIgnoreCase("Atendente") ) {
                JOptionPane.showMessageDialog(null, "“Olá "+ usuario.getNome() +", sua permissão é de "+ usuario.getTipo() +". Seja bem-vindo!”" + "");
          
                TMenu telanova = new TMenu();
                telanova.setTipo(usuario.getTipo());
                telanova.atl_info(usuario.getNome() , usuario.getTipo());
                telanova.setVisiblecomponet();
                telanova.setVisible(true);
    
            } else {
                JOptionPane.showMessageDialog(null,"“Olá "+ usuario.getNome() +", sua permissão é de "+ usuario.getTipo() +". Seja bem-vindo!”" + "");
            
                PesquisarLivro novatela = new PesquisarLivro();
                novatela.atl_info(usuario.getNome() , usuario.getTipo());
                novatela.setTipo_usu(usuario.getTipo());
                novatela.setVisible(true);
                
                
            }

        } else {
            JOptionPane.showMessageDialog(null, "Erro de autenticação! Verifique se os dados estão corretos.");
        }
        
                
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

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
                if ("Windwons".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pstSenha;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
