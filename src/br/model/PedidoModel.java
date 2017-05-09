/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author vinicius caetano
 */
public class PedidoModel {
    
    private long id;
    private Date dataPedido;
    private Enum status;
    private float caucao;
    private float total;
    private List<LocacaoModel> listaLocacao;
    private List<PagamentoModel> listaPagamento;
    private ClienteModel cliente;

    public PedidoModel() {
    }

    public PedidoModel(long id, Date dataPedido, Enum status, float caucao, float total, List<LocacaoModel> listaLocacao, List<PagamentoModel> listaPagamento, ClienteModel cliente) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.status = status;
        this.caucao = caucao;
        this.total = total;
        this.listaLocacao = listaLocacao;
        this.listaPagamento = listaPagamento;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public float getCaucao() {
        return caucao;
    }

    public void setCaucao(float caucao) {
        this.caucao = caucao;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<LocacaoModel> getListaLocacao() {
        return listaLocacao;
    }

    public void setListaLocacao(List<LocacaoModel> listaLocacao) {
        this.listaLocacao = listaLocacao;
    }

    public List<PagamentoModel> getListaPagamento() {
        return listaPagamento;
    }

    public void setListaPagamento(List<PagamentoModel> listaPagamento) {
        this.listaPagamento = listaPagamento;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }
    
    
    
}
