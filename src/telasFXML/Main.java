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
    private static Scene cadastroClienteScene;
    private static Scene cadastroFuncScene;
    private static Scene cadastroFornecedorScene;
    private static Scene cadastroEquipScene;
    private static Scene loginScene;
    private static Scene contratoScene;
    private static Scene reservaScene;
    private static Scene pagamentoScene;
    private static Scene devolucaoScene;
    
    
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
//        Parent cadastroCliente = FXMLLoader.load(getClass().getResource("CadastrarCliente.fxml"));
//        Parent cadastroEquipamento = FXMLLoader.load(getClass().getResource("CadastrarEquipamento.fxml"));
//        Parent cadastroFornecedor = FXMLLoader.load(getClass().getResource("CadastrarFornecedor.fxml"));
//        Parent cadastroFuncionario = FXMLLoader.load(getClass().getResource("CadastrarFuncionario.fxml"));
//        Parent reserva = FXMLLoader.load(getClass().getResource("ReservaEquipamento.fxml"));
//       
//        Parent contrato = FXMLLoader.load(getClass().getResource("Contrato.fxml"));
//        Parent devolucao = FXMLLoader.load(getClass().getResource("Devolucao.fxml"));
//        Parent pagamentoTela = FXMLLoader.load(getClass().getResource("Pagamento.fxml"));
       
        indexScene = new Scene(index);
        loginScene = new Scene(login);
//        cadastroClienteScene = new Scene(cadastroCliente);
//        cadastroFuncScene = new Scene(cadastroFuncionario);
//        cadastroEquipScene = new Scene(cadastroEquipamento);
//        cadastroFornecedorScene = new Scene(cadastroFornecedor);
//        contratoScene = new Scene(contrato);
//        reservaScene = new Scene(reserva);   
//        devolucaoScene = new Scene(devolucao);
//        //pagamentoScene = new Scene(pagamentoTela);
           
        //PagamentoController c= new PagamentoController(1);
        //stage.setScene(pagamentoScene);
        stage.setScene(indexScene);
        stage.show();
    }
    
     
    public static void changeScreen(String scr){
        switch(scr){
            case("index"):
               stage.setScene(indexScene);
                
            break;
            case("cadastroCliente"):
                stage.setScene(cadastroClienteScene);
            break;            
            case("reserva"):
                stage.setScene(reservaScene);
            break;
            case("contrato"):
                
                stage.setScene(contratoScene);
                System.out.println("teste"+user.getFuncionarioId().getNome());
            break;
            case("cadastroFornecedor"):
                stage.setScene(cadastroFornecedorScene);
            break;
            case("cadastroFuncionario"):
                stage.setScene(cadastroFuncScene);
            break;
            case("cadastroEquipamento"):
                stage.setScene(cadastroEquipScene);
            break;
            case("devolucao"):
                stage.setScene(devolucaoScene);
            break;
            
        }
            
    }

    
  
    public static void main(String[] args) {        
        launch(args);
    }
    
}