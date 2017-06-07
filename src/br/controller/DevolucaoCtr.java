/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Devolucao;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class DevolucaoCtr implements Initializable {
    
    
@FXML TextField txtCodDevolucao;
@FXML TextField txtCodLocacao;
@FXML TextField txtCliente;
@FXML TextField txtPlaca;
@FXML DatePicker DateLocacao;
@FXML TextField txtKmInicial;
@FXML TextField txtValorInicial;
@FXML DatePicker DateDevolucao;
@FXML TextField txtKmFinal;
@FXML TextField txtValorFinal;

@FXML private Button btnOcorrencia;
@FXML private Button btnPesquisaLocacao;
@FXML private Button btnPesquisaCliente;
@FXML private Button btnPesquisaVeiculo;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Devolucao devolucao;

ConectaBanco conecta = new ConectaBanco();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     devolucao = new Devolucao();
    } 
    
       public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/DevolucaoView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Devolucao");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
       
       @FXML
    public void btnOnActionSalvar() throws IOException, SQLException {

        devolucao.setCodigo(txtCodDevolucao.getPrefColumnCount());
        devolucao.setDataDevolucao(DateDevolucao.getValue());
        devolucao.setKmFinal(txtKmFinal.hashCode());
        devolucao.setTotalFinal((float) txtValorFinal.getHeight());

        System.out.println("Informações do Devolucao : ");
        System.out.println("Codigo Devolucao : " + devolucao.getCodigo());
        System.out.println("Data Devolucao : " + devolucao.getDataDevolucao());
        System.out.println("Quilometros Final : " + devolucao.getKmFinal());
        System.out.println("Valor Final : " + devolucao.getTotalFinal());

    }

    @FXML
    public void btnOnActionNovo() throws IOException {

        JOptionPane.showMessageDialog(null, "Limpar Dados para novo Cliente ");

        txtCodDevolucao.setText("");
        txtCodLocacao.setText("");
        txtCliente.setText("");
        txtPlaca.setText("");
        DateLocacao.setAccessibleText("");
        txtKmInicial.setText("");
        txtValorInicial.setText("");
        DateDevolucao.setAccessibleText("");
        txtKmFinal.setText("");
        txtValorFinal.setText("");

    }

    @FXML
    public void btnOnActionExcluir() throws IOException {

        JOptionPane.showMessageDialog(null, "Exclusão feita com Sucesso ");

        txtCodDevolucao.setText("");
        txtCodLocacao.setText("");
        txtCliente.setText("");
        txtPlaca.setText("");
        DateLocacao.setAccessibleText("");
        txtKmInicial.setText("");
        txtValorInicial.setText("");
        DateDevolucao.setAccessibleText("");
        txtKmFinal.setText("");
        txtValorFinal.setText("");

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
