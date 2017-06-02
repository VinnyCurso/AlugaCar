/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Locacao;
import br.model.Veiculo;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
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

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class LocacaoCtr implements Initializable {

  
    
@FXML ComboBox cmbVeiculo;
@FXML TextField txtKmInicial;
@FXML DatePicker DateLocacao;
@FXML TextField txtCodigo;
@FXML TextField txtFinalidade;
@FXML TextField txtKmFinal;
@FXML TextField txtSubTotal;
@FXML ComboBox cmbStatus;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Locacao locacao;

List<Veiculo> listVeiculo;
ObservableList<Veiculo> item;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        locacao = new Locacao();
    }   
    
     public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/LocacaoView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Locacao");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
    
}
