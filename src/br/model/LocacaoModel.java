 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author vinicius caetano
 */
public class LocacaoModel {
    
    private long id;
    private Date dataLocacao;
    private float kmInicial;
    private float kmFinal;
    private String finalidade;
    private float subTotal;
    private Enum status;
    private VeiculoModel veiculo;
    private List <OcorrenciaModel> listaOcorrencia;

    public LocacaoModel() {
    }

    public LocacaoModel(long id, Date dataLocacao, float kmInicial, float kmFinal, String finalidade, float subTotal, Enum status, VeiculoModel veiculo, List<OcorrenciaModel> listaOcorrencia) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.finalidade = finalidade;
        this.subTotal = subTotal;
        this.status = status;
        this.veiculo = veiculo;
        this.listaOcorrencia = listaOcorrencia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public float getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(float kmInicial) {
        this.kmInicial = kmInicial;
    }

    public float getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(float kmFinal) {
        this.kmFinal = kmFinal;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public VeiculoModel getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(VeiculoModel veiculo) {
        this.veiculo = veiculo;
    }

    public List <OcorrenciaModel> getListaOcorrencia() {
        return listaOcorrencia;
    }

    public void setListaOcorrencia(List <OcorrenciaModel> listaOcorrencia) {
        this.listaOcorrencia = listaOcorrencia;
    }
    
    
    
}
