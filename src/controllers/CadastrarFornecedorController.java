/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entidade.Endereco;
import entidade.Fornecedor;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.stage.Modality;
import telasFXML.Main;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class CadastrarFornecedorController implements Initializable, Controller {

    @FXML
    private TextField tf_nome;

    @FXML
    private TextField tf_email;

    @FXML
    private TextField tf_tel;

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
    private Button btn_cancelar;

    @FXML
    private Button btn_salvar;

    @FXML
    void clica_cancela(ActionEvent event) {
        tf_nome.setText("");
        tf_tel.setText("");
        tf_rua.setText("");
        tf_num.setText("");
        tf_bairro.setText("");
        tf_complemento.setText("");
        tf_cidade.setText("");
        tf_estado.setText("");
        tf_email.setText("");

    }

    @FXML
    void clica_salvar(ActionEvent event) {
        try {
            Endereco endereco = new Endereco(tf_rua.getText(), tf_bairro.getText(), null, Integer.parseInt(tf_num.getText()), tf_cidade.getText(), tf_estado.getText());
            dao.cadastrar(endereco);
            try {
                Fornecedor fornecedor = new Fornecedor(tf_nome.getText(), tf_email.getText(), endereco);
                dao.cadastrar(fornecedor);
                Main.changeScreen("index");

            } catch (Exception e) {
                dao.remover(endereco);
                System.out.println("Erro ao Cadastrar Fornecedor");
            }
        } catch (Exception e) {
            System.out.println("Erro ao Cadastrar Fornecedor");
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
