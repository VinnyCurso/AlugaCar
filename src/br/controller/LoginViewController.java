/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class LoginViewController implements Initializable {
    
    @FXML private Button btnToolCliente;
    @FXML private Button btnToolVeiculo;
    
    private Stage dialogStage;
    
    @FXML
    private void btnFxOnaction(ActionEvent event) {
        System.out.println("Sistema Iniciando...");
       
    }
    
     //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*  Evento -*-*-*-*-*-*-*-*-*-*-*-*-*-*-* 
    //----------------------------------Tela Veiculo----------------------------
    
    @FXML
    public void btnAcessar() throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/PrincipalFXML.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Login");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
           
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
