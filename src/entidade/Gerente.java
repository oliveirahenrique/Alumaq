package entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import persistencia.DAO;

public class Gerente extends Funcionario implements BalconistaInterface {

    private List<CompraEquipamentos> compras;
    //private GerenciaEquipamentos gerencia;
    private ControladorEstoque controle = new ControladorEstoque();
<<<<<<< HEAD
    private List<Equipamento> equipamentos;
    
    public Gerente(String nome, String cpf, Date dataNascimento, Endereco endereco, String telefone1, String telefone2, Double salario) {
        super( nome,  cpf,  dataNascimento,  endereco,  telefone1,  telefone2, salario);
        compras = new ArrayList<>();
        
    }
    
    public void compraEquipamento(CompraEquipamentos compra,Equipamento e, int qtd){    
       compra.contactarFornecedor();
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
=======

    public Gerente(int id, String nome, String dataN, Endereco endereco, String tel, Double sal) {
        super(id, nome, dataN, endereco, tel, sal);
        compras = new ArrayList<>();

    }

    public void compraEquipamento(CompraEquipamentos compra, Equipamento e, int qtd) {

        Item item = new Item(e, qtd);

    }

    public void inserir(Equipamento e) {
        gerencia = new GerenciaEquipamentos();
        gerencia.insere(e, Setor.LOCACAO);

    }

    public void cunsutarEstoque(Equipamento e) {

        controle.checa(e);
    }

    public void excluir(Equipamento e) {
        gerencia = new GerenciaEquipamentos();

        gerencia.exclui(e, Setor.LOCACAO);

    }

    public void editar(Equipamento e) {
        gerencia = new GerenciaEquipamentos();

        gerencia.editar(e.getIdEq(), Setor.LOCACAO);

    }

    public List<Equipamento> consultar() {
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

>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8
    }
    
    public List<Equipamento> getEquipamentos() {
        //Query para consultar equipamentos de um setor
        DAO dao = new DAO();
        this.equipamentos = dao.getListEquipamentos();
        dao.fechar();

<<<<<<< HEAD
        return equipamentos;
=======
    @Override
    public void setItemVenda(Venda venda) {

>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8
    }
}
