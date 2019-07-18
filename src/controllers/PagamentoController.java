/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class PagamentoController implements Initializable, Controller {

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
    private RadioButton rb_locacao;

     @FXML
    private TextField tf_dataInicio;

     @FXML
    private TextField tf_dataFim;

     @FXML
    private CheckBox box_aceito;

     @FXML
    private RadioButton rb_venda;

     @FXML
    private Button btn_salvarContrato;

     @FXML
    private Label lb_total;

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

     void realiza_pagamento(ActionEvent event){
        //usara esses ifs da tela de contratoController para saber se eh contrato
        //ou locacao ou será diferente?
        if (rb_venda.isSelected()){
            // TODO pegar objeto da venda e do contratoequipamento pra saber os dados da venda
            // 
            //
            //
            //
            //

         } else if (rb_locacao.isSelected()){
            // TODO pegar objeto da locacao e do contrato equipamento pra saber os dados da locacao
            // TODO verificar se está na primeira ou segunda fase
            // TODO
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
