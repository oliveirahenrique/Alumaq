package entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFornecedor;
    private String nome;
    private String email;

    public Fornecedor(){
    }
    
    public Fornecedor (String nome, String email){
        this.nome=nome;
        this.email=email;
    }
    
    public Integer getID() {
        return idFornecedor;
    }

    public void setID(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
    
}
