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
public class Devolucao {
    
    private int codigo;
    private LocalDate dataDevolucao;
    private long kmFinal;
    private float totalFinal;

    public Devolucao() {
    }

    public Devolucao(int codigo, LocalDate dataDevolucao, long kmFinal, float totalFinal) {
        this.codigo = codigo;
        this.dataDevolucao = dataDevolucao;
        this.kmFinal = kmFinal;
        this.totalFinal = totalFinal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public long getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(long kmFinal) {
        this.kmFinal = kmFinal;
    }

    public float getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(float totalFinal) {
        this.totalFinal = totalFinal;
    }
    
    
    
    
    
}
