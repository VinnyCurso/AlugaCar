/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

import java.util.Date;

/**
 *
 * @author vinicius caetano
 */
public class CnhModel {
    
    private String numeroCNH;
    private String categoria;
    private Date validade;

    public CnhModel() {
    }

    public CnhModel(String numeroCNH, String categoria, Date validade) {
        this.numeroCNH = numeroCNH;
        this.categoria = categoria;
        this.validade = validade;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
    
    
}
