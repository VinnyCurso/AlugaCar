/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

import java.util.List;

/**
 *
 * @author vinicius caetano
 */
public class Modelo {
    
    private long codigo;
    private String nome;
    private int ano;
    private float valorLocacao;
    private List <Veiculo> listaVeiculo;

    public Modelo() {
    }

    public Modelo(long codigo, String nome, int ano, float valorLocacao, List<Veiculo> listaVeiculo) {
        this.codigo = codigo;
        this.nome = nome;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
        this.listaVeiculo = listaVeiculo;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public List <Veiculo> getListaVeiculo() {
        return listaVeiculo;
    }

    public void setListaVeiculo(List <Veiculo> listaVeiculo) {
        this.listaVeiculo = listaVeiculo;
    }
    
    
    
}
