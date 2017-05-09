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
public class OcorrenciaModel {
    
    private long id;
    private String descricao;
    private Enum tipoOcorrencia;
    private float valorOcorrencia;

    public OcorrenciaModel() {
    }

    public OcorrenciaModel(long id, String descricao, Enum tipoOcorrencia, float valorOcorrencia) {
        this.id = id;
        this.descricao = descricao;
        this.tipoOcorrencia = tipoOcorrencia;
        this.valorOcorrencia = valorOcorrencia;
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

    public Enum getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public void setTipoOcorrencia(Enum tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public float getValorOcorrencia() {
        return valorOcorrencia;
    }

    public void setValorOcorrencia(float valorOcorrencia) {
        this.valorOcorrencia = valorOcorrencia;
    }
    
    
    
}
