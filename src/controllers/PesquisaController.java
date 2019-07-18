/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entidade.Cliente;
import entidade.ContratoOperacao;
import entidade.Equipamento;
import entidade.Fornecedor;
import entidade.Funcionario;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class PesquisaController implements Initializable, Controller {
    
    ObservableList<String> opcoesList = FXCollections.observableArrayList("Clientes", "Equipamentos", "Fornecedores", "Funcionários", "Contratos");
    
    @FXML
    private ChoiceBox cb_opcoes;
    
    @FXML
    private TableView tv_table;
    
    @FXML
    private TableColumn tc_c1;
    
    @FXML
    private TableColumn tc_c2;
    
    @FXML
    private TableColumn tc_c3;
    
    @FXML
    private TableColumn tc_c4;
    
    @FXML
    private Button btn_selecionar;
    
    @FXML
    private Button btn_pesquisar;
    
    @FXML
    void clica_selecionar (ActionEvent event) {
        
    }
    
    @FXML
    void clica_pesquisar (ActionEvent event) {
        if (this.cb_opcoes.getValue().equals("Clientes")) {
            this.tc_c1.setText("ID");
            this.tc_c2.setText("Nome");
            this.tc_c3.setText("Telefone");
            this.tc_c4.setText("Email");

            tc_c1.setCellValueFactory(new PropertyValueFactory<>("idCliente"));
            tc_c2.setCellValueFactory(new PropertyValueFactory<>("nome"));
            tc_c3.setCellValueFactory(new PropertyValueFactory<>("telefone1"));
            tc_c4.setCellValueFactory(new PropertyValueFactory<>("email"));
            
            List clientes = dao.getListClientes();
            ObservableList<Cliente> obsClientes;

            obsClientes = FXCollections.observableArrayList(clientes);

            tv_table.setItems(obsClientes);
        } else if (this.cb_opcoes.getValue().equals("Equipamentos")) {
            this.tc_c1.setText("ID");
            this.tc_c2.setText("Nome");
            this.tc_c3.setText("Quantidade");
            this.tc_c4.setText("Setor");
            
            tc_c1.setCellValueFactory(new PropertyValueFactory<>("idEq"));
            tc_c2.setCellValueFactory(new PropertyValueFactory<>("nome"));
            tc_c3.setCellValueFactory(new PropertyValueFactory<>("qtd_estoque"));
            tc_c4.setCellValueFactory(new PropertyValueFactory<>("setor"));
            
            List equipamentos = dao.getListEquipamentos();
            ObservableList<Equipamento> obsEquipamentos;

            obsEquipamentos = FXCollections.observableArrayList(equipamentos);

            tv_table.setItems(obsEquipamentos);
        } else if (this.cb_opcoes.getValue().equals("Fornecedores")) {
            this.tc_c1.setText("ID");
            this.tc_c2.setText("Nome");
            this.tc_c3.setText("Endereço");
            this.tc_c4.setText("Email");
            
            tc_c1.setCellValueFactory(new PropertyValueFactory<>("IDFORNECEDOR"));
            tc_c2.setCellValueFactory(new PropertyValueFactory<>("nome"));
            tc_c3.setCellValueFactory(new PropertyValueFactory<>("endereco"));
            tc_c4.setCellValueFactory(new PropertyValueFactory<>("email"));
            
            List fornecedores = dao.getListFornecedores();
            ObservableList<Fornecedor> obsFornecedores;

            obsFornecedores = FXCollections.observableArrayList(fornecedores);

            tv_table.setItems(obsFornecedores);
        } else if (this.cb_opcoes.getValue().equals("Funcionários")) {
            this.tc_c1.setText("ID");
            this.tc_c2.setText("Nome");
            this.tc_c3.setText("Telefone");
            this.tc_c4.setText("Salário");
            
            tc_c1.setCellValueFactory(new PropertyValueFactory<>("idFunc"));
            tc_c2.setCellValueFactory(new PropertyValueFactory<>("nome"));
            tc_c3.setCellValueFactory(new PropertyValueFactory<>("telefone1"));
            tc_c4.setCellValueFactory(new PropertyValueFactory<>("salario"));
            
            List funcionarios = dao.getListFuncionarios();
            ObservableList<Funcionario> obsFuncionarios;

            obsFuncionarios = FXCollections.observableArrayList(funcionarios);

            tv_table.setItems(obsFuncionarios);
        } else if (this.cb_opcoes.getValue().equals("Contratos")) {
            this.tc_c1.setText("ID");
            this.tc_c2.setText("Data Início");
            this.tc_c3.setText("Data Fim");
            this.tc_c4.setText("Tipo");
            
            tc_c1.setCellValueFactory(new PropertyValueFactory<>("idContrato"));
            tc_c2.setCellValueFactory(new PropertyValueFactory<>("dataInicio"));
            tc_c3.setCellValueFactory(new PropertyValueFactory<>("dataFim"));
            tc_c4.setCellValueFactory(new PropertyValueFactory<>("tipo"));
            
            List contratos = dao.getListContratos();
            ObservableList<ContratoOperacao> obsContratos;

            obsContratos = FXCollections.observableArrayList(contratos);

            tv_table.setItems(obsContratos);
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cb_opcoes.setItems(opcoesList);
        this.cb_opcoes.setValue("Clientes");
    }    
    
}
