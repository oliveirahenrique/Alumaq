package controllers;

import entidade.Contrato_Equipamento;
import entidade.Equipamento;
import entidade.Fase;
import entidade.Locacao;
import entidade.Setor;
import entidade.Tipo;
import entidade.Venda;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import javafx.stage.Modality;
import javafx.stage.Stage;
import telasFXML.Main;

public class ContratoController implements Initializable, Controller {

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
    void clica_add(ActionEvent event) throws IOException {
       Region addTela = null;
      try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/telasFXML/AddEquipamento.fxml"));
       
        addTela =  fxmlLoader.load();
        System.out.println("teste");
        Scene addEqScene = new Scene(addTela);
        System.out.println("teste2");
        Stage stage = new Stage();
        stage.setScene(addEqScene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.show();
        
    } catch (Exception ex) {
          System.out.println(ex);
    }
                
       
        
//        Parent addEq = FXMLLoader.load(getClass().getResource("AddEquipamento.fxml"));
//        stage2 = new Stage();
//        addEqScene = new Scene(addEq);
//           
//        stage2.setScene(addEqScene);
//        stage2.show();

    }

    @FXML
    void clica_remove(ActionEvent event) {

    }

    @FXML
    void clica_salvar(ActionEvent event) throws ParseException {
        //data de inicio da locação
        Date dataInicio;

        //data fim da locação
        Date dataFim;

        //primeira parcela
        Double valorp1;

        //segunda parcela
        Double valorp2;

        //armazena id do equipamento
        int equipamentoId;

        //armazena qtd de itens da locacao
        int qtdEquip;

        //armazena o valor da locacao
        Double valorEquip;

        if (rb_locacao.isSelected()) {
            dataInicio = new SimpleDateFormat("dd/MM/yyyy").parse(this.tf_dataInicio.getText());

            dataFim = new SimpleDateFormat("dd/MM/yyyy").parse(this.tf_dataFim.getText());

            valorp1 = Double.parseDouble(this.lb_total.getText()) / 2;

            valorp2 = Double.parseDouble(this.lb_total.getText()) / 2;

            try {
                //registrando locacao
                Locacao locacao = new Locacao(dataInicio, dataFim, valorp1, valorp2, Tipo.LOCACAO, Fase.FASE1, cliente, user.getFuncionarioId());
                dao.cadastrar(locacao);

                while ("PRECISA IMPLEMENTAR ESSA CONDIÇÃO") {
                    equipamentoId = Integer.parseInt(this.tc_item.getText());

                    qtdEquip = Integer.parseInt(this.tc_qtde.getText());

                    valorEquip = Double.parseDouble(this.tc_valor.getText());

                    //pesquisando equipamento utilizando o id 
                    Equipamento equipamento = (Equipamento) dao.pesquisarPorChave(Equipamento.class, equipamentoId);

                    //registrando contrato do equipamento
                    Contrato_Equipamento contratoEquip = new Contrato_Equipamento(locacao, equipamento, qtdEquip, valorEquip);
                    dao.cadastrar(contratoEquip);

                    //dando baixa da qtd do equipamento no estoque
                    equipamento.setQtd_estoque(equipamento.getQtd_estoque() - qtdEquip);
                    dao.atualizar(equipamento);
                }
            } catch (Exception e) {
                System.out.println("Erro ao iniciar contrato de locação");
                Main.changeScreen("index");
            }
        } else if (rb_venda.isSelected()) {
            dataInicio = new SimpleDateFormat("dd/MM/yyyy").parse(this.tf_dataInicio.getText());

            valorp1 = Double.parseDouble(this.lb_total.getText());

            try {
                //registrando venda
                Venda venda = new Venda(dataInicio, valorp1, Tipo.VENDA, Fase.FASE1, cliente, user.getFuncionarioId());
                dao.cadastrar(venda);

                while ("PRECISA IMPLEMENTAR ESSA CONDIÇÃO") {
                    equipamentoId = Integer.parseInt(this.tc_item.getText());

                    qtdEquip = Integer.parseInt(this.tc_qtde.getText());

                    valorEquip = Double.parseDouble(this.tc_valor.getText());

                    //pesquisando equipamento utilizando o id 
                    Equipamento equipamento = (Equipamento) dao.pesquisarPorChave(Equipamento.class, equipamentoId);

                    //registrando contrato do equipamento
                    Contrato_Equipamento contratoEquip = new Contrato_Equipamento(venda, equipamento, qtdEquip, valorEquip);
                    dao.cadastrar(contratoEquip);

                    //dando baixa da qtd do equipamento no estoque
                    equipamento.setQtd_estoque(equipamento.getQtd_estoque() - qtdEquip);
                    dao.atualizar(equipamento);
                }
            } catch (Exception e) {
                System.out.println("Erro ao iniciar contrato de venda");
                Main.changeScreen("index");
            }
        }
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
            rb_f2.setDisable(true);
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
    void clica_novaLocacao(ActionEvent event) {

    }

    @FXML
    void clica_novaVenda(ActionEvent event) {

    }

    ArrayList<Equipamento> equipamentos;

    public ContratoController() {

    }

    public ContratoController(ArrayList<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public String vender() {
        Double valor = 0.0;
        ArrayList<Equipamento> indisp = new ArrayList();
        String r = " ";
        for (Equipamento e : equipamentos) {
            if (e.getSetor().equals(Setor.VENDA) && e.isDisponivel()) {
                valor += e.getValor();
                e.setQtd_estoque(e.getQtd_estoque() - 1);
                if (e.getQtd_estoque() == 0) {
                    e.setDisponivel(false);
                }

                dao.atualizar(e);
            } else {
                indisp.add(e);
            }
        }
        // TODO registrar comissoes
        // TODO gerar contrato de venda
        // TODO encaminhar pagamento referente à venda ao setor de pagamento

        if (valor.equals(0.0)) {
            r = "Equipamentos não disponíveis. Venda não realizada.";
        } else if (!indisp.isEmpty()) {
            r = "Equipamentos ";
            for (Equipamento e : indisp) {
                r = r + e.getNome() + " (" + e.getIdEq() + ") ";
            }
            r = r + "não disponíveis. Valor da venda: R$" + valor;
        } else {
            r = "Venda realizada com sucesso! Valor: R$" + valor;
        }
        return r;
    }

    public String alugar() {
        Double valor = 0.0;
        ArrayList<Equipamento> indisp = new ArrayList();
        String r = " ";
        for (Equipamento e : equipamentos) {
            if (e.getSetor().equals(Setor.LOCACAO) && e.isDisponivel()) {
                valor += e.getValor();
                e.setQtd_estoque(e.getQtd_estoque() - 1);
                if (e.getQtd_estoque() == 0) {
                    e.setDisponivel(false);
                }

                dao.atualizar(e);
            } else {
                indisp.add(e);
            }
        }
        // TODO gerar contrato de locacao

        if (valor.equals(0.0)) {
            r = "Equipamentos não disponíveis. Locação não realizada.";
        } else if (!indisp.isEmpty()) {
            r = "Equipamentos ";
            for (Equipamento e : indisp) {
                r = r + e.getNome() + " (" + e.getIdEq() + ") ";
            }
            r = r + "não disponíveis. Valor da locação: R$" + valor;
        } else {
            r = "Locação realizada com sucesso! Valor: R$" + valor;
        }
        return r;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
