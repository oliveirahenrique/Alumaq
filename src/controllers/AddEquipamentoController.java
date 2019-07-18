package controllers;

import entidade.Cliente;
import entidade.Equipamento;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import persistencia.DAO;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class AddEquipamentoController implements Initializable {

    @FXML
    private TableView<Equipamento> tv_equipamentos;

    @FXML
    private TableColumn<Equipamento, Integer> tc_id;

    @FXML
    private TableColumn<Equipamento, String> tc_nome;

    @FXML
    private TableColumn<Equipamento, Double> tc_valor;

    @FXML
    private TableColumn<Equipamento, Integer> tc_qtdEstoque;

    @FXML
    private TextField tf_qtd;

    @FXML
    private javafx.scene.control.Button btn_seleciona;


    Integer eqSelect;

    public AddEquipamentoController() {
       
    }
    @FXML
    void clica_seleciona(ActionEvent event) {
        ContratoController.idEquipamento(eqSelect);
        Stage stage = (Stage) btn_seleciona.getScene().getWindow(); //Obtendo a janela atual
        stage.close(); //Fechando o Stage
    
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarEquipamentos();

        tv_equipamentos.getSelectionModel().selectedItemProperty().addListener(
         (observable, oldValue, newValue) -> selecionarItemTableViewEquipamentos(newValue));
    }

    DAO dao = new DAO();
    private List<Equipamento> equipamentos = new ArrayList<>();
    private ObservableList<Equipamento> obsEquipamentos;

    public void carregarEquipamentos() {

        tc_nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tc_valor.setCellValueFactory(new PropertyValueFactory<>("valor"));
        tc_qtdEstoque.setCellValueFactory(new PropertyValueFactory<>("qtd_estoque"));
        tc_id.setCellValueFactory(new PropertyValueFactory<>("idEq"));

        equipamentos = dao.getListEquipamentos();

        obsEquipamentos = FXCollections.observableArrayList(equipamentos);

        tv_equipamentos.setItems(obsEquipamentos);
    }

    public void selecionarItemTableViewEquipamentos(Equipamento eq) {
        if (eq != null) {
               eqSelect =  eq.getIdEq();
        }
        
    }
}
