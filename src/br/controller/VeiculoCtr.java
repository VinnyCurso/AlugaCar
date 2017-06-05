/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Marca;
import br.model.Modelo;
import br.model.Veiculo;

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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class VeiculoCtr implements Initializable {

//Campos do Cliente View
    
@FXML ComboBox <String>cmbMarca;
@FXML ComboBox <String>cmbModelo;
@FXML TextField txtPlaca;
@FXML TextField txtChassi;
@FXML TextField txtAnoFabricacao;
@FXML TextField txtCor;
@FXML ComboBox <String>cmbQuantidadePortas;
@FXML TextField txtKmRodados;

@FXML CheckBox itemArcondicionado;
@FXML CheckBox itemDirecao;
@FXML CheckBox itemVidroEletrico;
@FXML CheckBox itemBancoCouro;
@FXML CheckBox itemDvdPlayer;
@FXML CheckBox itemGPS;
@FXML CheckBox itemRodaLiga;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Veiculo veiculo;
private Marca marca;
private Modelo modelo;

List<String> listMarca;
ObservableList<String> ObsListMarca;

List<String> listModelo;
ObservableList<String> ObsListModelo;


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       veiculo = new Veiculo();
       marca = new Marca();
       modelo = new Modelo();
       
         this.CarregarComboMarca();
         this.CarregarComboModelo();
       
    }   
    
     public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/VeiculoView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Veiculo");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
     
      @FXML
    public void hlinkOnActionHelpDesk() throws IOException{
        HelpDeskCtr helpDesk = new HelpDeskCtr();
        helpDesk.gerarTela();
    }
    @FXML
    public void cmbOnActionMarca(){
        System.out.println(cmbMarca.getSelectionModel().getSelectedItem().toString());
    }
    @FXML
    public void cmbOnActionModelo(){
         System.out.println(cmbModelo.getSelectionModel().getSelectedItem().toString());
    }
    
     
     public void CarregarComboMarca(){
         
         List<String> listMarca = new ArrayList();
         
         Marca marca1 = new Marca("Ford");
         Marca marca2 = new Marca("Honda");
         Marca marca3 = new Marca("Volkswagen");
         
         listMarca.add("Ford");
         listMarca.add("Honda");
         listMarca.add("Volkswagen");
         
          ObsListMarca = FXCollections.observableArrayList(listMarca);
          cmbMarca.setItems(ObsListMarca);
         
     }
     
     public void CarregarComboModelo(){
         
          List<String> listModelo = new ArrayList();
          
          //Ford
          Modelo modelo1 = new Modelo("Ka+");
          Modelo modelo2 = new Modelo("F-250");
          Modelo modelo3 = new Modelo("Fiesta");
          Modelo modelo4 = new Modelo("Jeep");
          
          //Honda
          Modelo modelo5 = new Modelo("City");
          Modelo modelo6 = new Modelo("Civic");
          Modelo modelo7 = new Modelo("HR-V");

          //Volkswagen
          Modelo modelo8 = new Modelo("Jetta");
          Modelo modelo9 = new Modelo("Golf");
          Modelo modelo10 = new Modelo("Gol");
          Modelo modelo11 = new Modelo("Polo Classic");
          
         
         listModelo.add("Ka+");
         listModelo.add("F-250");
         listModelo.add("Fiesta");
         listModelo.add("Jeep");
         listModelo.add("City");
         listModelo.add("Civic");
         listModelo.add("HR-V");
         listModelo.add("Jetta");
         listModelo.add("Golf");
         listModelo.add("Gol");
         listModelo.add("Polo Classic");
         
          ObsListModelo = FXCollections.observableArrayList(listModelo);
          cmbModelo.setItems(ObsListModelo);
         
     }
     
    
}
