package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class LocacaoController implements Initializable {
    
    @FXML
    private TableView<?> tv_itens;

    @FXML
    private TableColumn<?, ?> tc_item;

    @FXML
    private TableColumn<?, ?> tc_qtde;

    @FXML
    private TableColumn<?, ?> tc_valor;

    @FXML
    private TableColumn<?, ?> tc_subtotal;

    @FXML
    private Button btn_adicionar;

    @FXML
    private Button btn_remover;

    @FXML
    private Label lb_cliente;

    @FXML
    private Label lb_funcionario;

    @FXML
    private TextField tf_dataInicio;

    @FXML
    private TextField tf_dataFim;

    @FXML
    private Label lb_fase;

    @FXML
    private Button btn_concluir;

    @FXML
    private Label lb_total;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
