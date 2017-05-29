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
public class Marca {
    
    
    private long codigo;
    private String nome;
    private List<Modelo> listaModelo;

    public Marca() {
    }

    public Marca(long codigo, String nome, List<Modelo> listaModelo) {
        this.codigo = codigo;
        this.nome = nome;
        this.listaModelo = listaModelo;
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

    public List<Modelo> getListaModelo() {
        return listaModelo;
    }

    public void setListaModelo(List<Modelo> listaModelo) {
        this.listaModelo = listaModelo;
    }
    
    
    
}
