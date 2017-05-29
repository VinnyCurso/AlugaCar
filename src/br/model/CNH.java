/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

import java.time.LocalDate;

/**
 *
 * @author vinicius caetano
 */
public class CNH {
    
    private String numeroCnh;
    private String categoria;
    private LocalDate dataValidade;

    public CNH() {
    }

    public CNH(String numeroCnh, String categoria, LocalDate dataValidade) {
        this.numeroCnh = numeroCnh;
        this.categoria = categoria;
        this.dataValidade = dataValidade;
    }

    public String getNumeroCnh() {
        return numeroCnh;
    }

    public void setNumeroCnh(String numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    
    
}
