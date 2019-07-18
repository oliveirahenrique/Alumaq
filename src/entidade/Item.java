package entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item implements Serializable {

    @Id
    private Long idItem;

    private Equipamento equipamento;
    private int qtd;
    private boolean disponivel;
    private Double subtotal;
    private Tipo tipo;

    public Item(Equipamento eq, int q) {
        setEquipamento(eq);
        setQtd(q);
        setDisponivel(false);
        subtotal = getQtd() * eq.getValor();
    }

    public Item() {

    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }
}
