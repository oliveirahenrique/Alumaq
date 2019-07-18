/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entidade.Funcionario;
import entidade.Usuario;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
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
            //System.out.println(usuario.getFuncionarioId().getIdFunc());
             if(!usuario.getSenha().equals(tf_senha.getText())){
                tf_senha=null;
                //mensagem de erro de senha
            }else{
                //Mainuser.setId(usuario.getId());
                //Main.user.setLogin(usuario.getLogin());
                //Main.user.setSenha(usuario.getSenha());
                Funcionario f; 
                f = (Funcionario)dao.pesquisarPorChave(Funcionario.class, usuario.getFuncionarioId().getIdFunc());
               // Main.user.setFuncionarioId(f);
                //Main.user.setCargoId(usuario.getCargoId());
               
                usuario.setFuncionarioId(f);
                 Main.addUser(usuario);
                //System.out.println(Main.user.getFuncionarioId().getNome());
                Main.changeScreen("index");
                
            }
        } catch (Exception e) {
            //mensagem de erro de login
        }       
        
    }

    @FXML
    void clica_sair(ActionEvent event) {
        dao.fechar();
        exit();
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