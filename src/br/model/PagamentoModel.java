/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

import java.util.Date;

/**
 *
 * @author vinicius caetano
 */
public class PagamentoModel {
    
    private long id;
    private Date dataTime;
    private float valorPago;
    private float troco;
    private Enum formaPagamento;
    private Enum tipoPagamento;

    public PagamentoModel() {
    }

    public PagamentoModel(long id, Date dataTime, float valorPago, float troco, Enum formaPagamento, Enum tipoPagamento) {
        this.id = id;
        this.dataTime = dataTime;
        this.valorPago = valorPago;
        this.troco = troco;
        this.formaPagamento = formaPagamento;
        this.tipoPagamento = tipoPagamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }

    public Enum getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Enum formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Enum getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Enum tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    
    
}
