package entidade;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.persistence.Entity;

@Entity
public class Locacao extends ContratoOperacao {
    
    public Locacao(){
    }
       
    public Locacao(Date dataInicio, Date dataFim, Double valorp1, Double valorp2, Double multa, Tipo tipo, Fase fase, Cliente cliente, Funcionario funcionario) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorp1 = valorp1;
        this.valorp2 = valorp2;
        this.multa = multa;
        this.tipo = tipo;
        this.fase = fase;
        this.clienteId = cliente;
        this.funcionarioId = funcionario;

    }   
    
    /**
     * @param c
     * @param dataDevolucao
     * @return the multa
     */
    public Double getMulta(Locacao l, Date dataDevolucao) {
        long diffMilisegundos = Math.abs(dataDevolucao.getTime() - l.dataFim.getTime());
        long diffDias = TimeUnit.DAYS.convert(diffMilisegundos, TimeUnit.MILLISECONDS);
        double valorDaMulta = (l.getValorp1() + l.getValorp2()) * 0.02 * diffDias;
        
        return valorDaMulta;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(Double multa) {
        this.multa = multa;
    }
}
