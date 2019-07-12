package entidade;

import java.util.List;

public class GerenciaEquipamentos {
    private ControladorEstoque controle = new ControladorEstoque();
    private Equipamento equipamento;
    
    public boolean insere (Equipamento equipamento, Setor setor) {
        boolean equipamentoInserido= false;
        //Query para inserir Equipamento no banco de dados
        
         return equipamentoInserido;
    }
    
    public void exclui (Equipamento equipamento, Setor setor) {
        //Query para excluir equipamento do banco de dados
    }
    
    public void editar (int id, Setor setor) {
        //Query para editar um equipamento no banco de dados
    }
    
    public List<Equipamento> consultar (Setor setor) {
        //Query para consultar equipamentos de um setor
        return null;
    }
}

