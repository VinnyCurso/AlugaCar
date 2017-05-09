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
public class ModeloModel {
    
    private long id;
    private String nome;
    private Date ano;
    private float valorLocacao;
    private List<VeiculoModel> listaVeiculo;

    public ModeloModel() {
    }

    public ModeloModel(long id, String nome, Date ano, float valorLocacao, List<VeiculoModel> listaVeiculo) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
        this.listaVeiculo = listaVeiculo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public List<VeiculoModel> getListaVeiculo() {
        return listaVeiculo;
    }

    public void setListaVeiculo(List<VeiculoModel> listaVeiculo) {
        this.listaVeiculo = listaVeiculo;
    }
    
    
    
}
