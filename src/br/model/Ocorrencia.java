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
public class Ocorrencia {

    private long codigo;
    private String descricao;
    private Enum tipoOcorrencia;
    private float valorOcorrencia;

    public Ocorrencia() {
    }

    public Ocorrencia(long codigo, String descricao, Enum tipoOcorrencia, float valorOcorrencia) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipoOcorrencia = tipoOcorrencia;
        this.valorOcorrencia = valorOcorrencia;
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
