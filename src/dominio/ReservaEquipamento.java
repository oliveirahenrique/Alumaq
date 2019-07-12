package dominio;

public class ReservaEquipamento {
    private Cliente cliente;
    private Equipamento equipamento;
    
    public ReservaEquipamento (Cliente cliente, Equipamento equipamento) {
        this.cliente = cliente;
        this.equipamento = equipamento;
    }
}

