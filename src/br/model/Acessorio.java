/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

/**
 *
 * @author vinicius caetano
 */
public class Acessorio {
    
    private long codigo;
    private String descricao;
    private float taxaLocacao;

    public Acessorio() {
    }

    public Acessorio(long codigo, String descricao, float taxaLocacao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.taxaLocacao = taxaLocacao;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getTaxaLocacao() {
        return taxaLocacao;
    }

    public void setTaxaLocacao(float taxaLocacao) {
        this.taxaLocacao = taxaLocacao;
    }
    
    
    
}
