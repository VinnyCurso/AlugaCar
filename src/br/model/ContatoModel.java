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
public class ContatoModel {
    
    private String celular;
    private String residencial;
    private String email;

    public ContatoModel() {
    }

    public ContatoModel(String celular, String residencial, String email) {
        this.celular = celular;
        this.residencial = residencial;
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getResidencial() {
        return residencial;
    }

    public void setResidencial(String residencial) {
        this.residencial = residencial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
