/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;

/**
 *
 * @author Pichau
 */
@Entity 
@IdClass(Contrato_EquipamentoId.class)
public class Contrato_Equipamento implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @NotNull
//    @OneToOne
    @Column(name = "contrato")
    private Contrato contratoId;
    @Id
    @NotNull
    @OneToOne
    @Column(name = "equipamento")
    private Equipamento equipamentoId;
    @NotNull
    private Integer qtd;
    @NotNull
    private double valor;

    public Contrato_Equipamento() {
    }

    public Contrato_Equipamento(Contrato contrato, Equipamento equipamento, Integer qtd, Double valor) {
        this.contratoId = contrato;
        this.equipamentoId = equipamento;
        this.qtd = qtd;
        this.valor = valor;
    }

    /**
     * @return the contratoId
     */
    public Contrato getContratoId() {
        return contratoId;
    }

    /**
     * @param contratoId the contratoId to set
     */
    public void setContratoId(Contrato contratoId) {
        this.contratoId = contratoId;
    }

    /**
     * @return the equipamentoId
     */
    public Equipamento getEquipamentoId() {
        return equipamentoId;
    }

    /**
     * @param equipamentoId the equipamentoId to set
     */
    public void setEquipamentoId(Equipamento equipamentoId) {
        this.equipamentoId = equipamentoId;
    }

    /**
     * @return the qtd
     */
    public Integer getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

}
