/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entidade.Cliente;
import entidade.Equipamento;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import persistencia.DAO;

public class AddClienteController implements Initializable {

    
    @FXML
    private TableView<Cliente> tv_clientes;

    @FXML
    private TableColumn<Cliente, String> tc_id;

    @FXML
    private TableColumn<Cliente, String> tc_nome;

    @FXML
    private Button btn_seleciona;

    @FXML
    void clica_seleciona(ActionEvent event) {

    }   
     public void initialize(URL url, ResourceBundle rb) {
        carregarEquipamentos();
        
        //tv_equipamentos.getSelectionModel().selectedItemProperty().addListener(
               // (observable, oldValue, newValue) -> selecionarItemTableViewEquipamentos(newValue));
        
    }
    
    DAO dao = new DAO();
    private List<Cliente> clientes = new ArrayList<>();
    private ObservableList<Cliente> obsClientes;

    public void carregarEquipamentos() {

        tc_nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tc_id.setCellValueFactory(new PropertyValueFactory<>("idCliente"));

        clientes = dao.getListClientes();

        obsClientes = FXCollections.observableArrayList(clientes);

        tv_clientes.setItems(obsClientes);
    }

    public void selecionarItemTableViewEquipamentos(Cliente c) {
        if (c != null) {
           
            
        } 
    }   
    
}
