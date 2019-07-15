package entidade;

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

    public List<ContratoOperacao> getLocacoes() {
        DAO dao = new DAO();
        this.contrato = dao.getListLocacoes();
        dao.fechar();

        return contrato;
    }

    public List<ContratoOperacao> getVendas() {
        DAO dao = new DAO();
        this.contrato = dao.getListVendas();
        dao.fechar();

        return contrato;
    }
}
