/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entidade.Equipamento;
import entidade.Setor;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import persistencia.DAO;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class LocacaoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    ArrayList<Equipamento> equipamentos;

    public LocacaoController(ArrayList<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }
    
    public String alugar() {
        Double valor = 0.0;
        ArrayList<Equipamento> indisp = new ArrayList(); 
        String r = " ";
        DAO dao = new DAO();
        for (Equipamento e : equipamentos) {
            if (e.getSetor().equals(Setor.LOCACAO) && e.isDisponivel()) {
                valor += e.getValor();
                e.setQtd_estoque(e.getQtd_estoque()-1);
                if (e.getQtd_estoque() == 0)
                    e.setDisponivel(false);
                
                dao.atualizar(e);
            } else {
                indisp.add(e);
            }
        }
        // TODO gerar contrato de locacao
        dao.fechar();
        
        if (valor.equals(0.0)) {
            r = "Equipamentos não disponíveis. Locação não realizada.";
        } else if (!indisp.isEmpty()) {
            r = "Equipamentos ";
            for (Equipamento e : indisp) {
                r = r + e.getNome() + " (" + e.getIdEq() + ") ";
            }
            r = r + "não disponíveis. Valor da locação: R$"+valor;
        } else {
            r = "Locação realizada com sucesso! Valor: R$"+valor;
        }
        return r;
    }
}
