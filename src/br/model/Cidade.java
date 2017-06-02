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
public class Cidade {
    
    private long codigo;
    private String cidade;
    //Atributos para combo
    private String goiania;

    public Cidade() {
    }

    public Cidade(long codigo, String cidade) {
        this.codigo = codigo;
        this.cidade = cidade;
    }

    //Construtores para combo
    public Cidade(String goiania) {
        this.goiania = goiania;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
    
}
