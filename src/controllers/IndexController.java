/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class IndexController implements Initializable {
    
     @FXML
    private Menu btn_MenuCliente;

    @FXML
    private Menu btn_fornecedor;

    @FXML
    private Menu btn_equipamentos;

    @FXML
    private MenuItem btn_cadastrarEquipamento;

    @FXML
    private MenuItem btn_reserva;

    @FXML
    private Menu btn_contrato;

    @FXML
    private Menu btn_pagamento;

    @FXML
    private Menu btn_pesquisa;

    @FXML
    void clica_cadastrarEquipamento(ActionEvent event) {

    }

    @FXML
    void clica_cliente(ActionEvent event) {

    }

    @FXML
    void clica_contrato(ActionEvent event) {

    }

    @FXML
    void clica_fornecedor(ActionEvent event) {

    }

    @FXML
    void clica_pagamento(ActionEvent event) {

    }

    @FXML
    void clica_pesquisa(ActionEvent event) {

    }

    @FXML
    void clica_reserva(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
