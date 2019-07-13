/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class ContratoController implements Initializable {
    
    @FXML
    private RadioButton rb_f1;

    @FXML
    private RadioButton rb_f2;

    @FXML
    private RadioButton rb_fim;

    @FXML
    private Button btn_buscaFuncionario;

    @FXML
    private Button btn_buscaCliente;

    @FXML
    private RadioButton rb_venda;

    @FXML
    private Button btn_novaVenda;

    @FXML
    private RadioButton rb_locacao;

    @FXML
    private Button btn_novaLocacao;

    @FXML
    private Button btn_salvarContrato;

    @FXML
    void clicaLocacao(ActionEvent event) {

    }

    @FXML
    void clicaVenda(ActionEvent event) {

    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
