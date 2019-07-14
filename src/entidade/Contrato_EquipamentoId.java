/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Pichau
 */
@Embeddable
public class Contrato_EquipamentoId implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer contratoId;
    private Integer equipamentoId;
    
    public Contrato_EquipamentoId(){
    }

    public Contrato_EquipamentoId(Integer contrato,Integer equipamento){
        this.contratoId=contrato;
        this.equipamentoId=equipamento;
    }
    
    /**
     * @return the contratoId
     */
    public Integer getContratoId() {
        return contratoId;
    }

    /**
     * @param contratoId the contratoId to set
     */
    public void setContratoId(Integer contratoId) {
        this.contratoId = contratoId;
    }

    /**
     * @return the equipamentoId
     */
    public Integer getEquipamentoId() {
        return equipamentoId;
    }

    /**
     * @param equipamentoId the equipamentoId to set
     */
    public void setEquipamentoId(Integer equipamentoId) {
        this.equipamentoId = equipamentoId;
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contratoId == null) ? 0 : contratoId.hashCode());
		result = prime * result
				+ ((equipamentoId == null) ? 0 : equipamentoId.hashCode());
		return result;
	}
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrato_EquipamentoId other = (Contrato_EquipamentoId) obj;
		if (contratoId == null) {
			if (other.contratoId != null)
				return false;
		} else if (!contratoId.equals(other.contratoId))
			return false;
		if (equipamentoId == null) {
			if (other.equipamentoId != null)
				return false;
		} else if (!equipamentoId.equals(other.equipamentoId))
			return false;
		return true;
	}
}
