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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Modality;
import javafx.stage.Stage;
import telasFXML.Main;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class IndexController implements Initializable, Controller {

    @FXML
    private Menu btn_MenuCliente;

    @FXML
    private MenuItem btn_novoCliente;

    @FXML
    private Menu btn_fornecedor;

    @FXML
    private MenuItem btn_cadastrarFornecedor;

    @FXML
    private Menu btn_equipamentos;

    @FXML
    private MenuItem btn_cadastrarEquipamento;

    @FXML
    private MenuItem btn_reserva;

    @FXML
    private Menu btn_contrato;

    @FXML
    private MenuItem btn_novoContrato;

    @FXML
    private Menu btn_pagamento;

    @FXML
    private MenuItem btn_novoPagamento;

    @FXML
    private Menu btn_pesquisa;

    @FXML
    private MenuItem btn_novaPesquisa;

    @FXML
    private Menu btn_funcionario;

    @FXML
    private MenuItem btn_cadastrarFuncionario;

    @FXML
    private MenuItem btn_devolucao;

    @FXML
    void clica_cadastrarEquipamento(ActionEvent event) {
        mudaTela("CadastrarEquipamento.fxml");
    }

    @FXML
    void clica_cadastrarFornecedor(ActionEvent event) {
        mudaTela("CadastrarFornecedor.fxml");
    }

    @FXML
    void clica_reserva(ActionEvent event) {
        mudaTela("Reserva.fxml");
    }

    @FXML
    void clica_novaPesquisa(ActionEvent event) {
        Main.changeScreen("");
    }

    @FXML
    void clica_novoCliente(ActionEvent event) {
         mudaTela("CadastrarCliente.fxml");
    }

    @FXML
    void clica_novoContrato(ActionEvent event) {
         mudaTela("Contrato.fxml");
    }

    @FXML
    void clica_novoPagamento(ActionEvent event) {
         mudaTela("Pagamento.fxml");
    }

    @FXML
    void clica_cadastrarFuncionario(ActionEvent event) {
        mudaTela("CadastrarFuncionario.fxml");
    }

    @FXML
    void clica_devolucao(ActionEvent event) {
       mudaTela("Devolucao.fxml");
    }
    
    public void mudaTela(String s){
        Region pagTela = null;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/telasFXML/"+s));

            pagTela = fxmlLoader.load();
            Scene pagScene = new Scene(pagTela);
            Stage stage2 = new Stage();
            stage2.setScene(pagScene);
            stage2.initModality(Modality.WINDOW_MODAL);
            stage2.show();

        } catch (Exception ex) {
            System.out.println(ex);
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
