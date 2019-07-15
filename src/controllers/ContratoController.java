package controllers;

import entidade.Equipamento;
import entidade.Setor;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import persistencia.DAO;

public class ContratoController implements Initializable  {

     @FXML
    private RadioButton rb_f1;

    @FXML
    private RadioButton rb_f2;

    @FXML
    private RadioButton rb_fim;

    @FXML
    private Button btn_buscaFuncionario;

    @FXML
    private Button btn_buscaCliente;

    @FXML
    private RadioButton rb_locacao;

    @FXML
    private TextField tf_dataInicio;

    @FXML
    private TextField tf_dataFim;

    @FXML
    private CheckBox box_aceito;

    @FXML
    private RadioButton rb_venda;

    @FXML
    private Button btn_salvarContrato;

    @FXML
    private Label lb_total;

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
    void clica_add(ActionEvent event) {

    }

    @FXML
    void clica_remove(ActionEvent event) {

    }

    @FXML
    void clica_salvar(ActionEvent event) {

    }
    @FXML
    void clicaLocacao(ActionEvent event) {
        if (rb_locacao.isSelected()) {
            rb_venda.setDisable(true);
            
        } else {
            rb_venda.setDisable(false);
            
        }

    }

    @FXML
    void clicaVenda(ActionEvent event) {
        if (rb_venda.isSelected()) {
            rb_locacao.setDisable(true);
            
        } else {
            rb_locacao.setDisable(false);
           
        }
    }

    @FXML
    void clica_f1(ActionEvent event) {
        if (rb_f1.isSelected()) {
            rb_f2.setDisable(true);
            rb_fim.setDisable(true);

        } else {
            rb_f2.setDisable(false);
            rb_fim.setDisable(false);
        }
    }

    @FXML
    void clica_f2(ActionEvent event) {
        if (rb_f2.isSelected()) {
            rb_f1.setDisable(true);
            rb_fim.setDisable(true);

        } else {
            rb_f1.setDisable(false);
            rb_fim.setDisable(false);
        }
    }

    @FXML
    void clica_fim(ActionEvent event) {
        if (rb_fim.isSelected()) {
            rb_f2.setDisable(true);
            rb_f1.setDisable(true);

        } else {
            rb_f2.setDisable(false);
            rb_f1.setDisable(false);
        }
    }

    @FXML
    void clica_nocaLocacao(ActionEvent event) {

    }

    @FXML
    void clica_novaVenda(ActionEvent event) {

    }

      
    ArrayList<Equipamento> equipamentos;

    
    public ContratoController(){
        
    }
    
    public ContratoController(ArrayList<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }
    
    public String vender() {
        Double valor = 0.0;
        ArrayList<Equipamento> indisp = new ArrayList(); 
        String r = " ";
        DAO dao = new DAO();
        for (Equipamento e : equipamentos) {
            if (e.getSetor().equals(Setor.VENDA) && e.isDisponivel()) {
                valor += e.getValor();
                e.setQtd_estoque(e.getQtd_estoque()-1);
                if (e.getQtd_estoque() == 0)
                    e.setDisponivel(false);
                
                dao.atualizar(e);
            } else {
                indisp.add(e);
            }
        }
        // TODO registrar comissoes
        // TODO gerar contrato de venda
        // TODO encaminhar pagamento referente à venda ao setor de pagamento
        dao.fechar();
        
        if (valor.equals(0.0)) {
            r = "Equipamentos não disponíveis. Venda não realizada.";
        } else if (!indisp.isEmpty()) {
            r = "Equipamentos ";
            for (Equipamento e : indisp) {
                r = r + e.getNome() + " (" + e.getIdEq() + ") ";
            }
            r = r + "não disponíveis. Valor da venda: R$"+valor;
        } else {
            r = "Venda realizada com sucesso! Valor: R$"+valor;
        }
        return r;
    }

     public String alugar() {
        Double valor = 0.0;
        ArrayList<Equipamento> indisp = new ArrayList(); 
        String r = " ";
        DAO dao = new DAO();
        for (Equipamento e : equipamentos) {
            if (e.getSetor().equals(Setor.LOCACAO) && e.isDisponivel()) {
                valor += e.getValor();
                e.setQtd_estoque(e.getQtd_estoque()-1);
                if (e.getQtd_estoque() == 0)
                    e.setDisponivel(false);
                
                dao.atualizar(e);
            } else {
                indisp.add(e);
            }
        }
        // TODO gerar contrato de locacao
        dao.fechar();
        
        if (valor.equals(0.0)) {
            r = "Equipamentos não disponíveis. Locação não realizada.";
        } else if (!indisp.isEmpty()) {
            r = "Equipamentos ";
            for (Equipamento e : indisp) {
                r = r + e.getNome() + " (" + e.getIdEq() + ") ";
            }
            r = r + "não disponíveis. Valor da locação: R$"+valor;
        } else {
            r = "Locação realizada com sucesso! Valor: R$"+valor;
        }
        return r;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

 
}
