/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloDao.DaoClientes;
import modeloBeans.BeansClientes;
import modeloBeans.ModeloTabelaCli;




/**
 *
 * @author Buzato
 */
public class CadastroClientes extends javax.swing.JFrame {

        BeansClientes mod = new BeansClientes();
        DaoClientes control = new DaoClientes();
        ConexaoBD conex = new ConexaoBD();
        int flag =0;
        
    
    public CadastroClientes() {
        initComponents();
        preencherTabela("select *from clientes order by cli_rzsocial ");
        jButtonCliEditar.setEnabled(false);
         jButtonCliExcluir.setEnabled(false);
         jButtonCliSalvar.setEnabled(false);
         jButtonCliNovo.setEnabled(true);
         jButtonCliCancelar.setEnabled(false);
         jFormattedTextFieldCliCNPJ.setEnabled(false);
         jTextFieldCliRzSocial.setEnabled(false);        
         jTextFieldCliEnd.setEnabled(false);
         jTextFieldCliNum.setEnabled(false);
         jTextFieldCliBairro.setEnabled(false); 
         jTextFieldCliCidade.setEnabled(false);
         jComboBoxCliUF.setEnabled(false); 
         jFormattedTextFieldCliCEP.setEnabled(false); 
         jFormattedTextFieldCliTelCom.setEnabled(false);  
         jFormattedTextFieldCliTelCel.setEnabled(false);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadClientes = new javax.swing.JPanel();
        jLabelCliCNPJ = new javax.swing.JLabel();
        jLabelCliRzSocial = new javax.swing.JLabel();
        jLabelCliEnd = new javax.swing.JLabel();
        jLabelCliTelCom = new javax.swing.JLabel();
        jLabelCliTelCel = new javax.swing.JLabel();
        jLabelCliNum = new javax.swing.JLabel();
        jTextFieldCliRzSocial = new javax.swing.JTextField();
        jTextFieldCliEnd = new javax.swing.JTextField();
        jTextFieldCliNum = new javax.swing.JTextField();
        jLabelCliCEP = new javax.swing.JLabel();
        jLabelCliBairro = new javax.swing.JLabel();
        jTextFieldCliBairro = new javax.swing.JTextField();
        jLabelCliCidade = new javax.swing.JLabel();
        jTextFieldCliCidade = new javax.swing.JTextField();
        jLabelCliUF = new javax.swing.JLabel();
        jComboBoxCliUF = new javax.swing.JComboBox<>();
        jButtonCliNovo = new javax.swing.JButton();
        jButtonCliSalvar = new javax.swing.JButton();
        jButtonCliCancelar = new javax.swing.JButton();
        jButtonCliEditar = new javax.swing.JButton();
        jButtonCliExcluir = new javax.swing.JButton();
        jTextFieldCliPesq = new javax.swing.JTextField();
        jButtonCliPesq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliPesq = new javax.swing.JTable();
        jFormattedTextFieldCliCNPJ = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCliCEP = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCliTelCom = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCliTelCel = new javax.swing.JFormattedTextField();
        jLabelIdCli = new javax.swing.JLabel();
        jTextFieldIdCli = new javax.swing.JTextField();
        jLabelFundoClientes = new javax.swing.JLabel();
        jLabelCadCliente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanelCadClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCadClientes.setLayout(null);

        jLabelCliCNPJ.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelCliCNPJ.setText("CNPJ / CPF.:");
        jPanelCadClientes.add(jLabelCliCNPJ);
        jLabelCliCNPJ.setBounds(130, 40, 80, 30);

        jLabelCliRzSocial.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelCliRzSocial.setText("Nome  / Razão Social.:");
        jPanelCadClientes.add(jLabelCliRzSocial);
        jLabelCliRzSocial.setBounds(70, 70, 140, 30);

        jLabelCliEnd.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelCliEnd.setText("Endereço.:");
        jPanelCadClientes.add(jLabelCliEnd);
        jLabelCliEnd.setBounds(130, 101, 80, 30);

        jLabelCliTelCom.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelCliTelCom.setText("Telefone Comercial.:");
        jPanelCadClientes.add(jLabelCliTelCom);
        jLabelCliTelCom.setBounds(310, 160, 140, 30);

        jLabelCliTelCel.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelCliTelCel.setText("Telefone Celular.:");
        jPanelCadClientes.add(jLabelCliTelCel);
        jLabelCliTelCel.setBounds(560, 160, 130, 30);

        jLabelCliNum.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelCliNum.setText("Número.:");
        jPanelCadClientes.add(jLabelCliNum);
        jLabelCliNum.setBounds(140, 130, 60, 30);
        jPanelCadClientes.add(jTextFieldCliRzSocial);
        jTextFieldCliRzSocial.setBounds(210, 70, 610, 30);
        jPanelCadClientes.add(jTextFieldCliEnd);
        jTextFieldCliEnd.setBounds(210, 100, 610, 30);

        jTextFieldCliNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCliNumActionPerformed(evt);
            }
        });
        jPanelCadClientes.add(jTextFieldCliNum);
        jTextFieldCliNum.setBounds(210, 130, 60, 30);

        jLabelCliCEP.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelCliCEP.setText("CEP.:");
        jPanelCadClientes.add(jLabelCliCEP);
        jLabelCliCEP.setBounds(160, 160, 40, 30);

        jLabelCliBairro.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelCliBairro.setText("Bairro.:");
        jPanelCadClientes.add(jLabelCliBairro);
        jLabelCliBairro.setBounds(280, 140, 60, 13);
        jPanelCadClientes.add(jTextFieldCliBairro);
        jTextFieldCliBairro.setBounds(340, 130, 150, 30);

        jLabelCliCidade.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelCliCidade.setText("Cidade.:");
        jPanelCadClientes.add(jLabelCliCidade);
        jLabelCliCidade.setBounds(500, 140, 60, 13);
        jPanelCadClientes.add(jTextFieldCliCidade);
        jTextFieldCliCidade.setBounds(560, 130, 160, 30);

        jLabelCliUF.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelCliUF.setText("UF.:");
        jPanelCadClientes.add(jLabelCliUF);
        jLabelCliUF.setBounds(730, 140, 23, 13);

        jComboBoxCliUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM\t ", "BA\t ", "CE\t ", "DF\t ", "ES\t ", "GO\t ", "MA\t ", "MT\t ", "MS\t ", "MG\t ", "PA\t ", "PB\t ", "PR\t ", "PE\t ", "PI\t ", "RJ\t ", "RN\t ", "RS\t ", "RO\t ", "RR\t ", "SC\t ", "SP\t ", "SE\t ", "TO" }));
        jPanelCadClientes.add(jComboBoxCliUF);
        jComboBoxCliUF.setBounds(760, 130, 60, 30);

        jButtonCliNovo.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButtonCliNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add.png"))); // NOI18N
        jButtonCliNovo.setText("Novo");
        jButtonCliNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCliNovoActionPerformed(evt);
            }
        });
        jPanelCadClientes.add(jButtonCliNovo);
        jButtonCliNovo.setBounds(80, 220, 110, 30);

        jButtonCliSalvar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButtonCliSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cloud 2.png"))); // NOI18N
        jButtonCliSalvar.setText("Salvar");
        jButtonCliSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCliSalvarActionPerformed(evt);
            }
        });
        jPanelCadClientes.add(jButtonCliSalvar);
        jButtonCliSalvar.setBounds(80, 260, 110, 30);

        jButtonCliCancelar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButtonCliCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cross.png"))); // NOI18N
        jButtonCliCancelar.setText("Cancelar");
        jButtonCliCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCliCancelarActionPerformed(evt);
            }
        });
        jPanelCadClientes.add(jButtonCliCancelar);
        jButtonCliCancelar.setBounds(80, 300, 110, 30);

        jButtonCliEditar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButtonCliEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pencil.png"))); // NOI18N
        jButtonCliEditar.setText("Editar");
        jButtonCliEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCliEditarActionPerformed(evt);
            }
        });
        jPanelCadClientes.add(jButtonCliEditar);
        jButtonCliEditar.setBounds(80, 340, 110, 30);

        jButtonCliExcluir.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButtonCliExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remove.png"))); // NOI18N
        jButtonCliExcluir.setText("Excluir");
        jButtonCliExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCliExcluirActionPerformed(evt);
            }
        });
        jPanelCadClientes.add(jButtonCliExcluir);
        jButtonCliExcluir.setBounds(80, 380, 110, 30);
        jPanelCadClientes.add(jTextFieldCliPesq);
        jTextFieldCliPesq.setBounds(230, 230, 440, 30);

        jButtonCliPesq.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButtonCliPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Search 1.png"))); // NOI18N
        jButtonCliPesq.setText("Pesquisar");
        jButtonCliPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCliPesqActionPerformed(evt);
            }
        });
        jPanelCadClientes.add(jButtonCliPesq);
        jButtonCliPesq.setBounds(680, 230, 120, 30);

        jTableCliPesq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCliPesq);

        jPanelCadClientes.add(jScrollPane1);
        jScrollPane1.setBounds(230, 260, 620, 150);

        jFormattedTextFieldCliCNPJ.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanelCadClientes.add(jFormattedTextFieldCliCNPJ);
        jFormattedTextFieldCliCNPJ.setBounds(210, 40, 130, 30);
        jPanelCadClientes.add(jFormattedTextFieldCliCEP);
        jFormattedTextFieldCliCEP.setBounds(210, 160, 90, 30);
        jPanelCadClientes.add(jFormattedTextFieldCliTelCom);
        jFormattedTextFieldCliTelCom.setBounds(450, 160, 100, 30);
        jPanelCadClientes.add(jFormattedTextFieldCliTelCel);
        jFormattedTextFieldCliTelCel.setBounds(690, 160, 100, 30);

        jLabelIdCli.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelIdCli.setText("ID.:");
        jPanelCadClientes.add(jLabelIdCli);
        jLabelIdCli.setBounds(180, 10, 30, 30);

        jTextFieldIdCli.setEnabled(false);
        jPanelCadClientes.add(jTextFieldIdCli);
        jTextFieldIdCli.setBounds(210, 10, 80, 30);

        jLabelFundoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos-para-fotos-verde (3).jpg"))); // NOI18N
        jPanelCadClientes.add(jLabelFundoClientes);
        jLabelFundoClientes.setBounds(0, 0, 1080, 440);

        getContentPane().add(jPanelCadClientes);
        jPanelCadClientes.setBounds(30, 40, 1080, 440);

        jLabelCadCliente.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabelCadCliente.setText("Cadastro de Clientes");
        getContentPane().add(jLabelCadCliente);
        jLabelCadCliente.setBounds(470, 10, 311, 19);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cross.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1083, 10, 20, 25);

        setSize(new java.awt.Dimension(1130, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCliNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCliNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCliNumActionPerformed

    private void jButtonCliNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCliNovoActionPerformed
        flag=1;
            jTextFieldIdCli.setText("");
            jFormattedTextFieldCliCNPJ.setText("");
            jTextFieldCliRzSocial.setText("");
            jTextFieldCliEnd.setText("");
            jTextFieldCliNum.setText("");
            jTextFieldCliBairro.setText("");
            jTextFieldCliCidade.setText("");
            jFormattedTextFieldCliCEP.setText("");
            jFormattedTextFieldCliTelCom.setText("");
            jFormattedTextFieldCliTelCel.setText("");
            jTextFieldCliPesq.setText("");
        jFormattedTextFieldCliCNPJ.setEnabled(true);
        jTextFieldCliRzSocial.setEnabled(true);        
        jTextFieldCliEnd.setEnabled(true);
        jTextFieldCliNum.setEnabled(true);
        jTextFieldCliBairro.setEnabled(true); 
        jTextFieldCliCidade.setEnabled(true);
        jComboBoxCliUF.setEnabled(true); 
        jFormattedTextFieldCliCEP.setEnabled(true); 
        jFormattedTextFieldCliTelCom.setEnabled(true);  
        jFormattedTextFieldCliTelCel.setEnabled(true);
        jTextFieldCliPesq.setEnabled(true);
        jButtonCliEditar.setEnabled(false);
         jButtonCliExcluir.setEnabled(false);
         jButtonCliSalvar.setEnabled(true);
         jButtonCliNovo.setEnabled(false);
         jButtonCliCancelar.setEnabled(true);
         jButtonCliPesq.setEnabled(true);
                
    }//GEN-LAST:event_jButtonCliNovoActionPerformed

    private void jButtonCliSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCliSalvarActionPerformed
       
        if(flag ==1){
            mod.setClicnpj(jFormattedTextFieldCliCNPJ.getText());
            mod.setClirzsocial(jTextFieldCliRzSocial.getText());
            mod.setCliend(jTextFieldCliEnd.getText());
            mod.setClinum(Integer.parseInt(jTextFieldCliNum.getText()));
            mod.setClibairro(jTextFieldCliBairro.getText());
            mod.setClicidade(jTextFieldCliCidade.getText());
            mod.setCliuf((String) jComboBoxCliUF.getSelectedItem());
            mod.setClicep(jFormattedTextFieldCliCEP.getText());
            mod.setClitelcom (jFormattedTextFieldCliTelCom.getText());
            mod.setClitelcel(jFormattedTextFieldCliTelCel.getText());
            control.Salvar(mod);
            jTextFieldIdCli.setText("");
            jFormattedTextFieldCliCNPJ.setText("");
            jTextFieldCliRzSocial.setText("");
            jTextFieldCliEnd.setText("");
            jTextFieldCliNum.setText("");
            jTextFieldCliBairro.setText("");
            jTextFieldCliCidade.setText("");
            jFormattedTextFieldCliCEP.setText("");
            jFormattedTextFieldCliTelCom.setText("");
            jFormattedTextFieldCliTelCel.setText("");
            jTextFieldCliPesq.setText("");
            jFormattedTextFieldCliCNPJ.setEnabled(false);
            jTextFieldCliRzSocial.setEnabled(false);
            jTextFieldCliEnd.setEnabled(false);
            jTextFieldCliNum.setEnabled(false);
            jTextFieldCliBairro.setEnabled(false);
            jTextFieldCliCidade.setEnabled(false);
            jFormattedTextFieldCliCEP.setEnabled(false);
            jFormattedTextFieldCliTelCom.setEnabled(false);
            jFormattedTextFieldCliTelCel.setEnabled(false);
            jComboBoxCliUF.setEnabled(false);
            jButtonCliEditar.setEnabled(false);
            jButtonCliExcluir.setEnabled(false);
            jButtonCliSalvar.setEnabled(false);
            jButtonCliNovo.setEnabled(true);
            jButtonCliCancelar.setEnabled(false);
        }else {
        
            mod.setIdcli(Integer.parseInt(jTextFieldIdCli.getText()));
            mod.setClicnpj(jFormattedTextFieldCliCNPJ.getText());
            mod.setClirzsocial(jTextFieldCliRzSocial.getText());
            mod.setCliend(jTextFieldCliEnd.getText());
            mod.setClinum(Integer.parseInt(jTextFieldCliNum.getText()));
            mod.setClibairro(jTextFieldCliBairro.getText());
            mod.setClicidade(jTextFieldCliCidade.getText());
            mod.setCliuf((String) jComboBoxCliUF.getSelectedItem());
            mod.setClicep(jFormattedTextFieldCliCEP.getText());
            mod.setClitelcom (jFormattedTextFieldCliTelCom.getText());
            mod.setClitelcel(jFormattedTextFieldCliTelCel.getText());
            control.Editar(mod);
            jTextFieldIdCli.setText("");
            jFormattedTextFieldCliCNPJ.setText("");
            jTextFieldCliRzSocial.setText("");
            jTextFieldCliEnd.setText("");
            jTextFieldCliNum.setText("");
            jTextFieldCliBairro.setText("");
            jTextFieldCliCidade.setText("");
            jFormattedTextFieldCliCEP.setText("");
            jFormattedTextFieldCliTelCom.setText("");
            jFormattedTextFieldCliTelCel.setText("");
            jTextFieldCliPesq.setText("");
            jFormattedTextFieldCliCNPJ.setEnabled(false);
            jTextFieldCliRzSocial.setEnabled(false);
            jTextFieldCliEnd.setEnabled(false);
            jTextFieldCliNum.setEnabled(false);
            jTextFieldCliBairro.setEnabled(false);
            jTextFieldCliCidade.setEnabled(false);
            jFormattedTextFieldCliCEP.setEnabled(false);
            jFormattedTextFieldCliTelCom.setEnabled(false);
            jFormattedTextFieldCliTelCel.setEnabled(false);
            jComboBoxCliUF.setEnabled(false);
            jButtonCliEditar.setEnabled(false);
            jButtonCliExcluir.setEnabled(false);
            jButtonCliSalvar.setEnabled(false);
            jButtonCliNovo.setEnabled(true);
            jButtonCliCancelar.setEnabled(false);
            
            
        }
    
        
    }//GEN-LAST:event_jButtonCliSalvarActionPerformed

    private void jButtonCliEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCliEditarActionPerformed
        flag=2;
        jFormattedTextFieldCliCNPJ.setEnabled(true);
        jTextFieldCliRzSocial.setEnabled(true);        
        jTextFieldCliEnd.setEnabled(true);
        jTextFieldCliNum.setEnabled(true);
        jTextFieldCliBairro.setEnabled(true); 
        jTextFieldCliCidade.setEnabled(true);
        jComboBoxCliUF.setEnabled(true); 
        jFormattedTextFieldCliCEP.setEnabled(true); 
        jFormattedTextFieldCliTelCom.setEnabled(true);  
        jFormattedTextFieldCliTelCel.setEnabled(true);
        jTextFieldCliPesq.setEnabled(false);
        jButtonCliEditar.setEnabled(false);
        jButtonCliExcluir.setEnabled(false);
        jButtonCliSalvar.setEnabled(true);
        jButtonCliNovo.setEnabled(false);
        jButtonCliCancelar.setEnabled(true);
        jButtonCliPesq.setEnabled(false);
    }//GEN-LAST:event_jButtonCliEditarActionPerformed

    private void jButtonCliPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCliPesqActionPerformed
       
        preencherTabela("select *from clientes order by cli_rzsocial ");    
        mod.setPesquisa(jTextFieldCliPesq.getText());
            BeansClientes model = control.buscaClientes(mod);
            jTextFieldIdCli.setText(String.valueOf(model.getIdcli()));
            jFormattedTextFieldCliCNPJ.setText(model.getClicnpj());
            jTextFieldCliRzSocial.setText(model.getClirzsocial());
            jTextFieldCliEnd.setText(model.getCliend());
            jTextFieldCliNum.setText(String .valueOf(model.getClinum()));
            jTextFieldCliBairro.setText(model.getClibairro());
            jTextFieldCliCidade.setText(model.getClicidade());
            jComboBoxCliUF.setSelectedItem(model.getCliuf());
            jFormattedTextFieldCliCEP.setText(model.getClicep());
            jFormattedTextFieldCliTelCom.setText(model.getClitelcom());
            jFormattedTextFieldCliTelCel.setText(model.getClitelcel());
            jButtonCliEditar.setEnabled(true);
            jButtonCliExcluir.setEnabled(true);
            jButtonCliCancelar.setEnabled(true);
            jButtonCliSalvar.setEnabled(false);
            
    }//GEN-LAST:event_jButtonCliPesqActionPerformed

    private void jButtonCliCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCliCancelarActionPerformed
            
         jFormattedTextFieldCliCNPJ.setEnabled(!true);
        jTextFieldCliRzSocial.setEnabled(!true);        
        jTextFieldCliEnd.setEnabled(!true);
        jTextFieldCliNum.setEnabled(!true);
        jTextFieldCliBairro.setEnabled(!true); 
        jTextFieldCliCidade.setEnabled(!true);
        jComboBoxCliUF.setEnabled(!true); 
        jFormattedTextFieldCliCEP.setEnabled(!true); 
        jFormattedTextFieldCliTelCom.setEnabled(!true);  
        jFormattedTextFieldCliTelCel.setEnabled(!true);
        jTextFieldCliPesq.setEnabled(true);
        jButtonCliEditar.setEnabled(false);
         jButtonCliExcluir.setEnabled(false);
         jButtonCliSalvar.setEnabled(false);
         jButtonCliNovo.setEnabled(true);
         jButtonCliCancelar.setEnabled(false);
         jButtonCliPesq.setEnabled(true);
    }//GEN-LAST:event_jButtonCliCancelarActionPerformed

    private void jButtonCliExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCliExcluirActionPerformed
        
        int resposta=0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente excluir?");
                if(resposta == JOptionPane.YES_OPTION){
                
                    mod.setIdcli(Integer.parseInt(jTextFieldIdCli.getText()));
                    control.Excluir(mod);
                    jTextFieldIdCli.setText("");
                    jFormattedTextFieldCliCNPJ.setText("");
                    jTextFieldCliRzSocial.setText("");
                    jTextFieldCliEnd.setText("");
                    jTextFieldCliNum.setText("");
                    jTextFieldCliBairro.setText("");
                    jTextFieldCliCidade.setText("");
                    jFormattedTextFieldCliCEP.setText("");
                    jFormattedTextFieldCliTelCom.setText("");
                    jFormattedTextFieldCliTelCel.setText("");
                    jTextFieldCliPesq.setText("");
                    jFormattedTextFieldCliCNPJ.setEnabled(false);
                    jTextFieldCliRzSocial.setEnabled(false);        
                    jTextFieldCliEnd.setEnabled(false);
                    jTextFieldCliNum.setEnabled(false);
                    jTextFieldCliBairro.setEnabled(false); 
                    jTextFieldCliCidade.setEnabled(false);
                    jComboBoxCliUF.setEnabled(false); 
                    jFormattedTextFieldCliCEP.setEnabled(false); 
                    jFormattedTextFieldCliTelCom.setEnabled(false);  
                    jFormattedTextFieldCliTelCel.setEnabled(false);
                    jTextFieldCliPesq.setEnabled(true);
                    jButtonCliEditar.setEnabled(false);
                    jButtonCliExcluir.setEnabled(false);
                    jButtonCliSalvar.setEnabled(false);
                    jButtonCliNovo.setEnabled(true);
                    jButtonCliCancelar.setEnabled(false);
                    jButtonCliPesq.setEnabled(true);
                    
                    
                }
        
        
    }//GEN-LAST:event_jButtonCliExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
            dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void preencherTabela(String Sql){
    
        ArrayList dados = new ArrayList();
        String[] coluns = new String[]{"ID","CNPJ/CPF","RzSocial/Nome","Endereço"};
        conex.Conexao();
        conex.Executasql(Sql);
        try{
        conex.rs.first();
        do{
            dados.add(new Object[]{conex.rs.getInt("cod_cliente"),conex.rs.getString("cli_cnpj"),conex.rs.getString("cli_rzsocial"),conex.rs.getString("cli_end")});
        }while(conex.rs.next());
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Erro ao preencher array list"+ex.getMessage());
        
        } 
        ModeloTabelaCli modelo = new ModeloTabelaCli(dados, coluns);
        jTableCliPesq.setModel(modelo);
        jTableCliPesq.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableCliPesq.getColumnModel().getColumn(0).setResizable(false);
        jTableCliPesq.getColumnModel().getColumn(1).setPreferredWidth(102);
        jTableCliPesq.getColumnModel().getColumn(1).setResizable(false);
        jTableCliPesq.getColumnModel().getColumn(2).setPreferredWidth(230);
        jTableCliPesq.getColumnModel().getColumn(2).setResizable(false);
        jTableCliPesq.getColumnModel().getColumn(3).setPreferredWidth(245);
        jTableCliPesq.getColumnModel().getColumn(3).setResizable(false);
        jTableCliPesq.getTableHeader().setReorderingAllowed(false);
        jTableCliPesq.setAutoResizeMode(jTableCliPesq.AUTO_RESIZE_OFF);
        jTableCliPesq.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.Desconecta();
    }
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
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCliCancelar;
    private javax.swing.JButton jButtonCliEditar;
    private javax.swing.JButton jButtonCliExcluir;
    private javax.swing.JButton jButtonCliNovo;
    private javax.swing.JButton jButtonCliPesq;
    private javax.swing.JButton jButtonCliSalvar;
    private javax.swing.JComboBox<String> jComboBoxCliUF;
    private javax.swing.JFormattedTextField jFormattedTextFieldCliCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCliCNPJ;
    private javax.swing.JFormattedTextField jFormattedTextFieldCliTelCel;
    private javax.swing.JFormattedTextField jFormattedTextFieldCliTelCom;
    private javax.swing.JLabel jLabelCadCliente;
    private javax.swing.JLabel jLabelCliBairro;
    private javax.swing.JLabel jLabelCliCEP;
    private javax.swing.JLabel jLabelCliCNPJ;
    private javax.swing.JLabel jLabelCliCidade;
    private javax.swing.JLabel jLabelCliEnd;
    private javax.swing.JLabel jLabelCliNum;
    private javax.swing.JLabel jLabelCliRzSocial;
    private javax.swing.JLabel jLabelCliTelCel;
    private javax.swing.JLabel jLabelCliTelCom;
    private javax.swing.JLabel jLabelCliUF;
    private javax.swing.JLabel jLabelFundoClientes;
    private javax.swing.JLabel jLabelIdCli;
    private javax.swing.JPanel jPanelCadClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliPesq;
    private javax.swing.JTextField jTextFieldCliBairro;
    private javax.swing.JTextField jTextFieldCliCidade;
    private javax.swing.JTextField jTextFieldCliEnd;
    private javax.swing.JTextField jTextFieldCliNum;
    private javax.swing.JTextField jTextFieldCliPesq;
    private javax.swing.JTextField jTextFieldCliRzSocial;
    private javax.swing.JTextField jTextFieldIdCli;
    // End of variables declaration//GEN-END:variables
}
