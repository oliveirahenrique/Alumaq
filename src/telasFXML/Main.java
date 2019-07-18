package telasFXML;


import controllers.PagamentoController;
import entidade.Usuario;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import persistencia.DAO;

public class Main extends Application {
    
    private static Stage stage;
    
    private static Scene indexScene;
    private static Scene loginScene;

    
    
    public static  Usuario user = new Usuario();
    public static Integer id;
    
    public static void addUser(Usuario u){
        Main.user = u;
    }
    
    public static void setAllId(Integer id){
       Main.id = id; 
    }
    
    protected static DAO dao = new DAO();      
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        stage = primaryStage;
        
        Parent index = FXMLLoader.load(getClass().getResource("Index.fxml"));
        Parent login = FXMLLoader.load(getClass().getResource("Login.fxml"));

        indexScene = new Scene(index);
        loginScene = new Scene(login);

        stage.setScene(loginScene);
        stage.show();
    }
    
     
    public static void changeScreen(String scr){
        switch(scr){
            case("index"):
               stage.setScene(indexScene);
                
            break;
           
            
        }
            
    }

    
  
    public static void main(String[] args) {        
        launch(args);
    }
    
}