/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Frota;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class FrotaCtr implements Initializable {
    
    
@FXML TextField txtCodigo;
@FXML TextField txtQuantidadeDisponivel;
@FXML ComboBox cmbModelo;
@FXML TextField txtTotalModelo;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Frota frota;

ConectaBanco conecta = new ConectaBanco();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        frota = new Frota();
    }    
    
       public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/FrotaView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Frota");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
       
         @FXML
    public void btnOnActionSalvar() throws IOException, SQLException {

        frota.setCodigo(txtCodigo.getPrefColumnCount());
//        frota.setModelo(modelo);
        frota.setQuantidadeDisponivel(txtQuantidadeDisponivel.getLength());
        frota.setTotalModelo(txtTotalModelo.getLength());

        System.out.println("Informações do Frota : ");
        System.out.println("Codigo Frota : " + frota.getCodigo());
        System.out.println("Modelo : " + frota.getModelo());
        System.out.println("Quantidade Disponiveis : " + frota.getQuantidadeDisponivel());
        System.out.println("Total Modelos : " + frota.getTotalModelo());
  
    }

    @FXML
    public void btnOnActionNovo() throws IOException {

        JOptionPane.showMessageDialog(null, "Limpar Dados para novo Cliente ");

        txtCodigo.setText("");
        txtQuantidadeDisponivel.setText("");
        cmbModelo.setValue("");
        txtTotalModelo.setText("");

    }

    @FXML
    public void btnOnActionExcluir() throws IOException {

        JOptionPane.showMessageDialog(null, "Exclusão feita com Sucesso ");
        
        txtCodigo.setText("");
        txtQuantidadeDisponivel.setText("");
        cmbModelo.setValue("");
        txtTotalModelo.setText("");
        
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
