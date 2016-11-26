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
import modeloBeans.BeansUsuario;

/**
 *
 * @author Buzato
 */
public class DaoUsuarios {
    
        ConexaoBD conex = new ConexaoBD();
        BeansUsuario modu = new BeansUsuario();
        
        public void Salvar(BeansUsuario modu){
            conex.Conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("insert into login(usu_nome,usu_senha,usu_tipo)values(?,?,?)");
                pst.setString(1, modu.getUsuNome());
                pst.setString(2, modu.getUsutipo());
                pst.setString(3, modu.getUsuSenha());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex.getMessage());
            }
           
            
            conex.Desconecta();
            
        }
        
        public void Editar(BeansUsuario modu){
        
        conex.Conexao();
            
            try {
                PreparedStatement pst = conex.con.prepareStatement("update login set usu_nome=?,usu_tipo=?,usu_senha=? where usu_cod=?");
                 pst.setString(1, modu.getUsuNome());
                pst.setString(2, modu.getUsutipo());
                pst.setString(3, modu.getUsuSenha());
                pst.setInt(4, modu.getUsuCod());
                
                pst.execute();
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Alterar"+ex.getMessage());
            }
        
        conex.Desconecta();
        }
        
        public void Excluir(BeansUsuario modu){
        conex.Conexao();
            PreparedStatement pst;
            try {
                pst = conex.con.prepareStatement("delete from login where usu_cod=? ");
                pst.setInt(1, modu.getUsuCod());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!!");
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao Excluir"+ex.getMessage());
            }
            
            
        conex.Desconecta();
        }
        
        public BeansUsuario buscausuario (BeansUsuario modu){
        
        conex.Conexao();
        
        conex.Executasql("select *from login where usu_nome like'%"+modu.getUsupesq()+"%'");
            try {
                conex.rs.next();
                
                modu.setUsuCod(conex.rs.getInt("usu_cod"));
                modu.setUsuNome(conex.rs.getString("usu_nome"));
                modu.setUsutipo(conex.rs.getString("usu_tipo"));
                modu.setUsuSenha(conex.rs.getString("usu_senha"));
                } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao pesquisar Usuario"+ex.getMessage());
                   //JOptionPane.showMessageDialog(null, "Cliente não Existe!!!");

            }
        
        conex.Desconecta();
        return modu; 
     
        }
        
}
