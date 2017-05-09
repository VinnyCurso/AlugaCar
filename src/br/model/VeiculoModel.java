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
public class VeiculoModel {
    
    private long id;
    private String placa;
    private String chassi;
    private String cor;
    private int quantidadePortas;
    private float kmVeiculo;
    private Date anoFabricacao;
    private ModeloModel modelo;
     private List<AcessorioModel> listaAcessorio;

    public VeiculoModel() {
    }

    public VeiculoModel(long id, String placa, String chassi, String cor, int quantidadePortas, float kmVeiculo, Date anoFabricacao, ModeloModel modelo, List<AcessorioModel> listaAcessorio) {
        this.id = id;
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.quantidadePortas = quantidadePortas;
        this.kmVeiculo = kmVeiculo;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.listaAcessorio = listaAcessorio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public float getKmVeiculo() {
        return kmVeiculo;
    }

    public void setKmVeiculo(float kmVeiculo) {
        this.kmVeiculo = kmVeiculo;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public ModeloModel getModelo() {
        return modelo;
    }

    public void setModelo(ModeloModel modelo) {
        this.modelo = modelo;
    }

    public List<AcessorioModel> getListaAcessorio() {
        return listaAcessorio;
    }

    public void setListaAcessorio(List<AcessorioModel> listaAcessorio) {
        this.listaAcessorio = listaAcessorio;
    }
     
     
    
}
