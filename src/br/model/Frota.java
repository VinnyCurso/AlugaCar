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
public class Frota {
    
    private long codigo;
    private float totalModelo;
    private float quantidadeDisponivel;
    private Modelo modelo;

    public Frota() {
    }

    public Frota(long codigo, float totalModelo, float quantidadeDisponivel, Modelo modelo) {
        this.codigo = codigo;
        this.totalModelo = totalModelo;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.modelo = modelo;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
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

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
    
}
