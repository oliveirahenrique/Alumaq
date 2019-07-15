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
import javafx.event.ActionEvent;
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
    
     @FXML
    private Button btn_cancelar;
    
    
     @FXML
    void clicaLocacao(ActionEvent event) {
        if(rb_locacao.isSelected())
             rb_venda.setDisable(true);            
        else
            rb_venda.setDisable(false);
    }

    @FXML
    void clicaVenda(ActionEvent event) {
        if(rb_venda.isSelected())
             rb_locacao.setDisable(true);            
        else
            rb_locacao.setDisable(false);

    }
    
   

    @FXML
    void clica_cancela(ActionEvent event) {

    }

    @FXML
    void clica_salvar(ActionEvent event) {

    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
