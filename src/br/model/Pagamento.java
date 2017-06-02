/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

import java.time.LocalDate;

/**
 *
 * @author vinicius caetano
 */
public class Pagamento {
    
    private long codigo;
    private LocalDate data;
    private float valorPago;
    private float troco;
    private Enum formaPagamento;
    private Enum tipoPagamento;

    
    public Pagamento() {
    }

    public Pagamento(long codigo, LocalDate data, float valorPago, float troco, Enum formaPagamento, Enum tipoPagamento) {
        this.codigo = codigo;
        this.data = data;
        this.valorPago = valorPago;
        this.troco = troco;
        this.formaPagamento = formaPagamento;
        this.tipoPagamento = tipoPagamento;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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
