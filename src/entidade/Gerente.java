package entidade;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario implements BalconistaInterface{
    private List<CompraEquipamentos> compras;
    private GerenciaEquipamentos gerencia;
    private ControladorEstoque controle = new ControladorEstoque();
    
    public Gerente(int id, String nome, String dataN, Endereco endereco, String tel, Double sal) {
        super(id, nome,dataN, endereco, tel,sal);
        compras = new ArrayList<>();
        
    }
    
        
    
    public void compraEquipamento(CompraEquipamentos compra,Equipamento e, int qtd){
        
        Item item = new Item(e, qtd);        
       
    }
    
    
    public void inserir(Equipamento e){
        gerencia = new GerenciaEquipamentos();
        gerencia.insere(e, Setor.LOCACAO);
        
    }
    public void cunsutarEstoque( Equipamento e){
        
        controle.checa(e);
    }
    
    public void excluir(Equipamento e){
        gerencia = new GerenciaEquipamentos();
        
        gerencia.exclui(e, Setor.LOCACAO);
        
    }
    
    public void editar(Equipamento e){
        gerencia = new GerenciaEquipamentos();
        
        gerencia.editar(e.getIdEq(), Setor.LOCACAO);
        
    }
    
    public List<Equipamento> consultar () {
        gerencia = new GerenciaEquipamentos();
        gerencia.consultar(Setor.LOCACAO);
        return null;
    }

    @Override
    public List<Locacao> getLocacoes() {
        return null;
    }

    @Override
    public void setLocacao(Locacao loc) {
      
    }

    @Override
    public List<Venda> getVendas() {
     return null;
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
