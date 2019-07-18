package entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="contrato")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class ContratoOperacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idContrato;
    //private Locacao locacao;
    @NotNull
    @Temporal(TemporalType.DATE)
    protected Date dataInicio;
    @Temporal(TemporalType.DATE)
    protected Date dataFim=null;
    @NotNull
    protected Double valorp1;
    protected Double valorp2=null;
    @NotNull
    protected Tipo tipo;
    protected Double multa=null;
    @NotNull
    protected Fase fase;

    @OneToOne
    protected Cliente clienteId;
    @OneToOne
    protected Funcionario funcionarioId;
    //assinatura digital

    public ContratoOperacao() {
    }

    public ContratoOperacao(Date dataInicio, Date dataFim, Double valorp1, Double valorp2, Double multa, Tipo tipo, Fase fase, Cliente cliente, Funcionario funcionario) {
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

    public Integer getIdC() {
        return getIdContrato();
    }

    public void setIdC(Integer idContrato) {
        this.setIdContrato(idContrato);
    }

    public ContratoOperacao buscaContrato(int id) {
        ContratoOperacao contrato = null;

        return contrato;
    }

    /**
     * @return the idContrato
     */
    public Integer getIdContrato() {
        return idContrato;
    }

    /**
     * @param idContrato the idContrato to set
     */
    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

    /**
     * @return the dataInicio
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFim
     */
    public Date getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * @return the valorp1
     */
    public Double getValorp1() {
        return valorp1;
    }

    /**
     * @param valorp1 the valorp1 to set
     */
    public void setValorp1(Double valorp1) {
        this.valorp1 = valorp1;
    }

    /**
     * @return the valorp2
     */
    public Double getValorp2() {
        return valorp2;
    }

    /**
     * @param valorp2 the valorp2 to set
     */
    public void setValorp2(Double valorp2) {
        this.valorp2 = valorp2;
    }

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the fase
     */
    public Fase getFase() {
        return fase;
    }

    /**
     * @param fase the fase to set
     */
    public void setFase(Fase fase) {
        this.fase = fase;
    }

    /**
     * @return the clienteId
     */
    public Cliente getClienteId() {
        return clienteId;
    }

    /**
     * @param clienteId the clienteId to set
     */
    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }

    /**
     * @return the funcionarioId
     */
    public Funcionario getFuncionarioId() {
        return funcionarioId;
    }

    /**
     * @param funcionarioId the funcionarioId to set
     */
    public void setFuncionarioId(Funcionario funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

}
