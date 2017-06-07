/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import br.model.NotaFiscal;
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
public class NotaFiscalCtr implements Initializable {
    
    
@FXML TextField txtNumero;
@FXML TextField txtCodigo;
@FXML DatePicker dateEntrada;
@FXML TextField txtInscricaoMunic;
@FXML TextField txtValortotal;
@FXML TextField txtISS;
@FXML TextField txtCNPJ;
@FXML DatePicker dateEmissao;
@FXML TextField txtInscricaoEst;
@FXML TextField txtDescricao;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private NotaFiscal notaFiscal;

ConectaBanco conecta = new ConectaBanco();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
      public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/NotaFiscalView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter NotaFiscal");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
      
    @FXML
    public void btnOnActionSalvar() throws IOException, SQLException {

        notaFiscal.setCodigo(txtCodigo.getPrefColumnCount());
        notaFiscal.setNumero(txtNumero.getText());
        notaFiscal.setDataEntrada(dateEntrada.getValue());
        notaFiscal.setInscMun(txtInscricaoMunic.getText());
        notaFiscal.setInscEst(txtInscricaoEst.getText());
        notaFiscal.setISS((float) txtISS.getHeight());
        notaFiscal.setCNPJ(txtCNPJ.getText());
        notaFiscal.setDataEmissao(dateEmissao.getValue());
        notaFiscal.setValorTotal((float) txtValortotal.getHeight());

        System.out.println("Informações do Nota Fiscal : ");
        System.out.println("Codigo Nota Fiscal : " + notaFiscal.getCodigo());
        System.out.println("Numero Nota Fiscal : " + notaFiscal.getNumero());
        System.out.println("Data Entrda Nota Fiscal : " + notaFiscal.getDataEntrada());
        System.out.println("Inscricao Municipal Nota Fiscal : " + notaFiscal.getInscMun());
        System.out.println("Inscricao Estadual Nota Fiscal : " + notaFiscal.getInscEst());
        System.out.println("ISS Nota Fiscal : " + notaFiscal.getISS());
        System.out.println("CNPJ Nota Fiscal : " + notaFiscal.getCNPJ());
        System.out.println("Data Emissao Nota Fiscal : " + notaFiscal.getDataEmissao());
        System.out.println("Valor Total Nota Fiscal : " + notaFiscal.getValorTotal());

    }

    @FXML
    public void btnOnActionNovo() throws IOException {

        JOptionPane.showMessageDialog(null, "Limpar Dados para novo Cliente ");
        
        txtNumero.setText("");
        txtCodigo.setText("");
        dateEntrada.setAccessibleHelp("");
        txtInscricaoMunic.setText("");
        txtValortotal.setText("");
        txtISS.setText("");
        txtCNPJ.setText("");
        dateEmissao.setAccessibleHelp("");
        txtInscricaoEst.setText("");
        txtDescricao.setText("");
    }

    @FXML
    public void btnOnActionExcluir() throws IOException {

        JOptionPane.showMessageDialog(null, "Exclusão feita com Sucesso ");

        txtNumero.setText("");
        txtCodigo.setText("");
        dateEntrada.setAccessibleHelp("");
        txtInscricaoMunic.setText("");
        txtValortotal.setText("");
        txtISS.setText("");
        txtCNPJ.setText("");
        dateEmissao.setAccessibleHelp("");
        txtInscricaoEst.setText("");
        txtDescricao.setText("");
        
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
