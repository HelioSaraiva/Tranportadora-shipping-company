/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Buzato
 */
public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private String drive = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/transportadora";
    private String usuario = "postgres"; 
    private String senha = "mysql";
    public Connection con;
    
    public void Conexao(){
    
        System.setProperty("jdbc Driver", drive);
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
          // JOptionPane.showMessageDialog(null,"Banco conectado com sucesso");
                    } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Falha ao se conectar com banco:\n"+ex.getMessage());
        }
    }
    public void Executasql(String sql){
    
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao executar sql:\n"+ex.getMessage());
        }
        
    }
    
    public void Desconecta(){
    
        try {
            con.close();
            //JOptionPane.showMessageDialog(null,"Desconectado com Sucesso");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Falha ao se desconectar:\n"+ex.getMessage());
        }
    }
    
    
}
