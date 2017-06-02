/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Pagamento;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class PagamentoCtr implements Initializable {
    
    
@FXML TextField txtCodigo;
@FXML TextField txtValorLoca;
@FXML TextField txtValorPago;
@FXML ComboBox cmbFormaPagamento;
@FXML DatePicker datePagamento;
@FXML TextField txtcaucao;
@FXML TextField txttroco;
@FXML ComboBox cmbTipoPagamento;


@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Pagamento pagamento;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pagamento = new Pagamento();
    }  
    
     public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/PagamentoView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Pagamento");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
    
}
