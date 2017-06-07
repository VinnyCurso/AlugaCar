/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.dao.EstadoDao;
import br.model.Estado;
import database.Database;
import database.DatabaseFactory;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class EstadoCtr implements Initializable {
    
    @FXML
    private TableView<Estado> tableViewEstado;

    @FXML
    private TableColumn<Estado, Integer> tabelaColunaCodigo;

    @FXML
    private TableColumn<Estado, String> tabelaColunaEstado;

    @FXML
    private Button btnInserir;

    @FXML
    private Button btnAlterar;

    @FXML
    private Button btnRemover;

    @FXML
    private Label LabelCodigo;

    @FXML
    private Label LabelEstado;
    
    private Estado estado;

    private List<Estado> listEstado;
    private ObservableList<Estado> observableListEstado;
    
     //Atritutos para manipulação banco de dados
    
    private final Database database = DatabaseFactory.getDatabase("postgresql");
    private final Connection connection = database.conectar();
    private final EstadoDao estadoDao = new EstadoDao();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        estado = new Estado();
        
        estadoDao.setConnection(connection);
        carregarTabelaEstado();
        
        tableViewEstado.getSelectionModel().selectionModeProperty().addListener(
                (observale, oldValue, newValue) -> selecionarItemTabelaEstado(estado));
        
    }  
    
    public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/EstadoView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Estado");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
    
   public  void carregarTabelaEstado(){
        
        tabelaColunaCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        tabelaColunaEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        
        listEstado = estadoDao.listar();
        
        observableListEstado = FXCollections.observableArrayList(listEstado);
        tableViewEstado.setItems(observableListEstado);
    }
   
    public void selecionarItemTabelaEstado(Estado estado) {

        if (estado != null) {
            LabelCodigo.setText(String.valueOf(estado.getCodigo()));
            LabelEstado.setText(estado.getEstado());
        } else {
            LabelCodigo.setText("");
            LabelEstado.setText("");
        }

    }

    public void BotaoInserir() {

        if (estado != null) {
            Estado estado = new Estado();
            estadoDao.inserir(estado);
            carregarTabelaEstado();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Favor , inserir um estado");
            alert.show();
        }

    }
    
        public void BotaoAlterar() {

        if (estado != null) {
            Estado estado = new Estado();
            estadoDao.alterar(estado);
            carregarTabelaEstado();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Favor , inserir um estado");
            alert.show();
        }

    }
        
            public void BotaoRemover() {

        if (estado != null) {
            Estado estado = new Estado();
            estadoDao.remover(estado);
            carregarTabelaEstado();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Favor , inserir um estado");
            alert.show();
        }

    }

}
