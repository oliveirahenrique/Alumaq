/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import entidade.Equipamento;
import entidade.Setor;
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
public class CadastrarEquipamentoController implements Initializable, Controller {
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
        this.ta_descricao.setText("");
        this.tf_nome.setText("");
        this.tf_qtde.setText("");
        this.tf_valor.setText("");
    }

    @FXML
    void clica_salvar(ActionEvent event) {
        String nome = this.tf_nome.getText();
        String descricao = this.ta_descricao.getText();
        Integer qtd = Integer.parseInt(this.tf_qtde.getText());
        Double valor = Double.parseDouble(this.tf_valor.getText());

        try {
            Equipamento equipamento = null;
            if (this.rb_locacao.isSelected()) {
                equipamento = new Equipamento(nome, descricao, true, qtd, valor, Setor.LOCACAO);
            } else if (this.rb_venda.isSelected()) {
                equipamento = new Equipamento(nome, descricao, true, qtd, valor, Setor.VENDA);
            }

            dao.cadastrar(equipamento);
            System.out.println("Equipamento cadasatrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: não foi possível cadastrar o equipamento! " + e);
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
