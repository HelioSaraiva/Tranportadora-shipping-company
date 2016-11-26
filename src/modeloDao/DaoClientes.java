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
import modeloBeans.BeansClientes;

/**
 *
 * @author Buzato
 */
public class DaoClientes {
    
        ConexaoBD conex = new ConexaoBD();
        BeansClientes mod = new BeansClientes();
        
        public void Salvar(BeansClientes mod){
            conex.Conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("insert into clientes(cli_cnpj,cli_rzsocial,cli_end,cli_num,cli_bairro,cli_cidade,cli_uf,cli_cep,cli_telcom,cli_telcel)values(?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, mod.getClicnpj());
                pst.setString(2, mod.getClirzsocial());
                pst.setString(3, mod.getCliend());
                pst.setInt(4, mod.getClinum());
                pst.setString(5, mod.getClibairro());
                pst.setString(6, mod.getClicidade());
                pst.setString(7, mod.getCliuf());
                pst.setString(8, mod.getClicep());
                pst.setString(9, mod.getClitelcom());
                pst.setString(10, mod.getClitelcel());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex.getMessage());
            }
           
            
            conex.Desconecta();
            
        }
        
        public void Editar(BeansClientes mod){
        
        conex.Conexao();
            
            try {
                PreparedStatement pst = conex.con.prepareStatement("update clientes set cli_cnpj=?,cli_rzsocial=?,cli_end=?,cli_num=?,cli_bairro=?,cli_cidade=?,cli_uf=?,cli_cep=?,cli_telcom=?,cli_telcel=? where cod_cliente=?");
                pst.setString(1, mod.getClicnpj());
                pst.setString(2, mod.getClirzsocial());
                pst.setString(3, mod.getCliend());
                pst.setInt(4, mod.getClinum());
                pst.setString(5, mod.getClibairro());
                pst.setString(6, mod.getClicidade());
                pst.setString(7, mod.getCliuf());
                pst.setString(8, mod.getClicep());
                pst.setString(9, mod.getClitelcom());
                pst.setString(10, mod.getClitelcel());
                pst.setInt(11, mod.getIdcli());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Alterar"+ex.getMessage());
            }
        
        conex.Desconecta();
        }
        
        public void Excluir(BeansClientes mod){
        conex.Conexao();
            PreparedStatement pst;
            try {
                pst = conex.con.prepareStatement("delete from clientes where cod_cliente=? ");
                pst.setInt(1, mod.getIdcli());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!!");
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao Excluir"+ex.getMessage());
            }
            
            
        conex.Desconecta();
        }
        
        public BeansClientes buscaClientes(BeansClientes mod){
        
        conex.Conexao();
        
        conex.Executasql("select *from clientes where cli_rzsocial like'%"+mod.getPesquisa()+"%'");
            try {
                conex.rs.next();
                
                mod.setClicnpj(conex.rs.getString("cli_cnpj"));
                mod.setClirzsocial(conex.rs.getString("cli_rzsocial"));
                mod.setCliend(conex.rs.getString("cli_end"));
                mod.setClinum(conex.rs.getInt("cli_num"));
                mod.setClibairro(conex.rs.getString("cli_bairro"));
                mod.setClicidade(conex.rs.getString("cli_cidade"));
                mod.setCliuf(conex.rs.getString("cli_uf"));
                mod.setClicep(conex.rs.getString("cli_cep"));
                mod.setClitelcom(conex.rs.getString("cli_telcom"));
                mod.setClitelcel(conex.rs.getString("cli_telcel"));
                mod.setIdcli(conex.rs.getInt("cod_cliente"));
            } catch (SQLException ex) {
                // JOptionPane.showMessageDialog(null, "Erro ao pesquisar cliente"+ex.getMessage());
                   JOptionPane.showMessageDialog(null, "Cliente não Existe!!!");

            }
        
        conex.Desconecta();
        return mod; 
     
        }
        
}
