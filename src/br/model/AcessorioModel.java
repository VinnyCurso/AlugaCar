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
public class AcessorioModel {
    
    private long id;
    private String descricao;
    private float taxaLocacao;

    public AcessorioModel() {
    }

    public AcessorioModel(long id, String descricao, float taxaLocacao) {
        this.id = id;
        this.descricao = descricao;
        this.taxaLocacao = taxaLocacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
