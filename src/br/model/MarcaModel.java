/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author vinicius caetano
 */
public class MarcaModel {
    
    private long id;
    private String nome;
    private List<ModeloModel> listaModelo;

    public MarcaModel() {
    }

    public MarcaModel(long id, String nome, List<ModeloModel> listaModelo) {
        this.id = id;
        this.nome = nome;
        this.listaModelo = listaModelo;
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

    public List<ModeloModel> getListaModelo() {
        return listaModelo;
    }

    public void setListaModelo(List<ModeloModel> listaModelo) {
        this.listaModelo = listaModelo;
    }
    
    
    
}
