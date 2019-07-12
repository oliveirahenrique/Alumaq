package entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fornecedor implements Serializable{

    @Id
    private Integer idFornecedor;

    public Integer getID() {
        return idFornecedor;
    }

    public void setID(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
    
}
