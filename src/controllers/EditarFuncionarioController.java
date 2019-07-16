/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author rmachado
 */
public class EditarFuncionarioController implements Initializable {
    
    @FXML
    private TextField tf_nome; //not null
    
    @FXML
    private TextField tf_salario;

    @FXML
    private Button btn_salvar;

    @FXML
    private Button btn_cancelar;

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
    private TextField tf_cidade;

    @FXML
    private TextField tf_estado;
    
    @FXML
    private TextField tf_complemento;
    
    @FXML
    private TextField tf_cargoId;
    
    @FXML
    void clica_salvar(ActionEvent event) throws ParseException {
        if (!this.tf_cargoId.toString().equals("")) {
            // TODO atualizar cargo
        }
        
        if (!this.tf_bairro.toString().equals("") || !this.tf_cidade.toString().equals("") || !this.tf_complemento.toString().equals("") || 
                !this.tf_estado.toString().equals("") || !this.tf_num.toString().equals("") || !this.tf_rua.toString().equals("")) {
            // TODO atualizar endereço
        }
        
        if (!this.tf_salario.toString().equals("")) {
            // TODO atualizar salario
        }
        
        if (!this.tf_tel1.toString().equals("")) {
            // TODO atualizar telefone1
        }
        
        if (!this.tf_tel2.toString().equals("")) {
            // TODO atualizar telefone2
        }
    }
    
    @FXML
    void clica_cancela(ActionEvent event) {
        this.tf_bairro.setText("");
        this.tf_cargoId.setText("");
        this.tf_cidade.setText("");
        this.tf_complemento.setText("");
        this.tf_estado.setText("");
        this.tf_nome.setText("");
        this.tf_num.setText("");
        this.tf_rua.setText("");
        this.tf_salario.setText("");
        this.tf_tel1.setText("");
        this.tf_tel2.setText("");
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
