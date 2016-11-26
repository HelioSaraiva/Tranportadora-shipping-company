/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author Buzato
 */
public class BeansLogin {
    
    
        private String usuario;
        private String senha;
        private int acesso;

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the acesso
     */
    public int getAcesso() {
        return acesso;
    }

    /**
     * @param acesso the acesso to set
     */
    public void setAcesso(int acesso) {
        this.acesso = acesso;
    }
    
}
