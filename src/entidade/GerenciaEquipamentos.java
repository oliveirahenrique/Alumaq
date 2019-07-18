package entidade;

import java.util.List;
import persistencia.DAO;

public class GerenciaEquipamentos {

    private ControladorEstoque controle = new ControladorEstoque();
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
        //Query para consultar equipamentos de um setor
        DAO dao = new DAO();
        this.equipamentos = dao.getListEquipamentos();
        dao.fechar();

        return equipamentos;
    }
}
