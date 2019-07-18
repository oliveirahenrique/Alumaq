package entidade;

import java.util.Date;

public class Balconista extends Funcionario implements BalconistaInterface {
    
    public Balconista(String nome, String cpf, Date dataNascimento, Endereco endereco, String telefone1, String telefone2, Double salario) {
        super( nome,  cpf,  dataNascimento,  endereco,  telefone1,  telefone2, salario);
    }
}
