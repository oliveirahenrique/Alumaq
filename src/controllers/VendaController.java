/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import entidade.*;

/**
 * FXML Controller class
 *
 * @author natalia
 */
public class VendaController implements Initializable, Controller {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    ArrayList<Equipamento> equipamentos;

    public VendaController(ArrayList<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }
    
    public String vender() {
        Double valor = 0.0;
        ArrayList<Equipamento> indisp = new ArrayList(); 
        String r = " ";
        for (Equipamento e : equipamentos) {
            if (e.getSetor().equals(Setor.VENDA) && e.isDisponivel()) {
                valor += e.getValor();
                e.setQtd_estoque(e.getQtd_estoque()-1);
                if (e.getQtd_estoque() == 0)
                    e.setDisponivel(false);
                
                dao.atualizar(e);
            } else {
                indisp.add(e);
            }
        }
        // TODO registrar comissoes
        // TODO gerar contrato de venda
        // TODO encaminhar pagamento referente à venda ao setor de pagamento
        
        if (valor.equals(0.0)) {
            r = "Equipamentos não disponíveis. Venda não realizada.";
        } else if (!indisp.isEmpty()) {
            r = "Equipamentos ";
            for (Equipamento e : indisp) {
                r = r + e.getNome() + " (" + e.getIdEq() + ") ";
            }
            r = r + "não disponíveis. Valor da venda: R$"+valor;
        } else {
            r = "Venda realizada com sucesso! Valor: R$"+valor;
        }
        return r;
    }
    
}
