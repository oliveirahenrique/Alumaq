/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entidade.ContratoOperacao;
import entidade.Fase;
import entidade.Funcionario;
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
import org.eclipse.persistence.internal.helper.SimpleDatabaseType;
import telasFXML.Main;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class PagamentoController implements Initializable, Controller {

    private Integer contratoId;

   
     @FXML
    private Button btn_cancela;

    @FXML
    private Button btn_salvar;

    @FXML
    private Label tl_cliente;

    @FXML
    private Label tl_funcionario;

    @FXML
    private Label tl_dataInicio;

    @FXML
    private Label tl_dataFim;

    @FXML
    private Label tl_tipo;

    @FXML
    private Label tl_valorp1;

    @FXML
    private Label tl_multa;

    @FXML
    private Label tl_fase;    
    
    @FXML
    private Label tl_valorTotal;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ContratoOperacao contrato = new ContratoOperacao();
        contrato = (ContratoOperacao) dao.pesquisarPorChave(ContratoOperacao.class, Main.id);

        tl_cliente.setText(contrato.getClienteId().getNome());
        tl_funcionario.setText(contrato.getFuncionarioId().getNome());

        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
       tl_dataInicio.setText(sdf.format(contrato.getDataInicio()));

      

        String tipo;

        if (contrato.getTipo() == Tipo.LOCACAO) {
            tipo = "Locação";
             tl_dataFim.setText(sdf.format(contrato.getDataFim()));
        } else {
            tipo = "Venda";
            tl_dataFim.setText("--/--/----");
        }

        tl_tipo.setText(tipo);
        Double valorTotal;
        
        if (contrato.getFase() == Fase.FASE1) {
            tl_valorp1.setText(contrato.getValorp1().toString());
            tl_multa.setText("0.0");
            tl_fase.setText("Primeira Fase");
            valorTotal = contrato.getValorp1();
        } else {
            tl_valorp1.setText(contrato.getValorp2().toString());
            tl_multa.setText(contrato.getMulta().toString());
            tl_fase.setText("Segunda Fase");
            valorTotal = contrato.getMulta((Locacao) contrato,new Date());
        }
        
        tl_valorTotal.setText(valorTotal.toString());

    }

}
