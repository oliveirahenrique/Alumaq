/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entidade.Equipamento;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class DevolucaoController implements Initializable, Controller {
    
    @FXML
    private TableView<Equipamento> tv_contratos;

    @FXML
    private TableColumn<Equipamento, Integer> tc_id;

    @FXML
    private TableColumn<Equipamento, String> tc_cliente;

    @FXML
    private TableColumn<Equipamento, Double> tc_funcionario;
    
    @FXML
    void clica_selecionar(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
