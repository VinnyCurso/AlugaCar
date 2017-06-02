/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Marca;
import br.model.Modelo;
import br.model.Veiculo;
import java.awt.Checkbox;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class VeiculoCtr implements Initializable {

//Campos do Cliente View
    
@FXML ComboBox cmbMarca;
@FXML ComboBox cmbModelo;
@FXML TextField txtPlaca;
@FXML TextField txtChassi;
@FXML TextField txtAnoFabricacao;
@FXML TextField txtCor;
@FXML ComboBox cmbQuantidadePortas;
@FXML TextField txtKmRodados;

@FXML Checkbox itemArcondicionado;
@FXML Checkbox itemDirecao;
@FXML Checkbox itemVidroEletrico;
@FXML Checkbox itemBancoCouro;
@FXML Checkbox itemDvdPlayer;
@FXML Checkbox itemGPS;
@FXML Checkbox itemRodaLiga;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Veiculo veiculo;
private Marca marca;
private Modelo modelo;

List<Marca> listMarca;
List<Modelo> listModelo;

ObservableList<Marca> itemMarca;
ObservableList<Modelo> itemModelo;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       veiculo = new Veiculo();
       marca = new Marca();
       modelo = new Modelo();
       
    }   
    
     public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/VeiculoView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Veiculo");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
    
}
