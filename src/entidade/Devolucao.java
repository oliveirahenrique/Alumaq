package entidade;

import java.util.Date;
import persistencia.DAO;

public class Devolucao {

    //private Pagamento pagamento;
    //private Funcionario f;
    private double valorTotal;
    
    public Devolucao() {
    }
    
    public double devolverLocacao(ContratoOperacao c, Date dataDevolucao){
        if (c.getTipo().equals(Tipo.LOCACAO)) {
            if (c.getFase().equals(Fase.FASE2)) {
                this.valorTotal = c.getValorp1() + c.getValorp2() + c.getMulta(c, dataDevolucao);
                c.setFase(Fase.FINALIZADO);
                DAO dao = new DAO();
                dao.atualizar(c);
                dao.fechar();
            }
        }
        return this.valorTotal;
    }
}
