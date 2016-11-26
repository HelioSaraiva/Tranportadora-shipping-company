/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;
 

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansLogin;
import modeloConection.ConexaoBD;

public class Login extends javax.swing.JFrame {
 ConexaoBD conex = new ConexaoBD();
 BeansLogin mod = new BeansLogin();
    public Login() {
        initComponents();
        conex.Conexao();
    }
    
       
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelloginNome = new javax.swing.JLabel();
        jLabelSenhaLogin = new javax.swing.JLabel();
        jTextFieldLoginNome = new javax.swing.JTextField();
        jPasswordFieldloginSenha = new javax.swing.JPasswordField();
        jButtonLogAcessar = new javax.swing.JButton();
        jButtonLogCanc = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(529, 300));
        getContentPane().setLayout(null);

        jLabelloginNome.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabelloginNome.setText("Login.:");
        getContentPane().add(jLabelloginNome);
        jLabelloginNome.setBounds(250, 120, 50, 11);

        jLabelSenhaLogin.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabelSenhaLogin.setText("Senha.:");
        getContentPane().add(jLabelSenhaLogin);
        jLabelSenhaLogin.setBounds(250, 160, 50, 11);
        getContentPane().add(jTextFieldLoginNome);
        jTextFieldLoginNome.setBounds(300, 110, 130, 30);
        getContentPane().add(jPasswordFieldloginSenha);
        jPasswordFieldloginSenha.setBounds(300, 150, 130, 30);

        jButtonLogAcessar.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jButtonLogAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add.png"))); // NOI18N
        jButtonLogAcessar.setText("Acessar");
        jButtonLogAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogAcessar);
        jButtonLogAcessar.setBounds(220, 200, 110, 25);

        jButtonLogCanc.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jButtonLogCanc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cross.png"))); // NOI18N
        jButtonLogCanc.setText("Cancelar");
        jButtonLogCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogCancActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogCanc);
        jButtonLogCanc.setBounds(340, 200, 120, 25);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/oie_transparent2.png"))); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(10, 40, 230, 90);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos-para-fotos-verde (3).jpg"))); // NOI18N
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 500, 270);

        setSize(new java.awt.Dimension(494, 271));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogCancActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButtonLogCancActionPerformed

    private void jButtonLogAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogAcessarActionPerformed
       try {
         conex.Executasql("select *from login where usu_nome='"+jTextFieldLoginNome.getText()+"'");
         conex.rs.first();
            
         if(conex.rs.getString("usu_senha").equals(jPasswordFieldloginSenha.getText())){
        
             TelaPrincipal tela = new TelaPrincipal(jTextFieldLoginNome.getText());
             tela.setVisible(true);
             dispose();
        
         }else{
             
             JOptionPane.showMessageDialog(rootPane, "Usuário ou senha invalido!!");
         }
     } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane, "Usuário ou senha invalido!!"+ex);
     }
       
    }//GEN-LAST:event_jButtonLogAcessarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogAcessar;
    private javax.swing.JButton jButtonLogCanc;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSenhaLogin;
    private javax.swing.JLabel jLabelloginNome;
    private javax.swing.JPasswordField jPasswordFieldloginSenha;
    private javax.swing.JTextField jTextFieldLoginNome;
    // End of variables declaration//GEN-END:variables
}
