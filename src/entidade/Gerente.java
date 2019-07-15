package entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import persistencia.DAO;

public class Gerente extends Funcionario implements BalconistaInterface{
    private List<CompraEquipamentos> compras;
    //private GerenciaEquipamentos gerencia;
    private ControladorEstoque controle = new ControladorEstoque();
    private List<Equipamento> equipamentos;
    
    public Gerente(String nome, String cpf, Date dataNascimento, Endereco endereco, String telefone1, String telefone2, Double salario) {
        super( nome,  cpf,  dataNascimento,  endereco,  telefone1,  telefone2, salario);
        compras = new ArrayList<>();
        
    }
    
    public void compraEquipamento(CompraEquipamentos compra,Equipamento e, int qtd){
        
        Item item = new Item(e, qtd);        
       
    }
    
    public void cunsutarEstoque( Equipamento e){
        
        controle.checa(e);
    }
    
    public void inserir(Equipamento equipamento, Setor setor) {
        //Query para inserir Equipamento no banco de dados
        equipamento.setSetor(setor);
        DAO dao = new DAO();
        dao.cadastrar(equipamento);
        dao.fechar();
    }
    
    public void excluir(Equipamento equipamento, Setor setor) {
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
