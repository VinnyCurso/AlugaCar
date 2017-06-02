package br.controller;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author vinicius caetano
 */
public class HelpDeskCtr {
    
    public void gerarTela() throws IOException{
        
        WebView browser = new WebView();
        WebEngine webEngine = browser.getEngine();
        webEngine.load("http://www.google.com.br");
        
        AnchorPane root = new AnchorPane();
        root.getChildren().add(browser);
        Stage dialogStage = new Stage();
        Scene scene = new Scene(root);
        
        dialogStage.setTitle("Manter Cliente");
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
            
        
    }
}