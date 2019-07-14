package entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Equipamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEq;
    private String nome, descricao;
    private boolean disponivel;
    private Double valor;
    private Integer qtd_estoque;
    private Setor setor;
    
    public Equipamento(){
    }
    
    public Equipamento( String nome, String descricao, boolean disponivel,  Integer qtd_estoque, Double valor, Setor setor) {
        this.nome =nome;
        this.descricao = descricao;
        this.disponivel= disponivel;
        this.valor=valor;
        this.qtd_estoque=qtd_estoque;
        this.setor=setor;
        
        
    }

    public int getIdEq() {
        return idEq;
    }

    public void setIdEq(int idEq) {
        this.setIdEq((Integer) idEq);
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

    /**
     * @param idEq the idEq to set
     */
    public void setIdEq(Integer idEq) {
        this.idEq = idEq;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the qtd_estoque
     */
    public Integer getQtd_estoque() {
        return qtd_estoque;
    }

    /**
     * @param qtd_estoque the qtd_estoque to set
     */
    public void setQtd_estoque(Integer qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }
    
    
}
