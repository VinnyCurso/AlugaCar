/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Manutencao;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class ManutencaoCtr implements Initializable {
    
@FXML TextField txtCodigo;
@FXML TextArea txtareaDescricao;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Manutencao manutencao;

ConectaBanco conecta = new ConectaBanco();


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       manutencao = new Manutencao();
    }   
    
     public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/ManutencaoView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Manutencao");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
 
    @FXML
    public void btnOnActionSalvar() throws IOException, SQLException {

        manutencao.setCodigo(txtCodigo.getPrefColumnCount());
        manutencao.setDescricao(txtareaDescricao.getText());

        System.out.println("Informações do Manutencao : ");
        System.out.println("Codigo Manutencao : " + manutencao.getCodigo());
        System.out.println("Descricao Manutencao : " + manutencao.getDescricao());

    }

    @FXML
    public void btnOnActionNovo() throws IOException {

        JOptionPane.showMessageDialog(null, "Limpar Dados para novo Cliente ");

        txtCodigo.setText("");
        txtareaDescricao.setText("");

    }

    @FXML
    public void btnOnActionExcluir() throws IOException {

        JOptionPane.showMessageDialog(null, "Exclusão feita com Sucesso ");

        txtCodigo.setText("");
        txtareaDescricao.setText("");

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
