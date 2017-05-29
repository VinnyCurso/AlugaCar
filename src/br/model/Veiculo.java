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
public class Veiculo {
    
    private long codigo;
    private String placa;
    private String chassi;
    private String cor;
    private int quantidadePortas;
    private float kmVeiculo;
    private int anoFabricacao;
    private Modelo modelo;
    private List<Acessorio> listaAcessorio;

    public Veiculo() {
    }

    public Veiculo(long codigo, String placa, String chassi, String cor, int quantidadePortas, float kmVeiculo, int anoFabricacao, Modelo modelo, List<Acessorio> listaAcessorio) {
        this.codigo = codigo;
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.quantidadePortas = quantidadePortas;
        this.kmVeiculo = kmVeiculo;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.listaAcessorio = listaAcessorio;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
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

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public List<Acessorio> getListaAcessorio() {
        return listaAcessorio;
    }

    public void setListaAcessorio(List<Acessorio> listaAcessorio) {
        this.listaAcessorio = listaAcessorio;
    }
    
    
    
}
