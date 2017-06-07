/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.dao.ClienteDao;
import br.model.Cliente;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class ClientePesquisaCtr implements Initializable {

    @FXML
    TextField txtBusca;

    @FXML
    private TableView tabelaViewCliente;

    @FXML
    private TableColumn<Cliente, Integer> tabelaColunaCodigo;

    @FXML
    private TableColumn<Cliente, String> tabelaColunaNome;

    @FXML
    private TableColumn<Cliente, String> tabelaColunaCpf;

    @FXML
    private Button btnPesquisar;

    private Cliente cliente;

    private List<Cliente> listCliente;
    private ObservableList<Cliente> observableListCliente;

    //Atritutos para manipulação banco de dados
    private final Database database = DatabaseFactory.getDatabase("postgresql");
    private final Connection connection = database.conectar();
    private final ClienteDao clienteDao = new ClienteDao();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cliente = new Cliente();

        clienteDao.setConnection(connection);
        carregarTabelaCliente();

    }

    public void gerarTela() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/ClientePesquisaView.fxml"));

        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);

        dialogStage.setTitle("Manter Pesquisar Cliente");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }

    public void carregarTabelaCliente() {

        tabelaColunaCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        tabelaColunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tabelaColunaCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));

        listCliente = clienteDao.listar();

        observableListCliente = FXCollections.observableArrayList(listCliente);
        tabelaViewCliente.setItems(observableListCliente);
    }

}

