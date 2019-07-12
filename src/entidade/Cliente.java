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
    private String nome;
    private String cidadeUF, logradouro;    

    private String telefone1;
    private String telefone2;
    private String sexo;
    private String dataNascimento;
    private String cpf;
    
//    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user")
//    private List<ReservaEquipamento> reservas;
    //assinatura digital
    
    public Cliente(){        
    }
    
    public Cliente (String nome, String sexo, String dataNascimento, String cpf, String telefone1, String telefone2, String cidadeUF, String logradouro) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.cidadeUF = cidadeUF;
        this.logradouro = logradouro;
//        reservas = new ArrayList<>();
    }
    
    
    public void fazReserva(ReservaEquipamento r){
//        reservas.add(r);
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
}

