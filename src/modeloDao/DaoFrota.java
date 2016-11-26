/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansFrota;

/**
 *
 * @author Buzato
 */
public class DaoFrota {
    
        ConexaoBD conex = new ConexaoBD();
        BeansFrota modfr = new BeansFrota();
        
        public void Salvar(BeansFrota modfr){
            conex.Conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("insert into frota(fr_tpveiculo,fr_marca,fr_combustivel,fr_local,fr_uf,fr_placa,fr_cor,fr_kmini,fr_renavan,fr_dtlinc,fr_chassi)values(?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, modfr.getFr_tpveiculo());
                pst.setString(2, modfr.getFr_marca());
                pst.setString(3, modfr.getFr_combustivel());
                pst.setString(4, modfr.getFr_local());
                pst.setString(5, modfr.getFr_uf());
                pst.setString(6, modfr.getFr_placa());
                pst.setString(7, modfr.getFr_cor());
                pst.setString(8, modfr.getFr_kmini());
                pst.setString(9, modfr.getFr_renavan());
                pst.setString(10, modfr.getFr_dtlinc());
                pst.setString(11, modfr.getFr_chassi());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex.getMessage());
            }
           
            
            conex.Desconecta();
            
        }
        
        public void Editar(BeansFrota modfr){
        
        conex.Conexao();
            
            try {
                PreparedStatement pst = conex.con.prepareStatement("update frota set fr_tpveiculo=?,fr_marca=?,fr_combustivel=?,fr_local=?,fr_uf=?,fr_placa=?,fr_cor=?,fr_kmini=?,fr_renavan=?,fr_dtlinc=?,fr_chassi=? where cod_forta=?");
                pst.setString(1, modfr.getFr_tpveiculo());
                pst.setString(2, modfr.getFr_marca());
                pst.setString(3, modfr.getFr_combustivel());
                pst.setString(4, modfr.getFr_local());
                pst.setString(5, modfr.getFr_uf());
                pst.setString(6, modfr.getFr_placa());
                pst.setString(7, modfr.getFr_cor());
                pst.setString(8, modfr.getFr_kmini());
                pst.setString(9, modfr.getFr_renavan());
                pst.setString(10, modfr.getFr_dtlinc());
                pst.setString(11, modfr.getFr_chassi());
                pst.setInt(12, modfr.getCod_forta());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Alterar"+ex.getMessage());
            }
        
        conex.Desconecta();
        }
        
        public void Excluir(BeansFrota modfr){
        conex.Conexao();
            PreparedStatement pst;
            try {
                pst = conex.con.prepareStatement("delete from frota where cod_forta=? ");
                pst.setInt(1, modfr.getCod_forta());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!!");
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao Excluir"+ex.getMessage());
            }
            
            
        conex.Desconecta();
        }
        
        public BeansFrota buscaFrota(BeansFrota modfr){
        
        conex.Conexao();
        
        conex.Executasql("select *from frota where fr_tpveiculo like'%"+modfr.getFr_pesquisa()+"%'");
            try {
                conex.rs.next();
                
                modfr.setFr_tpveiculo(conex.rs.getString("fr_tpveiculo"));
                modfr.setFr_marca(conex.rs.getString("fr_marca"));
                modfr.setFr_combustivel(conex.rs.getString("fr_combustivel"));
                modfr.setFr_local(conex.rs.getString("fr_local"));
                modfr.setFr_uf(conex.rs.getString("fr_uf"));
                modfr.setFr_placa(conex.rs.getString("fr_placa"));
                modfr.setFr_cor(conex.rs.getString("fr_cor"));
                modfr.setFr_kmini(conex.rs.getString("fr_kmini"));
                modfr.setFr_renavan(conex.rs.getString("fr_renavan"));
                modfr.setFr_dtlinc(conex.rs.getString("fr_dtlinc"));
                modfr.setFr_chassi(conex.rs.getString("fr_chassi"));
                modfr.setCod_forta(conex.rs.getInt("cod_forta"));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao pesquisar cliente"+ex.getMessage());
                  // JOptionPane.showMessageDialog(null, "Cliente não Existe!!!");

            }
        
        conex.Desconecta();
        return (modfr); 
     
        }
        
}
