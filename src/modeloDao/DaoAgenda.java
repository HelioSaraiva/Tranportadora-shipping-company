
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansAgenda;
import modeloConection.ConexaoBD;



/**
 *
 * @author Buzato
 */
public class DaoAgenda {
    
        BeansAgenda agenda = new BeansAgenda();
        ConexaoBD conex = new ConexaoBD();
        ConexaoBD conexCliente = new ConexaoBD();
        ConexaoBD conexFuncionario = new ConexaoBD();
        int codigoCli;
        int codigoFunc;
        
    public void salavar(BeansAgenda agenda){
        buscarFunc(agenda.getNomeFunc());
        buscarCli(agenda.getNomecli());
        conex.Conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("insert into agenda (agenda_codcli,agenda_codfunc,agenda_descricao,agenda_turno,agenda_data,agenda_status) values (?,?,?,?,?,?)");
                pst.setInt(1, codigoCli);
                pst.setInt(2, codigoFunc);
                pst.setString(3, agenda.getDescricao());
                pst.setString(4, agenda.getTurno());
                pst.setDate(5,new java.sql.Date(agenda.getData().getTime()));
                pst.setString(6,agenda.getStatus() );
                pst.execute();
                JOptionPane.showMessageDialog(null,"Agenda salva com sucesso!!");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao salvar agenda!!"+ex);
            }
        conex.Desconecta();
    } 
    
    public void buscarCli(String nomecli){
        conexCliente.Conexao();
        conexCliente.Executasql("select *from clientes where cli_rzsocial='"+nomecli+"'");
            try {
                conexCliente.rs.first();
                codigoCli = conexCliente.rs.getInt("cod_cliente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Funcionario não encontrado!!");
                
                
            }
    } 
    
    public void buscarFunc(String nomefunc){
        conexFuncionario.Conexao();
        conexFuncionario.Executasql("select *from funcionarios where func_nome='"+nomefunc+"'");
            try {
                conexFuncionario.rs.first();
                codigoFunc = conexFuncionario.rs.getInt("func_cod");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Funcionario não encontrado!!");
                
                
            }
    } 
}
