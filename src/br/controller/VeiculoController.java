/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.MarcaModel;
import br.model.ModeloModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class VeiculoController implements Initializable {
    
    
    @FXML ComboBox comboMarca;
    @FXML ComboBox comboModelo;
    @FXML TextField  txtPlaca;
    @FXML TextField txtChassi;
    @FXML TextField  txtAnoFabricacao;
   @FXML TextField  txtCor;
   
   
   private MarcaModel marca;
   private ModeloModel modelo;
   private Stage stage;
    
    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
