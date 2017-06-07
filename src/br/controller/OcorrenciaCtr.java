/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Ocorrencia;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class OcorrenciaCtr implements Initializable {
    
@FXML TextArea txtAreaDescricao;
@FXML TextField txtCodigo;
@FXML TextField txtValorOcorrencia;
@FXML ComboBox cmbTipoOcorrencia;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;  

private Ocorrencia ocorrencia;

ConectaBanco conecta = new ConectaBanco();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ocorrencia = new Ocorrencia();
    }  
    
       public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/OcorrenciaView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Ocorrencia");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
       
       @FXML
    public void btnOnActionSalvar() throws IOException, SQLException {

        ocorrencia.setCodigo(txtCodigo.getPrefColumnCount());
        ocorrencia.setDescricao(txtAreaDescricao.getText());
        ocorrencia.setValorOcorrencia((float) txtValorOcorrencia.getHeight());


        System.out.println("Informações do Ocorrencia : ");
        System.out.println("Codigo Ocorrencia : " + ocorrencia.getCodigo());
        System.out.println("Descricao Ocorrencia : " + ocorrencia.getDescricao());
        System.out.println("Valor Ocorrencia : " + ocorrencia.getValorOcorrencia());


    }

    @FXML
    public void btnOnActionNovo() throws IOException {

        JOptionPane.showMessageDialog(null, "Limpar Dados para novo Cliente ");
        
        txtCodigo.setText("");
        txtAreaDescricao.setText("");
        txtValorOcorrencia.setText("");
        cmbTipoOcorrencia.setValue("");
    }

    @FXML
    public void btnOnActionExcluir() throws IOException {

        JOptionPane.showMessageDialog(null, "Exclusão feita com Sucesso ");

        txtCodigo.setText("");
        txtAreaDescricao.setText("");
        txtValorOcorrencia.setText("");
        cmbTipoOcorrencia.setValue("");
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
