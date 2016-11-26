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

import modeloBeans.BeansFuncionario;

/**
 *
 * @author Buzato
 */
public class DaoFuncionarios {
    
        ConexaoBD conex = new ConexaoBD();
        BeansFuncionario modf = new BeansFuncionario();
        
        public void Salvar(BeansFuncionario modf){
            conex.Conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("insert into funcionarios(func_cpf,func_nome,func_end,func_numero,func_bairro,func_cidade,func_uf,func_cep,func_telresid,func_telcel,func_cnh,func_cargo)values(?,?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, modf.getFunc_CPF());
                pst.setString(2, modf.getFunc_Nome());
                pst.setString(3, modf.getFunc_End());
                pst.setInt(4, modf.getFunc_numero());
                pst.setString(5, modf.getFunc_Bairro());
                pst.setString(6, modf.getFunc_Cidade());
                pst.setString(7, modf.getFunc_Uf());
                pst.setString(8, modf.getFunc_CEP());
                pst.setString(9, modf.getFunc_TelResid());
                pst.setString(10, modf.getFunc_TelCel());
                pst.setString(11, modf.getFunc_CNH());
                pst.setString(12, modf.getFunc_Cargo());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex.getMessage());
            }
           
            
            conex.Desconecta();
            
        }
        
        public void Editar(BeansFuncionario modf){
        
        conex.Conexao();
            
            try {
                PreparedStatement pst = conex.con.prepareStatement("update funcionarios set func_cpf=?,func_nome=?,func_end=?,func_numero=?,func_bairro=?,func_cidade=?,func_uf=?,func_cep=?,func_telresid=?,func_telcel=?,func_cnh=?,func_cargo=? where func_cod=?");
                 pst.setString(1, modf.getFunc_CPF());
                pst.setString(2, modf.getFunc_Nome());
                pst.setString(3, modf.getFunc_End());
                pst.setInt(4, modf.getFunc_numero());
                pst.setString(5, modf.getFunc_Bairro());
                pst.setString(6, modf.getFunc_Cidade());
                pst.setString(7, modf.getFunc_Uf());
                pst.setString(8, modf.getFunc_CEP());
                pst.setString(9, modf.getFunc_TelResid());
                pst.setString(10, modf.getFunc_TelCel());
                pst.setString(11, modf.getFunc_CNH());
                pst.setString(12, modf.getFunc_Cargo());
                pst.setInt(13, modf.getCod_Func());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Alterar"+ex.getMessage());
            }
        
        conex.Desconecta();
        }
        
        public void Excluir(BeansFuncionario modf){
        conex.Conexao();
            PreparedStatement pst;
            try {
                pst = conex.con.prepareStatement("delete from funcionarios where func_cod=? ");
                pst.setInt(1, modf.getCod_Func());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!!");
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao Excluir"+ex.getMessage());
            }
            
            
        conex.Desconecta();
        }
        
        public BeansFuncionario buscadfuncionario (BeansFuncionario modf){
        
        conex.Conexao();
        
        conex.Executasql("select *from funcionarios where func_nome like'%"+modf.getPesquisaf()+"%'");
            try {
                conex.rs.first();
                
                modf.setFunc_CPF(conex.rs.getString("func_cpf"));
                modf.setFunc_Nome(conex.rs.getString("func_nome"));
                modf.setFunc_End(conex.rs.getString("func_end"));
                modf.setFunc_numero(conex.rs.getInt("func_numero"));
                modf.setFunc_Bairro(conex.rs.getString("func_bairro"));
                modf.setFunc_Cidade(conex.rs.getString("func_cidade"));
                modf.setFunc_Uf(conex.rs.getString("func_uf"));
                modf.setFunc_CEP(conex.rs.getString("func_cep"));
                modf.setFunc_TelResid(conex.rs.getString("func_telresid"));
                modf.setFunc_TelCel(conex.rs.getString("func_telcel"));
                modf.setFunc_CNH(conex.rs.getString("func_cnh"));
                modf.setCod_Func(conex.rs.getInt("func_cod"));
                modf.setFunc_Cargo(conex.rs.getString("func_cargo"));
                conex.rs.first();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao pesquisar cliente"+ex.getMessage() + ex.getSQLState());
                  // JOptionPane.showMessageDialog(null, "Cliente não Existe!!!");

            }
        
        conex.Desconecta();
        return modf; 
     
        }
        
}
