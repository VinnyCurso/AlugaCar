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
public class Estado {
    
    
    private long codigo;
    private String estado;
    private String go;

    public Estado() {
    }

    public Estado(long codigo, String estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    public Estado(String go) {
       this.go=go;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
