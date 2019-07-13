/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class VendaController implements Initializable {
    
    @FXML
    private Button btn_concluir;

    @FXML
    private Label lb_funcionario;

    @FXML
    private TableView<?> tv_itens;

    @FXML
    private TableColumn<?, ?> tc_item;

    @FXML
    private TableColumn<?, ?> tc_qtde;

    @FXML
    private TableColumn<?, ?> tc_valor;

    @FXML
    private TableColumn<?, ?> tc_subtotal;

    @FXML
    private Button btn_adicionar;

    @FXML
    private Button btn_remover;

    @FXML
    private Label lb_total;

    @FXML
    private Label lb_cliente;
    
     @FXML
    private Label lb_fase;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
