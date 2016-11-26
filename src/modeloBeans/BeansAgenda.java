
package modeloBeans;

import java.sql.Date;

/**
 *
 * @author Buzato
 */
public class BeansAgenda {
   private int codagenda;
   private String nomecli;
   private String turno;
   private String nomeFunc;
   private Date data;
   private String status;
   private String descricao;

    public int getCodagenda() {
        return codagenda;
    }

    public void setCodagenda(int codagenda) {
        this.codagenda = codagenda;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
