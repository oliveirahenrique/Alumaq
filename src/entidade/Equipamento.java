package entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEq;
    private String nome, descricao;
    private Double valor;
    private boolean disponivel;
    private Setor setor;
    
    
    public Equipamento(int id, String n, String desc, Setor s, Double valor) {
        setIdEq(id);
        nome =n;
        descricao = desc;
        setSetor(s);
        setDisponivel(false);
        this.setValor(valor);
        
    }
    public Equipamento(){}
                      

    public int getIdEq() {
        return idEq;
    }

    public void setIdEq(int idEq) {
        this.idEq = idEq;
    }

   

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}
