/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class ReservaEquipamentoController implements Initializable {

    @FXML
    private Button btn_buscaCliente;

    @FXML
    private TableView<?> tv_itens;

    @FXML
    private TableColumn<?, ?> tc_item;

    @FXML
    private TableColumn<?, ?> tc_qtde;

    @FXML
    private Button btn_adicionar;

    @FXML
    private Button btn_remover;

    @FXML
    private Button btn_concluir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
