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
public class Despesa {
    
    private long codigo;
    private LocalDate data;
    private float valorTotalDespesa;
    private Enum tipoDespesa;
    private Pagamento pagamento;

    public Despesa() {
    }

    public Despesa(long codigo, LocalDate data, float valorTotalDespesa, Enum tipoDespesa, Pagamento pagamento) {
        this.codigo = codigo;
        this.data = data;
        this.valorTotalDespesa = valorTotalDespesa;
        this.tipoDespesa = tipoDespesa;
        this.pagamento = pagamento;
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

    public float getValorTotalDespesa() {
        return valorTotalDespesa;
    }

    public void setValorTotalDespesa(float valorTotalDespesa) {
        this.valorTotalDespesa = valorTotalDespesa;
    }

    public Enum getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(Enum tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    
    
    
    
}
