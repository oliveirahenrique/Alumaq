/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entidade.Cargo;
import entidade.Endereco;
import entidade.Funcionario;
import entidade.Usuario;
import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author rmachado
 */
public class EditarFuncionarioController implements Initializable {
    
    @FXML
    private TextField tf_loginUsuario; //not null
    
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
    private TextField tf_cargoId;
    
    @FXML
    void clica_salvar(ActionEvent event) throws ParseException {
        if (!this.tf_cargoId.toString().equals("")) {
            // atualizar cargo
            int novoCargoId = Integer.parseInt(this.tf_cargoId.toString());
            
            try {
                Usuario usuario = dao.getUsuario(this.tf_loginUsuario.toString());
                Cargo novoCargo = dao.pesquisarPorChave(Cargo.class, novoCargoId);
                usuario.setCargoId(novoCargo);
                dao.atualizar(usuario);
                System.out.println("Cargo atualizado com sucesso!");
            } catch (Exception e) {
                System.out.println("Erro: cargo inexistente ou usuário não encontrado no banco de dados. Usuário não atualizado! " + e);
            }
        }
        
        if (!this.tf_bairro.toString().equals("") || !this.tf_cidade.toString().equals("") || !this.tf_complemento.toString().equals("") || 
                !this.tf_estado.toString().equals("") || !this.tf_num.toString().equals("") || !this.tf_rua.toString().equals("")) {
            // atualizar endereço
            String bairro = this.tf_bairro.toString();
            String cidade = this.tf_cidade.toString();
            String complemento = this.tf_complemento.toString();
            String estado = this.tf_estado.toString();
            int numero = Integer.parseInt(this.tf_num.toString());
            String rua = this.tf_rua.toString();
            
            try {
                Usuario usuario = dao.getUsuario(this.tf_loginUsuario.toString());
                Funcionario funcionario = usuario.getFuncionarioId();
                Endereco endereco = funcionario.getEndereco();
                
                if (!bairro.equals("")) {
                    endereco.setBairro(bairro);
                }
                if (!cidade.equals("")) {
                    endereco.setCidade(cidade);
                }
                if (!complemento.equals("")) {
                    endereco.setComplemento(complemento);
                } else if (numero != endereco.getNumero()) {
                    //nesse caso, quer dizer que funcionário mudou para uma casa que não tem complemento
                    endereco.setComplemento(null);
                }
                if (!estado.equals("")) {
                    endereco.setEstado(estado);
                }
                if (!this.tf_num.equals("")) {
                    endereco.setNumero(numero);
                }
                if (!rua.equals("")) {
                    endereco.setRua(rua);
                }
                
                dao.atualizar(endereco);
                funcionario.setEndereco(endereco);
                dao.atualizar(funcionario);
                usuario.setFuncionarioId(funcionario);
                dao.atualizar(usuario);
                System.out.println("Endereço atualizado com sucesso!");
            } catch (Exception e) {
                System.out.println("Erro: endereço e usuário não atualizados! " + e);
            }
        }
        
        if (!this.tf_salario.toString().equals("")) {
            // atualizar salario
            Double salario = Double.parseDouble(this.tf_salario.toString());
            try {
                Usuario usuario = dao.getUsuario(this.tf_loginUsuario.toString());
                Funcionario funcionario = usuario.getFuncionarioId();
                
                funcionario.setSalario(salario);
                
                dao.atualizar(funcionario);
                usuario.setFuncionarioId(funcionario);
                dao.atualizar(usuario);
                System.out.println("Salário atualizado com sucesso!");
            } catch (Exception e) {
                System.out.println("Erro: salário e usuário não atualizados! " + e);
            }
        }
        
        if (!this.tf_tel1.toString().equals("") || !this.tf_tel2.toString().equals("")) {
            // atualizar telefone
            String telefone1 = this.tf_tel1.toString();
            String telefone2 = this.tf_tel2.toString();
            try {
                Usuario usuario = dao.getUsuario(this.tf_loginUsuario.toString());
                Funcionario funcionario = usuario.getFuncionarioId();
                
                if (!this.tf_tel1.toString().equals("")) {
                    funcionario.setTelefone1(telefone1);
                }
                if (!this.tf_tel2.toString().equals("")) {
                    funcionario.setTelefone2(telefone2);
                }
                
                dao.atualizar(funcionario);
                usuario.setFuncionarioId(funcionario);
                dao.atualizar(usuario);
                System.out.println("Telefone atualizado com sucesso!");
            } catch (Exception e) {
                System.out.println("Erro: telefone e usuário não atualizados! " + e);
            }
        }
    }
    
    @FXML
    void clica_cancela(ActionEvent event) {
        this.tf_bairro.setText("");
        this.tf_cargoId.setText("");
        this.tf_cidade.setText("");
        this.tf_complemento.setText("");
        this.tf_estado.setText("");
        this.tf_loginUsuario.setText("");
        this.tf_num.setText("");
        this.tf_rua.setText("");
        this.tf_salario.setText("");
        this.tf_tel1.setText("");
        this.tf_tel2.setText("");
    }
    
    public void excluir() {
        try {
            Usuario usuario = dao.getUsuario(this.tf_loginUsuario.toString());
            dao.remover(usuario);
            System.out.println("Usuário excluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: não foi possível remover o usuário! " + e);
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
