package entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ReservaEquipamento implements Serializable{

    private Cliente cliente;
    private Equipamento equipamento;
    @Id
    private Long idReserva;
    
    public ReservaEquipamento (Cliente cliente, Equipamento equipamento) {
        this.cliente = cliente;
        this.equipamento = equipamento;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }
}

