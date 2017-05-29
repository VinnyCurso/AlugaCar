/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author vinicius caetano
 */
public class NotaFiscal {
    
    private long codigo;
    private String numero;
    private String CNPJ;
    private String InscEst;
    private String InscMun;
    private LocalDate dataEmissao;
    private LocalDate dataEntrada;
    private float valorTotal;
    private float ISS;
    private List <Descricao> listaDescricao;

    public NotaFiscal() {
    }

    public NotaFiscal(long codigo, String numero, String CNPJ, String InscEst, String InscMun, LocalDate dataEmissao, LocalDate dataEntrada, float valorTotal, float ISS, List<Descricao> listaDescricao) {
        this.codigo = codigo;
        this.numero = numero;
        this.CNPJ = CNPJ;
        this.InscEst = InscEst;
        this.InscMun = InscMun;
        this.dataEmissao = dataEmissao;
        this.dataEntrada = dataEntrada;
        this.valorTotal = valorTotal;
        this.ISS = ISS;
        this.listaDescricao = listaDescricao;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInscEst() {
        return InscEst;
    }

    public void setInscEst(String InscEst) {
        this.InscEst = InscEst;
    }

    public String getInscMun() {
        return InscMun;
    }

    public void setInscMun(String InscMun) {
        this.InscMun = InscMun;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getISS() {
        return ISS;
    }

    public void setISS(float ISS) {
        this.ISS = ISS;
    }

    public List <Descricao> getListaDescricao() {
        return listaDescricao;
    }

    public void setListaDescricao(List <Descricao> listaDescricao) {
        this.listaDescricao = listaDescricao;
    }
    
    
    
}
