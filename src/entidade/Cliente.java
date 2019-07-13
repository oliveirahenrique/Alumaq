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
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }
    private final String nome;
    private String cidadeUF, logradouro;
    
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<String> telefones;
    private String sexo;
    private String dataNascimento;
    private String cpf;
    private List<ReservaEquipamento> reservas;
    //assinatura digital
    
    public Cliente (String nome, String sexo, String dataNascimento, String cpf, List<String> telefones, String cidadeUF, String logradouro) {
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

     
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente1)) {
            return false;
        }
        Cliente1 other = (Cliente1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Cliente1[ id=" + id + " ]";
    }
    
}

