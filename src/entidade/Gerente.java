package entidade;

import java.util.ArrayList;
import java.util.List;
import persistencia.DAO;

public class Gerente extends Funcionario implements BalconistaInterface{
    private List<CompraEquipamentos> compras;
    //private GerenciaEquipamentos gerencia;
    private ControladorEstoque controle = new ControladorEstoque();
    private List<ContratoOperacao> contrato;
    private List<Equipamento> equipamentos;
    
    public Gerente(int id, String nome, String dataN, Endereco endereco, String tel, Double sal) {
//        super(id, nome,dataN, endereco, tel,sal);
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

    @Override
    public List<ContratoOperacao> getLocacoes() {
        DAO dao = new DAO();
        this.contrato = dao.getListLocacoes();
        dao.fechar();

        return contrato;
    }

    @Override
    public void setLocacao(Locacao loc) {
      
    }

    @Override
    public List<ContratoOperacao> getVendas() {
        DAO dao = new DAO();
        this.contrato = dao.getListVendas();
        dao.fechar();

        return contrato;
    }

    @Override
    public void setVenda(Venda venda) {
        
    }

    @Override
    public void iniciaNovaLocacao(Cliente c) {
      
    }

    @Override
    public void iniciaNovaVenda(Cliente c) {
      
    }

    @Override
    public void seguroLoc(Locacao loc, boolean seg) {
        
    }

    @Override
    public void finalizaLocacao(Locacao loc) {
        
    }

    @Override
    public void finalizaVenda(Venda venda) {
        
    }

    @Override
    public void setItemLocacao(Locacao loc) {
       
    }

    @Override
    public void setItemVenda(Venda venda) {
        
    }
}
