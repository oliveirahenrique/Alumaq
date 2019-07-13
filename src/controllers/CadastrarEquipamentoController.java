/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class CadastrarEquipamentoController implements Initializable {
  @FXML
    private TextArea ta_descricao;

    @FXML
    private TextField tf_nome;

    @FXML
    private RadioButton rb_venda;

    @FXML
    private RadioButton rb_locacao;

    @FXML
    private TextField tf_valor;

    @FXML
    private TextField tf_qtde;

    @FXML
    private Button btn_salvar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
