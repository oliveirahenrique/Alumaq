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
public class CadastrarFuncionarioController implements Initializable {
 @FXML
    private TextField tf_nome;

    @FXML
    private TextField tf_dataNasc;

    @FXML
    private TextField tf_salario;

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
    private TextField tf_cidade;

    @FXML
    private TextField tf_estado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
