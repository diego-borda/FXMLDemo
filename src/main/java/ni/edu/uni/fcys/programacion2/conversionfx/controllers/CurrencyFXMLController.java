/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sistemas-02
 */
public class CurrencyFXMLController implements Initializable {

    @FXML
    public Button btnCalcular;
    @FXML 
    public Button btnCancelar;
    
    @FXML
    public ComboBox cmbDe;
    @FXML
    public ComboBox cmbA;
    
    @FXML
    public TextField txtDe;
    @FXML
    public TextField txtA;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> Cambios = FXCollections.observableArrayList("Cordobas","Dolares","Euros");
        cmbDe.setItems(Cambios);
        cmbA.setItems(Cambios);
    }    
    
    public void CalcularAction(){
        
    }
    
}