/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Locacao;
import br.model.Pagamento;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class PagamentoCtr implements Initializable {

    @FXML
    TextField txtCodigo;
    @FXML
    TextField txtValorLoca;
    @FXML
    TextField txtValorPago;
    @FXML
    DatePicker datePagamento;
    @FXML
    TextField txtcaucao;
    @FXML
    TextField txttroco;

    @FXML
    ComboBox<String> cmbFormaPagamento;
    List<String> listFormaPagamento;
    ObservableList<String> ObsListFormaPagamento;

    @FXML
    ComboBox<String> cmbTipoPagamento;
    List<String> listTipoPagamento;
    ObservableList<String> ObsListTipoPagamento;

    @FXML
    private Button btnNovo;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnExcluir;
    @FXML
    private Button btnPesquisar;

    private Pagamento pagamento;
    private Locacao locacao;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pagamento = new Pagamento();
        locacao = new Locacao();

        this.CarregarComboFormaPagamento();
        this.CarregarComboTipoPagamento();
    }

    public void gerarTela() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/PagamentoView.fxml"));

        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);

        dialogStage.setTitle("Manter Pagamento");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }

    @FXML
    public void btnOnActionSalvar() throws IOException {

//        //Cliente
//        JOptionPane.showMessageDialog(null, " Informações salvas com sucesso ");
//        pagamento.setCodigo(txtCodigo.getLength());
//        locacao.setSubtotal((float) txtValorLoca.getLength());
//        pagamento.setValorPago((float) txtValorPago.getWidth());
//        pagamento.setData(datePagamento.getValue());
//        pagamento.setTroco((float) txttroco.getWidth());
//
//        System.out.println("Informações do cliente : ");
//        System.out.println("Codigo: " + pagamento.getCodigo());
//        System.out.println("Valor Locacao: " + locacao.getSubtotal());
//        System.out.println("Valor Pago: " + pagamento.getValorPago());
//        cmbOnActionFormaPagamento();
//        System.out.println("Data Pagamento: " + pagamento.getData());
//        System.out.println("Troco: " + pagamento.getTroco());
//        cmbOnActionTipoPagamento();
        br.dao.PagamentoDao.inserir();

    }

    @FXML
    public void btnOnActionNovo() throws IOException {

        JOptionPane.showMessageDialog(null, "Limpar Dados para novo Pagamento ");

        txtCodigo.setText("");
        txtValorLoca.setText("");
        txtValorPago.setText("");
        datePagamento.setAccessibleText("");
        txtcaucao.setText("");
        txttroco.setText("");
        cmbFormaPagamento.setValue("");
        cmbTipoPagamento.setValue("");

    }

    @FXML
    public void cmbOnActionFormaPagamento() {
        System.out.println("Forma de Pagamento: " + cmbFormaPagamento.getSelectionModel().getSelectedItem().toString());
    }

    @FXML
    public void cmbOnActionTipoPagamento() {
        System.out.println("Tipo de Pagamento: " + cmbTipoPagamento.getSelectionModel().getSelectedItem().toString());
    }

    public void CarregarComboFormaPagamento() {

        List<String> listFormaPagamento = new ArrayList();

        listFormaPagamento.add("Credito");
        listFormaPagamento.add("Debito");
        listFormaPagamento.add("Cheque");
        listFormaPagamento.add("Dinheiro");

        ObsListFormaPagamento = FXCollections.observableArrayList(listFormaPagamento);
        cmbFormaPagamento.setItems(ObsListFormaPagamento);
    }

    public void CarregarComboTipoPagamento() {

        List<String> listTipoPagamento = new ArrayList();

        listTipoPagamento.add("A Vista");
        listTipoPagamento.add("Parcelado 2x");
        listTipoPagamento.add("Parcelado 3x");
        listTipoPagamento.add("Parcelado 4x");
        listTipoPagamento.add("Parcelado 5x");

        ObsListTipoPagamento = FXCollections.observableArrayList(listTipoPagamento);
        cmbTipoPagamento.setItems(ObsListTipoPagamento);
    }

}
