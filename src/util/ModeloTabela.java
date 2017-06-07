/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vinicius caetano
 */
public class ModeloTabela extends AbstractTableModel { //herança do AbstractTableModelrsrs

    private ArrayList linhas = null;
    private String[] colunas = null;

    public ModeloTabela(ArrayList linhas, String[] colunas) {

        setLinhas(linhas);
        setColunas(colunas);
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList dados) {
        linhas = dados;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] nomes) {
        colunas = nomes;
    }
    
    public int getColumnCount(){
        return colunas.length;
    }
    
    public int getRowCount(){
        return linhas.size();
    }
    public String getColumnName(int numeroColunas){
        return colunas[numeroColunas];
    }
    public Object getValueAt(int numeroLinhas, int numeroColunas){
        Object[] linha = (Object[]) getLinhas().get(numeroLinhas);
        return linha[numeroColunas];
    }

}
