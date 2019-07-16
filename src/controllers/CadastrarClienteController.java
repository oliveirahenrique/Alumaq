/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.Controller.dao;
import entidade.Cliente;
import entidade.Endereco;
import entidade.Fornecedor;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import telasFXML.Main;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class CadastrarClienteController implements Initializable, Controller {

    @FXML
    private TextField tf_nome;

    @FXML
    private TextField tf_cpf;

    @FXML
    private TextField tf_sexo;

    @FXML
    private TextField tf_dataNascimento;

    @FXML
    private Button btn_salvar;

    @FXML
    private TextField tf_tel1;

    @FXML
    private TextField tf_tel2;

    @FXML
    private TextField tf_rua;

    @FXML
    private TextField tf_num;

    @FXML
    private TextField tf_bairro;

    @FXML
    private TextField tf_complemento;

    @FXML
    private TextField tf_cidade;

    @FXML
    private TextField tf_estado;

    @FXML
    private TextField tf_email;

    @FXML
    private Button btn_cancelar;

    @FXML
    void clica_cancela(ActionEvent event) {
        tf_nome.setText("");
        tf_tel1.setText("");
        tf_tel2.setText("");
        tf_dataNascimento.setText("");
        tf_cpf.setText("");
        tf_rua.setText("");
        tf_num.setText("");
        tf_bairro.setText("");
        tf_complemento.setText("");
        tf_cidade.setText("");
        tf_estado.setText("");
        tf_email.setText("");

        Main.changeScreen("index");
    }

    @FXML
    void clica_salvar(ActionEvent event) {
        try {
            Endereco endereco = new Endereco(tf_rua.getText(), tf_bairro.getText(), tf_complemento.getText(), Integer.parseInt(tf_num.getText()), tf_cidade.getText(), tf_estado.getText());
            dao.cadastrar(endereco);
            try {
                Date data = new SimpleDateFormat("dd/MM/yyyy").parse(this.tf_dataNascimento.getText());
                
                Cliente cliente = new Cliente(  tf_nome.getText(), tf_sexo.getText(), 
                                                data, tf_cpf.getText(), tf_tel1.getText(), tf_tel2.getText(), 
                                                endereco, tf_email.getText());
                dao.cadastrar(cliente);
                Main.changeScreen("index");

            } catch (Exception e) {
                dao.remover(endereco);

            }
        } catch (Exception e) {
        }
        System.out.println("Erro ao Cadastrar Fornecedor");

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
