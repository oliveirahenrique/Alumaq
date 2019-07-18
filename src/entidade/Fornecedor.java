package entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor")
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFornecedor;
    private String nome;
    private String email;
    @OneToOne
    @JoinColumn(name = "endereco")
    private Endereco enderecoId;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    public Fornecedor(String nome, String email, Endereco endereco) {
        super();
        this.enderecoId = endereco;
    }

    public Integer getID() {
        return idFornecedor;
    }

    public void setID(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
