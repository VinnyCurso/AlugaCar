/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.Despesa;
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
public class DespesaCtr implements Initializable {
    
    
@FXML TextField txtCodigo;
@FXML DatePicker dateDespesa;
@FXML TextField txtValorTotal;
@FXML ComboBox cmbTIpoDespesa;
@FXML TextField txtPagamento;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Despesa despesa;

ConectaBanco conecta = new ConectaBanco();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      despesa = new Despesa();
    }  
    
      public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/DespesaView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Despesa");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
      
      @FXML
    public void btnOnActionSalvar() throws IOException, SQLException {

        despesa.setCodigo(txtCodigo.getPrefColumnCount());
        despesa.setData(dateDespesa.getValue());
        despesa.setValorTotalDespesa(txtValorTotal.getPrefColumnCount());
//        despesa.setPagamento(pagamento.get);

        System.out.println("Informações do Despesa : ");
        System.out.println("Codigo : " + despesa.getCodigo());
        System.out.println("Data da Despesa : " + despesa.getData());
        System.out.println("Valor Total : " + despesa.getValorTotalDespesa());
        System.out.println("Pagamento : " + despesa.getPagamento());


    }

    @FXML
    public void btnOnActionNovo() throws IOException {

        JOptionPane.showMessageDialog(null, "Limpar Dados para novo Cliente ");

        txtCodigo.setText("");
        dateDespesa.setAccessibleText("");
        txtValorTotal.setText("");
        cmbTIpoDespesa.setValue("");
        txtPagamento.setText("");

    }

    @FXML
    public void btnOnActionExcluir() throws IOException {

        JOptionPane.showMessageDialog(null, "Exclusão feita com Sucesso ");
        
        txtCodigo.setText("");
        dateDespesa.setAccessibleText("");
        txtValorTotal.setText("");
        cmbTIpoDespesa.setValue("");
        txtPagamento.setText("");

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
