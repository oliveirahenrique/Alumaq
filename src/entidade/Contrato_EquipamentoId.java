/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;

/**
 *
 * @author Pichau
 */
public class Contrato_EquipamentoId implements Serializable {

    private Contrato contratoId;
    private Equipamento equipamentoId;
    
    public Contrato_EquipamentoId(){
    }

    public Contrato_EquipamentoId(Contrato contrato,Equipamento equipamento){
        this.contratoId=contrato;
        this.equipamentoId=equipamento;
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
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + idEmployee;
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
