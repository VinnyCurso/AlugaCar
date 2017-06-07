/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Pedido;
import util.ConectaBanco;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class PedidoCtr implements Initializable {
    
    
    
@FXML TextField txtCodigo;
@FXML ComboBox cmbLocacao;
@FXML TextField txtCliente;
@FXML ComboBox cmbStatus;
@FXML ComboBox cmbPagamento;
@FXML DatePicker datePedido;
@FXML TextField txtCaucao;
@FXML TextField txtTotal;

@FXML private Button btnPesquisarCliente;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Pedido pedido;

ConectaBanco conecta = new ConectaBanco();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pedido = new Pedido();
    }  
    
      public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/PedidoView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Pedido");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
      
          @FXML
    public void btnOnActionSalvar() throws IOException, SQLException {

        pedido.setCodigo(txtCodigo.getPrefColumnCount());
        pedido.setDataPedido(datePedido.getValue());
        pedido.setCaucao((float) txtCaucao.getHeight());
        pedido.setTotal((float) txtTotal.getHeight());

        System.out.println("Informações do Pedido : ");
        System.out.println("Codigo Pedido : " + pedido.getCodigo());
        System.out.println("Data Pedido : " + pedido.getDataPedido());
        System.out.println("Valor Caucao : " + pedido.getCaucao());
        System.out.println("Valor Total : " + pedido.getTotal());

  
    }

    @FXML
    public void btnOnActionNovo() throws IOException {

        JOptionPane.showMessageDialog(null, "Limpar Dados para novo Cliente ");

        txtCodigo.setText("");
        cmbLocacao.setValue("");
        txtCliente.setText("");
        cmbStatus.setValue("");
        cmbPagamento.setValue("");
        datePedido.setAccessibleText("");
        txtCaucao.setText("");
        txtTotal.setText("");

    }

    @FXML
    public void btnOnActionExcluir() throws IOException {

        JOptionPane.showMessageDialog(null, "Exclusão feita com Sucesso ");

        txtCodigo.setText("");
        cmbLocacao.setValue("");
        txtCliente.setText("");
        cmbStatus.setValue("");
        cmbPagamento.setValue("");
        datePedido.setAccessibleText("");
        txtCaucao.setText("");
        txtTotal.setText("");

    }

//    @FXML
//    public void btnOnActionPesquisar() throws IOException {
//
//        Parent root = FXMLLoader.load(getClass().getResource("/br/view/VeiculoPesquisaView.fxml"));
//
//        Stage dialogStage = new Stage();
//        Scene scene = new Scene(root);
//
//        dialogStage.setTitle("Pesquisar Veiculo");
//        dialogStage.setScene(scene);
//        dialogStage.showAndWait();
//    }
     
      @FXML
    public void hlinkOnActionHelpDesk() throws IOException{
        HelpDeskCtr helpDesk = new HelpDeskCtr();
        helpDesk.gerarTela();
    }
    
}
