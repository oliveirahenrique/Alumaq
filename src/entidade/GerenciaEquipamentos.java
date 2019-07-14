package entidade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import persistencia.DAO;

public class GerenciaEquipamentos {

    private ControladorEstoque controle = new ControladorEstoque();
    private Equipamento equipamento;

    public boolean insere(Equipamento equipamento, Setor setor) {
        boolean equipamentoInserido = false;
        //Query para inserir Equipamento no banco de dados

        return equipamentoInserido;
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

    public void consultarEquipamentos() {
        //Query para consultar equipamentos de um setor
        DAO dao = new DAO();
        dao.getListEquipamentos();
        dao.fechar();
    }
}
