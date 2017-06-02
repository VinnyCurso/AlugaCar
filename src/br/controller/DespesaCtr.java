/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Despesa;
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
public class DespesaCtr implements Initializable {
    
    
@FXML TextField txtCodigo;
@FXML DatePicker dateDespesa;
@FXML TextField txtValorTotal;
@FXML ComboBox cmbTIpoDespesa;
@FXML TextField txtPagamento;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Despesa despesa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      despesa = new Despesa();
    }  
    
      public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/DespesaView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Despesa");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
    
}
