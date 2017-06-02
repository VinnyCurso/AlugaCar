/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Devolucao;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class DevolucaoCtr implements Initializable {
    
    
@FXML TextField txtCodDevolucao;
@FXML TextField txtCodLocacao;
@FXML TextField txtCliente;
@FXML TextField txtPlaca;
@FXML DatePicker DateLocacao;
@FXML TextField txtKmInicial;
@FXML TextField txtValorInicial;
@FXML private Button btnPesquisaLocacao;
@FXML private Button btnPesquisaCliente;
@FXML private Button btnPesquisaVeiculo;
@FXML DatePicker DateDevolucao;
@FXML TextField txtKmFinal;
@FXML TextField txtValorFinal;
@FXML private Button btnOcorrencia;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Devolucao devolucao;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     devolucao = new Devolucao();
    } 
    
       public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/DevolucaoView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Devolucao");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
    
}
