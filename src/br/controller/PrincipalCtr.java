/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author vinicius caetano
 */
public class PrincipalCtr implements Initializable {
    
   
    //Comando Botoes
    
     @FXML private Button btnCliente;
     @FXML private Button btnVeiculo;
     @FXML private Button btnLocacao;
     @FXML private Button btnOcorrencia;
     @FXML private Button btnDevolucao;
     @FXML private Button btnDespesa;
     @FXML private Button btnPagamento;
     
     @FXML private Button btnFrota;
     @FXML private Button btnPedido;
     @FXML private Button btnManutencao;
     @FXML private Button btnNotaFiscal;
     
     private Stage dialogStage;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        //Imagem Botao Cliente
        Image imgcliente = new Image(getClass().getResourceAsStream("/imagem/cliente.png"));
        ImageView imgView = new ImageView(imgcliente);
        imgView.setFitHeight(65);
        imgView.setFitWidth(80);
        btnCliente.setGraphic(imgView);
        
         //Imagem Botao Veiculo
        Image imgveiculo = new Image(getClass().getResourceAsStream("/imagem/veiculo.png"));
        ImageView imgView1 = new ImageView(imgveiculo);
        imgView1.setFitHeight(65);
        imgView1.setFitWidth(80);
        btnVeiculo.setGraphic(imgView1);
//        
          //Imagem Botao Locacao
        Image imglocacao = new Image(getClass().getResourceAsStream("/imagem/loca.png"));
        ImageView imgView2 = new ImageView(imglocacao);
        imgView2.setFitHeight(65);
        imgView2.setFitWidth(80);
        btnLocacao.setGraphic(imgView2);
        
           //Imagem Botao Ocorrencia
        Image imgocorrencia = new Image(getClass().getResourceAsStream("/imagem/ocorrencia.png"));
        ImageView imgView3 = new ImageView(imgocorrencia);
        imgView3.setFitHeight(65);
        imgView3.setFitWidth(80);
        btnOcorrencia.setGraphic(imgView3);
        
            //Imagem Botao Devolucao
        Image imgdevolucao = new Image(getClass().getResourceAsStream("/imagem/devolucao1.png"));
        ImageView imgView4 = new ImageView(imgdevolucao);
        imgView4.setFitHeight(65);
        imgView4.setFitWidth(80);
        btnDevolucao.setGraphic(imgView4);
        
            //Imagem Botao Despesa
        Image imgdespesa = new Image(getClass().getResourceAsStream("/imagem/despesa.png"));
        ImageView imgView5 = new ImageView(imgdespesa);
        imgView5.setFitHeight(65);
        imgView5.setFitWidth(80);
        btnDespesa.setGraphic(imgView5);
        
//            Imagem Botao Pagamento
        Image imgpagamento = new Image(getClass().getResourceAsStream("/imagem/pagamento.png"));
        ImageView imgView6 = new ImageView(imgpagamento);
        imgView6.setFitHeight(65);
        imgView6.setFitWidth(80);
        btnPagamento.setGraphic(imgView6);
        
           //            Imagem Botao Frota
        Image imgfrota = new Image(getClass().getResourceAsStream("/imagem/frota.png"));
        ImageView imgView7 = new ImageView(imgfrota);
        imgView7.setFitHeight(65);
        imgView7.setFitWidth(80);
        btnFrota.setGraphic(imgView7);
        
    

//            Imagem Botao Pedido
        Image imgpedido = new Image(getClass().getResourceAsStream("/imagem/pedido.png"));
        ImageView imgView8 = new ImageView(imgpedido);
        imgView8.setFitHeight(65);
        imgView8.setFitWidth(80);
        btnPedido.setGraphic(imgView8);

        
//            Imagem Botao Manutencao
        Image imgmanu = new Image(getClass().getResourceAsStream("/imagem/manutencao.png"));
        ImageView imgView9 = new ImageView(imgmanu);
        imgView9.setFitHeight(65);
        imgView9.setFitWidth(80);
        btnManutencao.setGraphic(imgView9);
        
    

//            Imagem Botao NotaFiscal
        Image imgnotafiscal = new Image(getClass().getResourceAsStream("/imagem/notafiscal.png"));
        ImageView imgView10 = new ImageView(imgnotafiscal);
        imgView10.setFitHeight(65);
        imgView10.setFitWidth(80);
        btnNotaFiscal.setGraphic(imgView10);
       
    } 
    
 
        
    
    

    
    //Ação para cadastro de cliente
     @FXML
    public void btnOnActionCliente()throws IOException {
        
        ClienteCtr clienteCtr = new ClienteCtr();
        clienteCtr.gerarTela();
}
        //Ação para cadastro de veiculo
     @FXML
    public void btnOnActionVeiculo()throws IOException {
        
        VeiculoCtr veiculoCtr = new VeiculoCtr();
        veiculoCtr.gerarTela();
}
    
        //Ação para cadastro de Locacao
     @FXML
    public void btnOnActionLocacao()throws IOException {
        
        LocacaoCtr locacaoCtr = new LocacaoCtr();
        locacaoCtr.gerarTela();
}
    
          //Ação para cadastro de Ocorrencias
     @FXML
    public void btnOnActionOcorrencia()throws IOException {
        
        OcorrenciaCtr ocorrenciaCtr = new OcorrenciaCtr();
        ocorrenciaCtr.gerarTela();
}
    
             //Ação para cadastro de Devolucao
     @FXML
    public void btnOnActionDevolucao()throws IOException {
        
        DevolucaoCtr devolucaoCtr = new DevolucaoCtr();
        devolucaoCtr.gerarTela();
}
    
               //Ação para cadastro de Despesa
     @FXML
    public void btnOnActionDespesa()throws IOException {
        
        DespesaCtr despesaCtr = new DespesaCtr();
        despesaCtr.gerarTela();
}
    
                 //Ação para cadastro de Pagamento
     @FXML
    public void btnOnActionPagamento()throws IOException {
        
        PagamentoCtr pagamentoCtr = new PagamentoCtr();
        pagamentoCtr.gerarTela();
}
    
                     //Ação para cadastro de Frota
     @FXML
    public void btnOnActionFrota()throws IOException {
        
        FrotaCtr frotaCtr = new FrotaCtr();
        frotaCtr.gerarTela();
}
                      //Ação para cadastro de NotaFiscal
     @FXML
    public void btnOnActionNotaFiscal()throws IOException {
        
        NotaFiscalCtr notaFiscalCtr = new NotaFiscalCtr();
        notaFiscalCtr.gerarTela();
} 
    
                         //Ação para cadastro de Manutencao
     @FXML
    public void btnOnActionManutencao()throws IOException {
        
        ManutencaoCtr manutencaoCtr = new ManutencaoCtr();
        manutencaoCtr.gerarTela();
}
    
                            //Ação para cadastro de Pedido
     @FXML
    public void btnOnActionPedido()throws IOException {
        
        PedidoCtr pedidoCtr = new PedidoCtr();
        pedidoCtr.gerarTela();
}
    
}
