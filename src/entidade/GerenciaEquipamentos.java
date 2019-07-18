package entidade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import persistencia.DAO;

public class GerenciaEquipamentos {

    private ControladorEstoque controle = new ControladorEstoque();
<<<<<<< HEAD
    private List<Equipamento> equipamentos;

    public void insere(Equipamento equipamento, Setor setor) {
        //Query para inserir Equipamento no banco de dados
        equipamento.setSetor(setor);
        DAO dao = new DAO();
        dao.cadastrar(equipamento);
        dao.fechar();
    }

    public void exclui(Equipamento equipamento, Setor setor) {
        if (equipamento.getSetor().equals(setor)) {
            DAO dao = new DAO();
            dao.remover(equipamento);
            dao.fechar();
        }
    }

    public void editar(Equipamento equipamento, Setor setor) {
        equipamento.setSetor(setor);
        DAO dao = new DAO();
        dao.atualizar(equipamento);
        dao.fechar();
    }

    public List<Equipamento> getEquipamentos() {
=======
    private Equipamento equipamento;

    public boolean insere(Equipamento equipamento, Setor setor) {
        boolean equipamentoInserido = false;
        //Query para inserir Equipamento no banco de dados

        return equipamentoInserido;
    }

    public void exclui(Equipamento equipamento, Setor setor) {
        //Query para excluir equipamento do banco de dados
        try {
            // create the mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/test";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // create the mysql delete statement.
            // i'm deleting the row where the id is "3", which corresponds to my
            // "Barney Rubble" record.
            String query = "delete from users where id = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, 3);

            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public void editar(int id, Setor setor) {
        //Query para editar um equipamento no banco de dados
        try {
            // create a java mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/test";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // create the java mysql update preparedstatement
            String query = "update users set num_points = ? where first_name = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, 6000);
            preparedStmt.setString(2, "Fred");

            // execute the java preparedstatement
            preparedStmt.executeUpdate();

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public List<Equipamento> consultar(Setor setor) {
>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8
        //Query para consultar equipamentos de um setor
        DAO dao = new DAO();
        this.equipamentos = dao.getListEquipamentos();
        dao.fechar();

        return equipamentos;
    }
}
