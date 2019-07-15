package entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "reserva_equipamento")
public class ReservaEquipamento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
    @OneToOne
    private Cliente clienteId;
    @OneToOne
    private Equipamento equipamentoId;
    
    public ReservaEquipamento(){        
    }
    
    public ReservaEquipamento (Cliente cliente, Equipamento equipamento) {
        this.clienteId = cliente;
        this.equipamentoId = equipamento;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }
}

