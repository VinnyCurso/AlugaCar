/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author vinicius caetano
 */
public class Locacao {
    
    private long codigo;
    private LocalDate dataLocacao;
    private float kmInicial;
    private float kmFinal;
    private String finalidade;
    private float subtotal;
    private Enum status;
    private Veiculo veiculo;
    private List<Ocorrencia> listaOcorrencia;

    public Locacao() {
    }

    public Locacao(long codigo, LocalDate dataLocacao, float kmInicial, float kmFinal, String finalidade, float subtotal, Enum status, Veiculo veiculo, List<Ocorrencia> listaOcorrencia) {
        this.codigo = codigo;
        this.dataLocacao = dataLocacao;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.finalidade = finalidade;
        this.subtotal = subtotal;
        this.status = status;
        this.veiculo = veiculo;
        this.listaOcorrencia = listaOcorrencia;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
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

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Ocorrencia> getListaOcorrencia() {
        return listaOcorrencia;
    }

    public void setListaOcorrencia(List<Ocorrencia> listaOcorrencia) {
        this.listaOcorrencia = listaOcorrencia;
    }
    
    
    
}
