/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloDao.DaoFuncionarios;
import modeloBeans.BeansFuncionario;
import modeloBeans.ModeloTabelaFunc;





/**
 *
 * @author Buzato
 */
public class CadastroFuncionario extends javax.swing.JFrame {

        BeansFuncionario modf = new BeansFuncionario();
        DaoFuncionarios control = new DaoFuncionarios();
        ConexaoBD conex = new ConexaoBD();
        
        int flag =0;
        
    
    public CadastroFuncionario() {
        initComponents();
        
      preencherTabela("select *from funcionarios order by func_nome");
     jButtonFucNovo.setEnabled(true);
     jButtonFucSalvar.setEnabled(false);
     jButtonFucCancelar.setEnabled(false);
     jButtonFucEditar.setEnabled(false);
     jButtonFucExcluir.setEnabled(false);
     jTextFieldFucRzSocial.setEnabled(false);
     jTextFieldFucCargo.setEnabled(false);
     jTextFieldFucEnd.setEnabled(false);
     jTextFieldFucNum.setEnabled(false);
     jTextFieldFucBairro.setEnabled(false);
     jTextFieldFucCidade.setEnabled(false);
     jFormattedTextFieldFucCNPJ.setEnabled(false);
     jFormattedTextFieldFucCEP.setEnabled(false);
     jFormattedTextFieldFucTelRed.setEnabled(false);
     jFormattedTextFieldFucTelCel.setEnabled(false);
     jTextFieldFunccod.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadFuc = new javax.swing.JPanel();
        jLabelFucCNPJ = new javax.swing.JLabel();
        jLabelFucRzSocial = new javax.swing.JLabel();
        jLabelFucEnd = new javax.swing.JLabel();
        jLabelFucTelRed = new javax.swing.JLabel();
        jLabelFucTelCel = new javax.swing.JLabel();
        jLabelFucNum = new javax.swing.JLabel();
        jTextFieldFucRzSocial = new javax.swing.JTextField();
        jTextFieldFucEnd = new javax.swing.JTextField();
        jTextFieldFucNum = new javax.swing.JTextField();
        jLabelFucCEP = new javax.swing.JLabel();
        jLabelFucBairro = new javax.swing.JLabel();
        jTextFieldFucBairro = new javax.swing.JTextField();
        jLabelFucCidade = new javax.swing.JLabel();
        jTextFieldFucCidade = new javax.swing.JTextField();
        jLabelFucUF = new javax.swing.JLabel();
        jComboBoxFucUF = new javax.swing.JComboBox<>();
        jButtonFucNovo = new javax.swing.JButton();
        jButtonFucSalvar = new javax.swing.JButton();
        jButtonFucCancelar = new javax.swing.JButton();
        jButtonFucEditar = new javax.swing.JButton();
        jButtonFucExcluir = new javax.swing.JButton();
        jTextFieldFucPesq = new javax.swing.JTextField();
        jButtonFucPesq = new javax.swing.JButton();
        jFormattedTextFieldFucCNPJ = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFucCEP = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFucTelRed = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFucTelCel = new javax.swing.JFormattedTextField();
        jComboBoxFunCnh = new javax.swing.JComboBox<>();
        jLabelFucCNH = new javax.swing.JLabel();
        jLabelFucCargo = new javax.swing.JLabel();
        jTextFieldFucCargo = new javax.swing.JTextField();
        jLabelfunccod = new javax.swing.JLabel();
        jTextFieldFunccod = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFuncPesquisa = new javax.swing.JTable();
        jLabelFundoFuncionarios = new javax.swing.JLabel();
        jLabelCadFuncionarios = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanelCadFuc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCadFuc.setLayout(null);

        jLabelFucCNPJ.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelFucCNPJ.setText(" CPF.:");
        jPanelCadFuc.add(jLabelFucCNPJ);
        jLabelFucCNPJ.setBounds(300, 40, 40, 30);

        jLabelFucRzSocial.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelFucRzSocial.setText("Nome.:");
        jPanelCadFuc.add(jLabelFucRzSocial);
        jLabelFucRzSocial.setBounds(160, 70, 40, 30);

        jLabelFucEnd.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelFucEnd.setText("Endereço.:");
        jPanelCadFuc.add(jLabelFucEnd);
        jLabelFucEnd.setBounds(130, 101, 80, 30);

        jLabelFucTelRed.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelFucTelRed.setText("Telefone residencial.:");
        jPanelCadFuc.add(jLabelFucTelRed);
        jLabelFucTelRed.setBounds(310, 160, 150, 30);

        jLabelFucTelCel.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelFucTelCel.setText("Telefone Celular.:");
        jPanelCadFuc.add(jLabelFucTelCel);
        jLabelFucTelCel.setBounds(560, 160, 130, 30);

        jLabelFucNum.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelFucNum.setText("Número.:");
        jPanelCadFuc.add(jLabelFucNum);
        jLabelFucNum.setBounds(140, 130, 60, 30);
        jPanelCadFuc.add(jTextFieldFucRzSocial);
        jTextFieldFucRzSocial.setBounds(210, 70, 610, 30);
        jPanelCadFuc.add(jTextFieldFucEnd);
        jTextFieldFucEnd.setBounds(210, 100, 610, 30);

        jTextFieldFucNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFucNumActionPerformed(evt);
            }
        });
        jPanelCadFuc.add(jTextFieldFucNum);
        jTextFieldFucNum.setBounds(210, 130, 60, 30);

        jLabelFucCEP.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelFucCEP.setText("CEP.:");
        jPanelCadFuc.add(jLabelFucCEP);
        jLabelFucCEP.setBounds(160, 160, 40, 30);

        jLabelFucBairro.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelFucBairro.setText("Bairro.:");
        jPanelCadFuc.add(jLabelFucBairro);
        jLabelFucBairro.setBounds(280, 140, 60, 13);
        jPanelCadFuc.add(jTextFieldFucBairro);
        jTextFieldFucBairro.setBounds(340, 130, 150, 30);

        jLabelFucCidade.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelFucCidade.setText("Cidade.:");
        jPanelCadFuc.add(jLabelFucCidade);
        jLabelFucCidade.setBounds(500, 140, 60, 13);

        jTextFieldFucCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFucCidadeActionPerformed(evt);
            }
        });
        jPanelCadFuc.add(jTextFieldFucCidade);
        jTextFieldFucCidade.setBounds(560, 130, 160, 30);

        jLabelFucUF.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelFucUF.setText("UF.:");
        jPanelCadFuc.add(jLabelFucUF);
        jLabelFucUF.setBounds(730, 140, 23, 13);

        jComboBoxFucUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM\t ", "\tBA\t ", "\tCE\t ", "\tDF\t ", "\tES\t ", "\tGO\t ", "\tMA\t ", "\tMT\t ", "\tMS\t ", "\tMG\t ", "\tPA\t ", "\tPB\t ", "\tPR\t ", "\tPE\t ", "\tPI\t ", "\tRJ\t ", "\tRN\t ", "\tRS\t ", "\tRO\t ", "\tRR\t ", "\tSC\t ", "\tSP\t ", "\tSE\t ", "\tTO" }));
        jPanelCadFuc.add(jComboBoxFucUF);
        jComboBoxFucUF.setBounds(760, 130, 60, 30);

        jButtonFucNovo.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButtonFucNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add.png"))); // NOI18N
        jButtonFucNovo.setText("Novo");
        jButtonFucNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFucNovoActionPerformed(evt);
            }
        });
        jPanelCadFuc.add(jButtonFucNovo);
        jButtonFucNovo.setBounds(80, 220, 110, 30);

        jButtonFucSalvar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButtonFucSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cloud 2.png"))); // NOI18N
        jButtonFucSalvar.setText("Salvar");
        jButtonFucSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFucSalvarActionPerformed(evt);
            }
        });
        jPanelCadFuc.add(jButtonFucSalvar);
        jButtonFucSalvar.setBounds(80, 260, 110, 30);

        jButtonFucCancelar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButtonFucCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cross.png"))); // NOI18N
        jButtonFucCancelar.setText("Cancelar");
        jButtonFucCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFucCancelarActionPerformed(evt);
            }
        });
        jPanelCadFuc.add(jButtonFucCancelar);
        jButtonFucCancelar.setBounds(80, 300, 110, 30);

        jButtonFucEditar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButtonFucEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pencil.png"))); // NOI18N
        jButtonFucEditar.setText("Editar");
        jButtonFucEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFucEditarActionPerformed(evt);
            }
        });
        jPanelCadFuc.add(jButtonFucEditar);
        jButtonFucEditar.setBounds(80, 340, 110, 30);

        jButtonFucExcluir.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButtonFucExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remove.png"))); // NOI18N
        jButtonFucExcluir.setText("Excluir");
        jButtonFucExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFucExcluirActionPerformed(evt);
            }
        });
        jPanelCadFuc.add(jButtonFucExcluir);
        jButtonFucExcluir.setBounds(80, 380, 110, 30);
        jPanelCadFuc.add(jTextFieldFucPesq);
        jTextFieldFucPesq.setBounds(230, 230, 440, 30);

        jButtonFucPesq.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButtonFucPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Search 1.png"))); // NOI18N
        jButtonFucPesq.setText("Pesquisar");
        jButtonFucPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFucPesqActionPerformed(evt);
            }
        });
        jPanelCadFuc.add(jButtonFucPesq);
        jButtonFucPesq.setBounds(680, 230, 120, 30);
        jPanelCadFuc.add(jFormattedTextFieldFucCNPJ);
        jFormattedTextFieldFucCNPJ.setBounds(340, 40, 130, 30);
        jPanelCadFuc.add(jFormattedTextFieldFucCEP);
        jFormattedTextFieldFucCEP.setBounds(210, 160, 90, 30);
        jPanelCadFuc.add(jFormattedTextFieldFucTelRed);
        jFormattedTextFieldFucTelRed.setBounds(460, 160, 90, 30);
        jPanelCadFuc.add(jFormattedTextFieldFucTelCel);
        jFormattedTextFieldFucTelCel.setBounds(690, 160, 100, 30);

        jComboBoxFunCnh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "A", "B", "C", "D", "E", "AB", "AC", "AD", "AE" }));
        jPanelCadFuc.add(jComboBoxFunCnh);
        jComboBoxFunCnh.setBounds(240, 190, 60, 30);

        jLabelFucCNH.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelFucCNH.setText("CNH.:");
        jPanelCadFuc.add(jLabelFucCNH);
        jLabelFucCNH.setBounds(200, 190, 40, 30);

        jLabelFucCargo.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelFucCargo.setText("Cargo.:");
        jPanelCadFuc.add(jLabelFucCargo);
        jLabelFucCargo.setBounds(360, 190, 50, 30);
        jPanelCadFuc.add(jTextFieldFucCargo);
        jTextFieldFucCargo.setBounds(420, 190, 130, 30);

        jLabelfunccod.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelfunccod.setText("Cod Func.:");
        jPanelCadFuc.add(jLabelfunccod);
        jLabelfunccod.setBounds(140, 40, 70, 30);

        jTextFieldFunccod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFunccodActionPerformed(evt);
            }
        });
        jPanelCadFuc.add(jTextFieldFunccod);
        jTextFieldFunccod.setBounds(210, 40, 80, 30);

        jTableFuncPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableFuncPesquisa.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTableFuncPesquisaPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(jTableFuncPesquisa);

        jPanelCadFuc.add(jScrollPane2);
        jScrollPane2.setBounds(230, 260, 570, 150);

        jLabelFundoFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos-para-fotos-verde (3).jpg"))); // NOI18N
        jPanelCadFuc.add(jLabelFundoFuncionarios);
        jLabelFundoFuncionarios.setBounds(0, 0, 1080, 440);

        getContentPane().add(jPanelCadFuc);
        jPanelCadFuc.setBounds(30, 40, 1080, 440);

        jLabelCadFuncionarios.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabelCadFuncionarios.setText("Cadastro de Funcionarios");
        getContentPane().add(jLabelCadFuncionarios);
        jLabelCadFuncionarios.setBounds(470, 10, 311, 19);

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

    private void jTextFieldFucNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFucNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFucNumActionPerformed

    private void jButtonFucNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFucNovoActionPerformed
        flag =1;
        
        jButtonFucNovo.setEnabled(false);
        jButtonFucSalvar.setEnabled(true);
        jButtonFucCancelar.setEnabled(true);
        jButtonFucEditar.setEnabled(false);
        jButtonFucExcluir.setEnabled(false);
        jFormattedTextFieldFucCNPJ.setEnabled(true);
        jTextFieldFucRzSocial.setEnabled(true);
        jTextFieldFucEnd.setEnabled(true);
        jTextFieldFucNum.setEnabled(true);
        jTextFieldFucBairro.setEnabled(true);
        jTextFieldFucCidade.setEnabled(true);
        jFormattedTextFieldFucCEP.setEnabled(true);
        jFormattedTextFieldFucTelRed.setEnabled(true);
        jFormattedTextFieldFucTelCel.setEnabled(true);
        jTextFieldFucCargo.setEnabled(true);
        jComboBoxFucUF.setEnabled(true);
        jTextFieldFucPesq.setEnabled(false);
        jButtonFucPesq.setEnabled(false);
        
         
                
    }//GEN-LAST:event_jButtonFucNovoActionPerformed

    private void jButtonFucSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFucSalvarActionPerformed
       if(flag == 1){
        modf.setFunc_CPF(jFormattedTextFieldFucCNPJ.getText());
        modf.setFunc_Nome(jTextFieldFucRzSocial.getText());
        modf.setFunc_End(jTextFieldFucEnd.getText());
        modf.setFunc_numero(Integer.parseInt(jTextFieldFucNum.getText()));
        modf.setFunc_Bairro(jTextFieldFucBairro.getText());
        modf.setFunc_Cidade(jTextFieldFucCidade.getText());
        modf.setFunc_Uf((String) jComboBoxFucUF.getSelectedItem());
        modf.setFunc_CEP(jFormattedTextFieldFucCEP.getText());
        modf.setFunc_TelResid(jFormattedTextFieldFucTelRed.getText());
        modf.setFunc_TelCel(jFormattedTextFieldFucTelCel.getText());
        modf.setFunc_CNH((String) jComboBoxFunCnh.getSelectedItem());
        modf.setFunc_Cargo(jTextFieldFucCargo.getText());
        control.Salvar(modf);
        jFormattedTextFieldFucCNPJ.setText("");
        jTextFieldFucRzSocial.setText("");
        jTextFieldFucEnd.setText("");
        jTextFieldFucNum.setText("");
        jTextFieldFucBairro.setText("");
        jTextFieldFucCidade.setText("");
        jFormattedTextFieldFucCEP.setText("");
        jFormattedTextFieldFucTelRed.setText("");
        jFormattedTextFieldFucTelCel.setText("");
        jTextFieldFucPesq.setText("");
        jTextFieldFucRzSocial.setEnabled(false);
        jTextFieldFucEnd.setEnabled(false);
        jTextFieldFucNum.setEnabled(false);
        jTextFieldFucBairro.setEnabled(false);
        jTextFieldFucCidade.setEnabled(false);
        jFormattedTextFieldFucCEP.setEnabled(false);
        jFormattedTextFieldFucTelRed.setEnabled(false);
        jFormattedTextFieldFucTelCel.setEnabled(false);
        jTextFieldFucPesq.setEnabled(true);
        jButtonFucPesq.setEnabled(true);
        jButtonFucSalvar.setEnabled(false);
        jButtonFucCancelar.setEnabled(false);
        jButtonFucNovo.setEnabled(true);
       }else{
       
        modf.setFunc_CPF(jFormattedTextFieldFucCNPJ.getText());
        modf.setFunc_Nome(jTextFieldFucRzSocial.getText());
        modf.setFunc_End(jTextFieldFucEnd.getText());
        modf.setFunc_numero(Integer.parseInt(jTextFieldFucNum.getText()));
        modf.setFunc_Bairro(jTextFieldFucBairro.getText());
        modf.setFunc_Cidade(jTextFieldFucCidade.getText());
        modf.setFunc_Uf((String) jComboBoxFucUF.getSelectedItem());
        modf.setFunc_CEP(jFormattedTextFieldFucCEP.getText());
        modf.setFunc_TelResid(jFormattedTextFieldFucTelRed.getText());
        modf.setFunc_TelCel(jFormattedTextFieldFucTelCel.getText());
        modf.setFunc_CNH((String) jComboBoxFunCnh.getSelectedItem());
        modf.setFunc_Cargo(jTextFieldFucCargo.getText());
        control.Editar(modf);
        jFormattedTextFieldFucCNPJ.setText("");
        jTextFieldFucRzSocial.setText("");
        jTextFieldFucEnd.setText("");
        jTextFieldFucNum.setText("");
        jTextFieldFucBairro.setText("");
        jTextFieldFucCidade.setText("");
        jFormattedTextFieldFucCEP.setText("");
        jFormattedTextFieldFucTelRed.setText("");
        jFormattedTextFieldFucTelCel.setText("");
        jTextFieldFucPesq.setText("");
        jTextFieldFucRzSocial.setEnabled(false);
        jTextFieldFucEnd.setEnabled(false);
        jTextFieldFucNum.setEnabled(false);
        jTextFieldFucBairro.setEnabled(false);
        jTextFieldFucCidade.setEnabled(false);
        jFormattedTextFieldFucCEP.setEnabled(false);
        jFormattedTextFieldFucTelRed.setEnabled(false);
        jFormattedTextFieldFucTelCel.setEnabled(false);
        jFormattedTextFieldFucCNPJ.setEnabled(false);
        jTextFieldFucCargo.setEnabled(false);
            jButtonFucPesq.setEnabled(true);
            jButtonFucEditar.setEnabled(false);
            jButtonFucExcluir.setEnabled(false);
            jButtonFucSalvar.setEnabled(false);
            jButtonFucNovo.setEnabled(true);
            jButtonFucCancelar.setEnabled(false);
       
       
       
       }
    
        
    }//GEN-LAST:event_jButtonFucSalvarActionPerformed

    private void jButtonFucEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFucEditarActionPerformed

        flag=2;
        
     jTextFieldFucRzSocial.setEnabled(true);
     jTextFieldFucCargo.setEnabled(true);
     jTextFieldFucEnd.setEnabled(true);
     jTextFieldFucNum.setEnabled(true);
     jTextFieldFucBairro.setEnabled(true);
     jTextFieldFucCidade.setEnabled(true);
     jFormattedTextFieldFucCNPJ.setEnabled(true);
     jFormattedTextFieldFucCEP.setEnabled(true);
     jFormattedTextFieldFucTelRed.setEnabled(true);
     jFormattedTextFieldFucTelCel.setEnabled(true);
     jTextFieldFucCargo.setEnabled(false);
     
        jButtonFucEditar.setEnabled(false);
        jButtonFucExcluir.setEnabled(false);
        jButtonFucSalvar.setEnabled(true);
        jButtonFucNovo.setEnabled(false);
        jButtonFucCancelar.setEnabled(true);
        jButtonFucPesq.setEnabled(false);
        
    }//GEN-LAST:event_jButtonFucEditarActionPerformed

    private void jButtonFucPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFucPesqActionPerformed
       
            preencherTabela("select *from funcionarios order by func_nome");
            modf.setPesquisaf(jTextFieldFucPesq.getText());
            BeansFuncionario model = control.buscadfuncionario(modf);
            jFormattedTextFieldFucCNPJ.setText(model.getFunc_CPF());
            jTextFieldFunccod.setText(String.valueOf(model.getCod_Func()));
            jTextFieldFucRzSocial.setText(model.getFunc_Nome());
            jTextFieldFucEnd.setText(model.getFunc_End());
            jTextFieldFucNum.setText(String.valueOf(model.getFunc_numero()));
            jTextFieldFucBairro.setText(model.getFunc_Bairro());
            jTextFieldFucCidade.setText(model.getFunc_Cidade());
            jComboBoxFucUF.setSelectedItem(model.getFunc_Uf());
            jFormattedTextFieldFucCEP.setText(model.getFunc_CEP());
            jFormattedTextFieldFucTelRed.setText(model.getFunc_TelResid());
            jFormattedTextFieldFucTelCel.setText(model.getFunc_TelCel());
            jComboBoxFunCnh.setSelectedItem(model.getFunc_CNH());
            jTextFieldFucCargo.setText(model.getFunc_Cargo());
            jTextFieldFunccod.setText(String.valueOf(model.getCod_Func()));
            
            jButtonFucEditar.setEnabled(true);
            jButtonFucExcluir.setEnabled(true);
            jButtonFucCancelar.setEnabled(true);
            
    }//GEN-LAST:event_jButtonFucPesqActionPerformed

    private void jTextFieldFucCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFucCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFucCidadeActionPerformed

    private void jButtonFucCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFucCancelarActionPerformed
        
        jFormattedTextFieldFucCNPJ.setText("");
        jTextFieldFucRzSocial.setText("");
        jTextFieldFucEnd.setText("");
        jTextFieldFucNum.setText("");
        jTextFieldFucBairro.setText("");
        jTextFieldFucCidade.setText("");
        jFormattedTextFieldFucCEP.setText("");
        jFormattedTextFieldFucTelRed.setText("");
        jFormattedTextFieldFucTelCel.setText("");
        jTextFieldFucPesq.setText("");
     jTextFieldFucRzSocial.setEnabled(false);
     jTextFieldFucCargo.setEnabled(false);
     jTextFieldFucEnd.setEnabled(false);
     jTextFieldFucNum.setEnabled(false);
     jTextFieldFucBairro.setEnabled(false);
     jTextFieldFucCidade.setEnabled(false);
     jFormattedTextFieldFucCNPJ.setEnabled(false);
     jFormattedTextFieldFucCEP.setEnabled(false);
     jFormattedTextFieldFucTelRed.setEnabled(false);
     jFormattedTextFieldFucTelCel.setEnabled(false);
     jTextFieldFucPesq.setEnabled(true);
        jButtonFucEditar.setEnabled(false);
         jButtonFucExcluir.setEnabled(false);
         jButtonFucSalvar.setEnabled(false);
         jButtonFucNovo.setEnabled(true);
         jButtonFucCancelar.setEnabled(false);
         jButtonFucPesq.setEnabled(true);
    }//GEN-LAST:event_jButtonFucCancelarActionPerformed

    private void jButtonFucExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFucExcluirActionPerformed
       
            int resposta=0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente excluir?");
                if(resposta == JOptionPane.YES_OPTION){
                
                    modf.setCod_Func(Integer.parseInt(jTextFieldFunccod.getText()));
                    control.Excluir(modf);
                     jFormattedTextFieldFucCNPJ.setText("");
        jTextFieldFunccod.setText("");
        jTextFieldFucRzSocial.setText("");
        jTextFieldFucEnd.setText("");
        jTextFieldFucNum.setText("");
        jTextFieldFucBairro.setText("");
        jTextFieldFucCidade.setText("");
        jFormattedTextFieldFucCEP.setText("");
        jFormattedTextFieldFucTelRed.setText("");
        jFormattedTextFieldFucTelCel.setText("");
        jTextFieldFucPesq.setText("");
        jTextFieldFucCargo.setText("");
                    jTextFieldFucRzSocial.setEnabled(false);
                    jTextFieldFucCargo.setEnabled(false);
                    jTextFieldFucEnd.setEnabled(false);
                    jTextFieldFucNum.setEnabled(false);
                    jTextFieldFucBairro.setEnabled(false);
                    jTextFieldFucCidade.setEnabled(false);
                    jFormattedTextFieldFucCNPJ.setEnabled(false);
                    jFormattedTextFieldFucCEP.setEnabled(false);
                    jFormattedTextFieldFucTelRed.setEnabled(false);
                    jFormattedTextFieldFucTelCel.setEnabled(false);
                        jButtonFucEditar.setEnabled(false);
                        jButtonFucExcluir.setEnabled(false);
                        jButtonFucSalvar.setEnabled(false);
                        jButtonFucNovo.setEnabled(true);
                        jButtonFucCancelar.setEnabled(false);
                        jButtonFucPesq.setEnabled(true);
                    
                    
                }
        

        
    }//GEN-LAST:event_jButtonFucExcluirActionPerformed

    private void jTableFuncPesquisaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTableFuncPesquisaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableFuncPesquisaPropertyChange

    private void jTextFieldFunccodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFunccodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFunccodActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
     public void preencherTabela(String Sql){
    
        ArrayList dados = new ArrayList();
        String[] coluns = new String[]{"ID","CPF","Nome","Tel/Resid"};
        conex.Conexao();
           
        conex.Executasql(Sql);
        try{
            
            conex.rs.first();
        do{
            dados.add(new Object[]{conex.rs.getInt("func_cod"),conex.rs.getString("func_cpf"),conex.rs.getString("func_nome"),conex.rs.getString("func_telresid")});
        }while(conex.rs.next());
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Erro ao preencher array list"+ex.getMessage());
        
        } 
         ModeloTabelaFunc modelo = new ModeloTabelaFunc(dados, coluns);
        jTableFuncPesquisa.setModel(modelo);
        jTableFuncPesquisa.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableFuncPesquisa.getColumnModel().getColumn(0).setResizable(false);
        jTableFuncPesquisa.getColumnModel().getColumn(1).setPreferredWidth(102);
        jTableFuncPesquisa.getColumnModel().getColumn(1).setResizable(false);
        jTableFuncPesquisa.getColumnModel().getColumn(2).setPreferredWidth(230);
        jTableFuncPesquisa.getColumnModel().getColumn(2).setResizable(false);
        jTableFuncPesquisa.getColumnModel().getColumn(3).setPreferredWidth(245);
        jTableFuncPesquisa.getColumnModel().getColumn(3).setResizable(false);
        jTableFuncPesquisa.getTableHeader().setReorderingAllowed(false);
        jTableFuncPesquisa.setAutoResizeMode(jTableFuncPesquisa.AUTO_RESIZE_OFF);
        jTableFuncPesquisa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.Desconecta();
    }
    
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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonFucCancelar;
    private javax.swing.JButton jButtonFucEditar;
    private javax.swing.JButton jButtonFucExcluir;
    private javax.swing.JButton jButtonFucNovo;
    private javax.swing.JButton jButtonFucPesq;
    private javax.swing.JButton jButtonFucSalvar;
    private javax.swing.JComboBox<String> jComboBoxFucUF;
    private javax.swing.JComboBox<String> jComboBoxFunCnh;
    private javax.swing.JFormattedTextField jFormattedTextFieldFucCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldFucCNPJ;
    private javax.swing.JFormattedTextField jFormattedTextFieldFucTelCel;
    private javax.swing.JFormattedTextField jFormattedTextFieldFucTelRed;
    private javax.swing.JLabel jLabelCadFuncionarios;
    private javax.swing.JLabel jLabelFucBairro;
    private javax.swing.JLabel jLabelFucCEP;
    private javax.swing.JLabel jLabelFucCNH;
    private javax.swing.JLabel jLabelFucCNPJ;
    private javax.swing.JLabel jLabelFucCargo;
    private javax.swing.JLabel jLabelFucCidade;
    private javax.swing.JLabel jLabelFucEnd;
    private javax.swing.JLabel jLabelFucNum;
    private javax.swing.JLabel jLabelFucRzSocial;
    private javax.swing.JLabel jLabelFucTelCel;
    private javax.swing.JLabel jLabelFucTelRed;
    private javax.swing.JLabel jLabelFucUF;
    private javax.swing.JLabel jLabelFundoFuncionarios;
    private javax.swing.JLabel jLabelfunccod;
    private javax.swing.JPanel jPanelCadFuc;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableFuncPesquisa;
    private javax.swing.JTextField jTextFieldFucBairro;
    private javax.swing.JTextField jTextFieldFucCargo;
    private javax.swing.JTextField jTextFieldFucCidade;
    private javax.swing.JTextField jTextFieldFucEnd;
    private javax.swing.JTextField jTextFieldFucNum;
    private javax.swing.JTextField jTextFieldFucPesq;
    private javax.swing.JTextField jTextFieldFucRzSocial;
    private javax.swing.JTextField jTextFieldFunccod;
    // End of variables declaration//GEN-END:variables
}
