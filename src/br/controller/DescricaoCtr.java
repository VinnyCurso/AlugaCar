/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Descricao;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class DescricaoCtr implements Initializable {
    
    
@FXML TextField txtCodigo;
@FXML TextField txtItem;
@FXML TextField txtSubTotal;
@FXML TextArea txtareaDescricao;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Descricao descricao;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        descricao = new Descricao();
    } 
    
     public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/DescricaoView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Dsecricao");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
    
}
