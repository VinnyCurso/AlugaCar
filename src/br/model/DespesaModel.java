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
public class DespesaModel {
    
    private long id;
    private Date data;
    private float valorTotalDespesa;
    private Enum tipoDespesa;
    private PagamentoModel pagamento;

    public DespesaModel() {
    }

    public DespesaModel(long id, Date data, float valorTotalDespesa, Enum tipoDespesa, PagamentoModel pagamento) {
        this.id = id;
        this.data = data;
        this.valorTotalDespesa = valorTotalDespesa;
        this.tipoDespesa = tipoDespesa;
        this.pagamento = pagamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
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

    public PagamentoModel getPagamento() {
        return pagamento;
    }

    public void setPagamento(PagamentoModel pagamento) {
        this.pagamento = pagamento;
    }
    
    
    
}
