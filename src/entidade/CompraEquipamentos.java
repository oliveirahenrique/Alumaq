package entidade;
import persistencia.DAO;

import java.util.ArrayList;

public class CompraEquipamentos {
    ArrayList<Equipamento> equipamentos;

    public CompraEquipamentos(ArrayList<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }
    
    public String comprar() {
        Double valor = 0.0;
        String r = " ";
        DAO dao = new DAO();
        for (Equipamento e : equipamentos) {
            valor += e.getValor();
            e.qtd = e.qtd + 1;
            e.setDisponivel(true);

            dao.atualizar(e);
        }
        dao.fechar();
        r = "Compra realizada com sucesso! Valor: R$"+valor;
        
        return r;
    }
}
