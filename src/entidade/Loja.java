package entidade;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private String nome;
    private Endereco endereco;
    private List<Funcionario> funcionarios;
    private List<Contrato> contratos;
    private int cnpj;

    public Loja() {
        funcionarios = new ArrayList<>();
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
