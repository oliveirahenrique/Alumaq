package entidade;

import java.util.ArrayList;
import java.util.List;
import persistencia.DAO;

public class Loja {

<<<<<<< HEAD
    private List<Funcionario> funcionarios;
    private List<ContratoOperacao> contrato;

    public Loja() {
=======
    private String nome;
    private Endereco endereco;
    private List<Funcionario> funcionarios;
    private List<Contrato> contratos;
    private int cnpj;

    public Loja() {
        funcionarios = new ArrayList<>();
>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8
    }

    public List<Funcionario> getFuncionarios() {
        DAO dao = new DAO();
        this.funcionarios = dao.getListFuncionarios();
        dao.fechar();

        return funcionarios;
    }
<<<<<<< HEAD

    public List<Locacao> getLocacoes() {
        DAO dao = new DAO();
        List<Locacao> listaLocacao = dao.getListLocacoes();
        dao.fechar();

        return listaLocacao;
    }

    public List<Venda> getVendas() {
        DAO dao = new DAO();
        List<Venda> listaVenda = dao.getListVendas();
        dao.fechar();

        return listaVenda;
    }
=======
>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8
}
