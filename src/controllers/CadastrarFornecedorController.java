/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class CadastrarFornecedorController implements Initializable {
  @FXML
    private TextField tf_nome;

    @FXML
    private Button btn_salvar;

    @FXML
    private TextField tf_tel;

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
    private TextField tf_email;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
