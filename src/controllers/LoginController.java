/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entidade.Usuario;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import telasFXML.Main;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class LoginController implements Initializable,Controller {

     @FXML
    private Button btn_login;

    @FXML
    private Button btn_sair;

    @FXML
    private TextField tf_usuario;

    @FXML
    private TextField tf_senha;
    
    @FXML
    void clica_login(ActionEvent event) {
        try {
            Usuario usuario = dao.getUsuario(tf_usuario.getText());
             if(!usuario.getSenha().equals(tf_senha.getText())){
                tf_senha=null;
                //mensagem de erro de senha
            }else{
                //prossegue pra página
                user.setId(usuario.getId());
                user.setLogin(usuario.getLogin());
                user.setSenha(usuario.getSenha());
                user.setFuncionarioId(usuario.getFuncionarioId());
                user.setCargoId(usuario.getCargoId());
                 System.out.println("id: "+user.getId()+"  Login:"+user.getLogin()+"  Senha:"+user.getSenha()+"  Funcionario ID:"+user.getFuncionarioId()+"  Cargo ID:"+user.getCargoId());
                Main.changeScreen("index");
            }
        } catch (Exception e) {
            //mensagem de erro de login
        }       
        
    }

    @FXML
    void clica_sair(ActionEvent event) {

    }
    /**
     * 
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
