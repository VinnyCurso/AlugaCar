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



public class PrincipalFXMLCtr implements Initializable {
    
    @FXML private Button btnToolCliente;
    @FXML private Button btnToolVeiculo;
    
    private Stage dialogStage;
    
    @FXML
    private void btnFxOnaction(ActionEvent event) {
        System.out.println("Sistema Iniciando...");
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    
    
    
    //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*  Evento -*-*-*-*-*-*-*-*-*-*-*-*-*-*-* 
    //----------------------------------Tela Veiculo----------------------------
    
    @FXML
    public void btnActionVeiculo() throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/VeiculoView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Veiculo");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
           
    }
    
    //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*  Evento -*-*-*-*-*-*-*-*-*-*-*-*-*-*-* 
    //----------------------------------Tela Cliente----------------------------
    
    @FXML
    public void btnActionCliente() throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/ClienteView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Cliente");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
           
    }
    
      //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*  Evento -*-*-*-*-*-*-*-*-*-*-*-*-*-*-* 
    //----------------------------------Tela Locacao----------------------------
    
    @FXML
    public void btnActionLocacao() throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/LocacaoView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Efetivar Locacao");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
           
    }
    
        //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*  Evento -*-*-*-*-*-*-*-*-*-*-*-*-*-*-* 
    //----------------------------------Tela Loguin----------------------------
    
    @FXML
    public void ActionPrincipal() throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/PrincipalFXML.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Loguin Efetuado");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
           
    }
}