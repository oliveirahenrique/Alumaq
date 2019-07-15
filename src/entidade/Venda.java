package entidade;

import java.util.Date;


public class Venda extends ContratoOperacao{
    
    public Venda(Date dataInicio, Double valorp1, Tipo tipo, Fase fase, Cliente cliente, Funcionario funcionario) {
        this.dataInicio = dataInicio;
        this.valorp1 = valorp1;
        this.tipo = tipo;
        this.fase = fase;
        this.clienteId = cliente;
        this.funcionarioId = funcionario;

    }
}
