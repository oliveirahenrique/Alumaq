package entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEndereco;
    private String rua, bairro, cidade, estado;
    private int numero;
    
    public Endereco(String r, String b, int n, String c, String e) {
        rua = r;
        bairro = b;
        numero = n;
        cidade = c;
        estado = e;
    }
}
