package entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contrato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idC;
    private Date dataInicio, dataFim;
    private boolean contratoAceito;
    Fase fase;
    private Double multa;
    private Tipo tipo;
    private Double total;
    private Cliente cliente;
    private Funcionario f;
    private Operacao op;
    //assinatura digital

    public Contrato(Integer id) {
        setIdC(id);
        
        fase = Fase.FASE1;

    }

    public Contrato() {
    }

    public Integer getIdC() {
        return idC;
    }

    public void setIdC(Integer idC) {
        this.idC = idC;
    }


    public Contrato buscaContrato(int id) {
        Contrato contrato = null;

        //busca no banco de dados o contrato com aquele id
        //contrato = query(...)
        return contrato;
    }
}
