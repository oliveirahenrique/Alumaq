package entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
<<<<<<< HEAD
@Table(name = "reserva_equipamento")
public class ReservaEquipamento implements Serializable{
=======
public class ReservaEquipamento implements Serializable {
>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
<<<<<<< HEAD
    @OneToOne
    private Cliente clienteId;
    @OneToOne
    private Equipamento equipamentoId;
    
    public ReservaEquipamento(){        
    }
    
    public ReservaEquipamento (Cliente cliente, Equipamento equipamento) {
        this.clienteId = cliente;
        this.equipamentoId = equipamento;
=======

    public ReservaEquipamento() {

    }

    public ReservaEquipamento(Cliente cliente, Equipamento equipamento) {
        this.cliente = cliente;
        this.equipamento = equipamento;
>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }
}
