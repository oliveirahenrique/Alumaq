package entidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    private final String nome;
    private String cidadeUF, logradouro;
    
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<String> telefones;
    private enum Sexo {M, F};
    private final Sexo sexo;
    private final Date dataNascimento;
    private final int cpf;
    private List<ReservaEquipamento> reservas;
    //assinatura digital
    
    public Cliente (String nome, Sexo sexo, Date dataNascimento, int cpf, List<String> telefones, String cidadeUF, String logradouro) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefones = telefones;
        this.cidadeUF = cidadeUF;
        this.logradouro = logradouro;
        reservas = new ArrayList<>();
    }
    
    
    public void fazReserva(ReservaEquipamento r){
        reservas.add(r);
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
}

