/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Pichau
 */
@Entity
@Table(name="cargo")
public class Cargo implements Serializable{
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCargo;
    @NotNull
    private String funcao;
    
    public Cargo(){
    }
    
    public Cargo(String funcao){
        this.funcao=funcao;
    }

    /**
     * @return the idCargo
     */
    public Integer getIdCargo() {
        return idCargo;
    }

    /**
     * @param idCargo the idCargo to set
     */
    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
}
