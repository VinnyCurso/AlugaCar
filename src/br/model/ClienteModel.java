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
public class ClienteModel {
    
    private long id;
    private String nome;
    private String cpf;
    private EnderecoModel endereco;
    private ContatoModel contato;
    private CnhModel cnh;

    public ClienteModel() {
    }

    public ClienteModel(long id, String nome, String cpf, EnderecoModel endereco, ContatoModel contato, CnhModel cnh) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.cnh = cnh;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public ContatoModel getContato() {
        return contato;
    }

    public void setContato(ContatoModel contato) {
        this.contato = contato;
    }

    public CnhModel getCnh() {
        return cnh;
    }

    public void setCnh(CnhModel cnh) {
        this.cnh = cnh;
    }
    
}
