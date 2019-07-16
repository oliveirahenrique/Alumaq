package controllers;

import entidade.Cargo;
import entidade.Endereco;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import entidade.Funcionario;
import entidade.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    private Button btn_cancelar;

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
    
    @FXML
    private TextField tf_complemento;
    
    @FXML
    private TextField tf_cpf;
    
    @FXML
    private TextField tf_login;
    
    @FXML
    private TextField tf_senha;
    
    @FXML
    private TextField tf_cargoId;

    @FXML
    void clica_salvar(ActionEvent event) throws ParseException {        
        // nome do funcionario
        String nome = this.tf_nome.toString();
        
        // data de nascimento do funcionario
        Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(this.tf_dataNasc.toString());
        
        // salario do funcionario
        Double salario = Double.parseDouble(this.tf_salario.toString());
        
        // telefone1 do funcionario
        String telefone1 = this.tf_tel1.toString();
        
        // telefone2 do funcionario
        String telefone2 = this.tf_tel2.toString();
        
        // cpf do funcionario
        String cpf = this.tf_cpf.toString();
        
        // endereço do funcionario
        String rua = this.tf_rua.toString();
        int numero = Integer.parseInt(this.tf_num.toString());
        String bairro = this.tf_bairro.toString();
        String cidade = this.tf_cidade.toString();
        String estado = this.tf_estado.toString();
        String complemento = this.tf_complemento.toString();
        Endereco endereco;
        if (complemento.equals("") || complemento.equals(" ")) {
            endereco = new Endereco(rua, bairro, null, numero, cidade, estado);
        } else {
            endereco = new Endereco(rua, bairro, complemento, numero, cidade, estado);
        }
        dao.cadastrar(endereco);
        
        // cadastra novo funcionario
        Funcionario funcionario = new Funcionario(nome, cpf, dataNascimento, endereco, telefone1, telefone2, salario);
        dao.cadastrar(funcionario);
        
        // cadastra novo usuario
        String login = this.tf_login.toString();
        String senha = this.tf_senha.toString();
        int cargoId = Integer.parseInt(this.tf_cargoId.toString());
        try {
            Cargo cargo = dao.pesquisarPorChave(Cargo.class, cargoId);
            Usuario usuario = new Usuario(login, senha, funcionario, cargo);
            dao.cadastrar(usuario);
            System.out.println("Usuário cadastrado com sucesso!");
        } catch (Exception e) {
            dao.remover(endereco);
            dao.remover(funcionario);
            System.out.println("Erro: cargo não encontrado no banco de dados. Usuário não cadastrado! " + e);
        }
    }

    @FXML
    void clica_cancela(ActionEvent event) {
        this.tf_bairro.setText("");
        this.tf_cargoId.setText("");
        this.tf_cidade.setText("");
        this.tf_complemento.setText("");
        this.tf_cpf.setText("");
        this.tf_dataNasc.setText("");
        this.tf_estado.setText("");
        this.tf_login.setText("");
        this.tf_nome.setText("");
        this.tf_num.setText("");
        this.tf_rua.setText("");
        this.tf_salario.setText("");
        this.tf_senha.setText("");
        this.tf_tel1.setText("");
        this.tf_tel2.setText("");
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
