
package br.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;



public class PrincipalFXMLCtr implements Initializable {
    
   
    
    @FXML
    private void btnFxOnaction(ActionEvent event) {
        System.out.println("You clicked me!");
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    
    
}
