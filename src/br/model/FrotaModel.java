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
public class FrotaModel {
    
    private long id;
    private float totalModelo;
    private float quantidadeDisponivel;
    private ModeloModel modelo;

    public FrotaModel() {
    }

    public FrotaModel(long id, float totalModelo, float quantidadeDisponivel, ModeloModel modelo) {
        this.id = id;
        this.totalModelo = totalModelo;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.modelo = modelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getTotalModelo() {
        return totalModelo;
    }

    public void setTotalModelo(float totalModelo) {
        this.totalModelo = totalModelo;
    }

    public float getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(float quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public ModeloModel getModelo() {
        return modelo;
    }

    public void setModelo(ModeloModel modelo) {
        this.modelo = modelo;
    }
    
    
    
}
