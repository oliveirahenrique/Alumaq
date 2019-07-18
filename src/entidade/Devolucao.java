package entidade;

import java.util.Date;
import persistencia.DAO;

public class Devolucao {

    //private Pagamento pagamento;
    //private Funcionario f;
    private double valorTotal;
    
    public Devolucao() {
    }
    
    public double devolverLocacao(Locacao l, Date dataDevolucao){
        if (l.getTipo().equals(Tipo.LOCACAO)) {
            if (l.getFase().equals(Fase.FASE2)) {
                this.valorTotal = l.getValorp1() + l.getValorp2() + l.getMulta(l, dataDevolucao);
                l.setFase(Fase.FINALIZADO);
                DAO dao = new DAO();
                dao.atualizar(l);
                dao.fechar();
            }
        }
        return this.valorTotal;
    }
}
