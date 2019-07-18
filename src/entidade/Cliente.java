package entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable {

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
    @OneToOne
    private Endereco enderecoId;
    @NotNull
    private String telefone1;
    private String telefone2 = null;
    @NotNull
    private String sexo;

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
