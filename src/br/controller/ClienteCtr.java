
package br.controller;

import br.model.CNH;
import br.model.Cidade;
import br.model.Cliente;
import br.model.Contato;
import br.model.Endereco;
import br.model.Estado;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
public class ClienteCtr implements Initializable {

    //Campos do Cliente View
@FXML TextField txtNome;
@FXML TextField txtCPF;
@FXML DatePicker pikerDataNascimento;
@FXML TextField txtCep;
@FXML TextField txtLogradouro;
@FXML TextField txtComplemento;
@FXML TextField txtNumeroCnh;
@FXML DatePicker pikerVencimentoCnh;
@FXML TextField txtTelefoneResidencial;
@FXML TextField txtCelular;
@FXML TextField txtEmail;
@FXML CheckBox itemPromocao;
@FXML ComboBox<String> cmbCategoria;
@FXML ComboBox<String> cmbCidade;
@FXML ComboBox<String> cmbEstado;

@FXML private Button btnNovo;
@FXML private Button btnSalvar;
@FXML private Button btnExcluir;
@FXML private Button btnPesquisar;

private Cliente cliente;
private Endereco endereco;
private Contato contato;
private Stage stage;

List<String> listEstado;
ObservableList<String> ObsListestado;

List<String> listCidade;
ObservableList<String> ObsListcidade;

List<String> listCategoria;
ObservableList<String> ObsListCategoria;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        cliente = new Cliente();
        contato = new Contato();
        endereco = new Endereco();
        
          this.CarregarComboCidade();
          this.CarregarComboeEstado();
          this.CarregarComboeCategoria();
    }   
    
     public void gerarTela() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/ClienteView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Cliente");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
    
    
     @FXML
    public void btnOnActionSalvar() throws IOException{
        cliente.setNome(txtNome.getText());
        cliente.setDataNascimento(pikerDataNascimento.getValue());
        cliente.setContato(contato);
        cliente.setEndereco(endereco);
        cliente.getContato().setCelular(txtCelular.getText());
        
        System.out.println("Nome: "+cliente.getDataNascimento());
    }
    
//       @FXML
//    public void btnOnActionSalvar() throws IOException{
//       
//           JOptionPane.showMessageDialog(null,"Salvo com Sucesso ");
//           
//        txtNome.setText("");
//        txtCPF.setText("");
//       txtLogradouro.setText("");
//       txtComplemento.setText("");
//        pikerDataNascimento.setAccessibleHelp("");
//        txtTelefoneResidencial.setText("");
//        txtCelular.setText("");
//        txtEmail.setText("");
//        txtNumeroCnh.setText("");
//        txtLogradouro.setText("");
//    }
    
    
    
    @FXML
    public void btnOnActionPesquisar() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("/br/view/ClientePesquisaView.fxml"));
        
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Pesquisar Cliente");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }
    
    
//     @FXML
//    public void btnOnActionExcluir() throws IOException  {       
//       
//       JOptionPane.showMessageDialog(null,"Exclusão feita com Sucesso ");
//      
//        txtNome.setText("");
//        txtCPF.setText("");
//       txtLogradouro.setText("");
//       txtComplemento.setText("");
//        pikerDataNascimento.setAccessibleHelp("");
//        txtTelefoneResidencial.setText("");
//        txtCelular.setText("");
//        txtEmail.setText("");
//        txtNumeroCnh.setText("");
//        txtLogradouro.setText("");
//    }
    
    @FXML
    public void hlinkOnActionHelpDesk() throws IOException{
        HelpDeskCtr helpDesk = new HelpDeskCtr();
        helpDesk.gerarTela();
    }
    @FXML
    public void cmbOnActionEstado(){
        System.out.println(cmbEstado.getSelectionModel().getSelectedItem().toString());
    }
    @FXML
    public void cmbOnActionCidade(){
         System.out.println(cmbCidade.getSelectionModel().getSelectedItem().toString());
    }
    
     @FXML
    public void cmbOnActionCategoria(){
         System.out.println(cmbCategoria.getSelectionModel().getSelectedItem());
    }
    
    public void CarregarComboCidade(){
      
        List<String> listCidade = new ArrayList();
        
       Cidade cidade1 = new Cidade("Goiânia");
       Cidade cidade2 = new Cidade("Aparecida de Goiânia");
       Cidade cidade3 = new Cidade("Guapo");
       Cidade cidade4 = new Cidade("Trindade");
       Cidade cidade5 = new Cidade("Palmas");
       Cidade cidade6 = new Cidade("Sao Paulo");
       Cidade cidade7 = new Cidade("Rio de Janeiro");
       
 
       listCidade.add("Goiânia");
       listCidade.add("Aparecida de Goiânia");
       listCidade.add("Guapo");
       listCidade.add("Trindade");
       listCidade.add("Palmas");
       listCidade.add("Sao Paulo");
       listCidade.add("Rio de Janeiro");

       
       ObsListcidade = FXCollections.observableArrayList(listCidade);
       cmbCidade.setItems(ObsListcidade);
    }
    
    public void CarregarComboeEstado(){
     
         List<String> listEstado = new ArrayList();
         
          Estado estado1 = new Estado("GO");
          Estado estado2 = new Estado("TO");
          Estado estado3 = new Estado("SP");
          Estado estado4 = new Estado("RJ");
          
          
          listEstado.add("GO");
          listEstado.add("TO");
          listEstado.add("SP");
          listEstado.add("RJ");
          
         ObsListestado = FXCollections.observableArrayList(listEstado);
         cmbEstado.setItems(ObsListestado);
    }
    
     public void CarregarComboeCategoria(){
    
         List<String> listCategoria = new ArrayList();
         
         CNH categoria1 = new CNH("AB");
         CNH categoria2 = new CNH("B");
         CNH categoria3 = new CNH("C");
         CNH categoria4 = new CNH("D");
         CNH categoria5 = new CNH("E");
         
         listCategoria.add("AB");
         listCategoria.add("B");
         listCategoria.add("C");
         listCategoria.add("D");
         listCategoria.add("E");
         
          ObsListCategoria = FXCollections.observableArrayList(listCategoria);
          cmbCategoria.setItems(ObsListCategoria);
    }
    
    
}
