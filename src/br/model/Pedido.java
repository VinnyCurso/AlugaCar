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
public class Pedido {
    
    private long codigo;
    private LocalDate dataPedido;
    private Cliente cliente;
    private Enum status;
    private float caucao;
    private float total;
    private List<Locacao> listaLocacao;
    private List<Pagamento> listaPagamento;

    public Pedido() {
    }

    public Pedido(long codigo, LocalDate dataPedido, Cliente cliente, Enum status, float caucao, float total, List<Locacao> listaLocacao, List<Pagamento> listaPagamento) {
        this.codigo = codigo;
        this.dataPedido = dataPedido;
        this.cliente = cliente;
        this.status = status;
        this.caucao = caucao;
        this.total = total;
        this.listaLocacao = listaLocacao;
        this.listaPagamento = listaPagamento;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public List<Locacao> getListaLocacao() {
        return listaLocacao;
    }

    public void setListaLocacao(List<Locacao> listaLocacao) {
        this.listaLocacao = listaLocacao;
    }

    public List<Pagamento> getListaPagamento() {
        return listaPagamento;
    }

    public void setListaPagamento(List<Pagamento> listaPagamento) {
        this.listaPagamento = listaPagamento;
    }
    
    
    
    
}
