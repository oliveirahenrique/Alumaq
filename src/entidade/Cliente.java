package entidade;

import com.sun.istack.internal.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    @NotNull
    private String nome;
    @NotNull
    private String cpf;
    private String email = null;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @NotNull
    private Endereco enderecoId;
    @NotNull
    private String telefone1;
    private String telefone2 = null;
    @NotNull
    private String sexo;

//    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user")
//    private List<ReservaEquipamento> reservas;
    //assinatura digital
    public Cliente() {
    }

    public Cliente(String nome, String sexo, Date dataNascimento, String cpf, String telefone1, String telefone2, Endereco endereco, String email) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.enderecoId=endereco;
        this.email = email;
//        reservas = new ArrayList<>();
    }

    public void fazReserva(ReservaEquipamento r) {
//        reservas.add(r);
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
}
