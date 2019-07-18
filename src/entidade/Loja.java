package entidade;

import java.util.ArrayList;
import java.util.List;
import persistencia.DAO;

public class Loja {

    private List<Funcionario> funcionarios;
    private List<ContratoOperacao> contrato;

    public Loja() {
    }

    public List<Funcionario> getFuncionarios() {
        DAO dao = new DAO();
        this.funcionarios = dao.getListFuncionarios();
        dao.fechar();

        return funcionarios;
    }

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
}
