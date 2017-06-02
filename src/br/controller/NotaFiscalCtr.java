/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

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
public class NotaFiscalCtr implements Initializable {
    
    
@FXML TextField txtNumero;
@FXML TextField txtCodigo;
@FXML DatePicker dateEntrada;
@FXML TextField txtInscricaoMunic;
@FXML TextField txtValortotal;
@FXML TextField txtISS;
@FXML TextField txtCNPJ;
@FXML DatePicker dateEmissao;
@FXML TextField txtInscricaoEst;
@FXML TextField txtDescricao;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
      public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/NotaFiscalView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter NotaFiscal");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
    
}
