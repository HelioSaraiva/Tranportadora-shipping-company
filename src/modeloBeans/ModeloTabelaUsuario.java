/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.ArrayList;

/**
 *
 * @author Buzato
 */
public class ModeloTabelaUsuario {
    
        private ArrayList linha = null;
        private String[] colunas = null;
        
public ModeloTabelaUsuario(ArrayList lin, String[] col){

       setLinha(lin);
       setColunas(col);

}    

    /**
     * @return the linha
     */
    public ArrayList getLinha() {
        return linha;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(ArrayList linha) {
        this.linha = linha;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    public int getColumnCount(){
    
        return colunas.length;
        
    }
    public int getRowCount(){
    
        return linha.size();
    }
    public String getColumnName(int numCol){
    
        return colunas[numCol];
    }
    public Object getValueAt(int numLin, int numCol){

        Object[] linha = (Object[])getLinha().get(numLin);
        return linha[numCol];
        
        
    }
}
