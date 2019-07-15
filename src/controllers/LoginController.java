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

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class LoginController implements Initializable {

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
        
        Usuario usuario = dao.getUsuario(tf_usuario);
        
        if(usuario == null){
            tf_usuario= null;
            tf_senha= null;
            
            //mensagem de erro de usuario
        }else{
            if(!usuario.getSenha().equals(tf_senha.toString())){
                tf_senha=null;
                //mensagem de erro de senha
            }else{
                //prossegue pra página
            }
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
