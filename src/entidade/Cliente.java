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
<<<<<<< HEAD
@Table(name="cliente")
public class Cliente implements Serializable {
=======
public class Cliente {
>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    @NotNull
    private String nome;
<<<<<<< HEAD
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
=======
    private String cidadeUF, logradouro;

>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8
    private String telefone1;
    private String telefone2 = null;
    @NotNull
    private String sexo;
<<<<<<< HEAD

    public Cliente() {
    }

    public Cliente(String nome, String sexo, Date dataNascimento, String cpf, String telefone1, String telefone2, Endereco endereco, String email) {
=======
    private String dataNascimento;
    private String cpf;

//    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user")
//    private List<ReservaEquipamento> reservas;
    //assinatura digital
    public Cliente() {
    }

    public Cliente(String nome, String sexo, String dataNascimento, String cpf, String telefone1, String telefone2, String cidadeUF, String logradouro) {
>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8
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
