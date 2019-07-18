/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entidade.ContratoOperacao;
import entidade.Fase;
import entidade.Locacao;
import entidade.Tipo;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javafx.scene.text.Text;
import org.eclipse.persistence.internal.helper.SimpleDatabaseType;
import telasFXML.Main;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class PagamentoController implements Initializable, Controller {

     @FXML
    private Button btn_cancela;

    @FXML
    private Button btn_salvar;

    @FXML
    private TextField tf_cliente;

    @FXML
    private TextField tf_funcionario;

    @FXML
    private TextField tf_dataInicio;

    @FXML
    private TextField tf_dataFim;

    @FXML
    private TextField tf_tipo;

    @FXML
    private TextField tf_valor;

    @FXML
    private TextField tf_multa;

    @FXML
    private TextField tf_fase;

    @FXML
    private TextField tf_valorTotal;

    @FXML
    void clica_cancelar(ActionEvent event) {

    }

    @FXML
    void clica_salvar(ActionEvent event) {

    }
    
    void realiza_pagamento(ActionEvent event) {
        //usara esses ifs da tela de contratoController para saber se eh contrato
        //ou locacao ou será diferente?
        //if (rb_venda.isSelected()){
        // TODO pegar objeto da venda e do contratoequipamento pra saber os dados da venda
        // 
        //
        //
        //
        //

        //} else if (rb_locacao.isSelected()){
        // TODO pegar objeto da locacao e do contrato equipamento pra saber os dados da locacao
        // TODO verificar se está na primeira ou segunda fase
        // TODO
        //}
    }

    public void preencheContrato(Integer i){
        ContratoOperacao contrato = new ContratoOperacao();
        System.out.println(i);
        contrato = dao.getContratoOperacao(i);
        System.out.println(contrato.getClienteId().getNome());
        String value = contrato.getClienteId().getNome();
        tf_cliente = new TextField(value);
        tf_cliente.setText("teste");
//
//        tl_funcionario.setText(contrato.getFuncionarioId().getNome());
//
//        tl_dataInicio.setText(contrato.getDataInicio().toString());
//
//        tl_dataFim.setText(contrato.getDataFim().toString());
//
//        String tipo;
//
//        if (contrato.getTipo() == Tipo.LOCACAO) {
//            tipo = "Locação";
//        } else {
//            tipo = "Venda";
//        }
//
//        tl_tipo.setText(tipo);
//        Double valorTotal;
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        if (contrato.getFase() == Fase.FASE1) {
//            tl_valorp1.setText(contrato.getValorp1().toString());
//            tl_multa.setText("0.0");
//            tl_fase.setText("Primeira Fase");
//            valorTotal = contrato.getValorp1();
//        } else {
//            tl_valorp1.setText(contrato.getValorp2().toString());
//            tl_multa.setText(contrato.getMulta().toString());
//            tl_fase.setText("Segunda Fase");
//            valorTotal = contrato.getMulta((Locacao) contrato,new Date());
//        }
//        
//        tl_valorTotal.setText(valorTotal.toString());
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        Main man = new Main();
//        preencheContrato(man.testeContrato());
    }

}
