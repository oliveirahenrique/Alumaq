package entidade;

import java.util.Date;
import persistencia.DAO;

public class Devolucao {

    private Contrato contrato;
    private Pagamento pagamento;
    private Funcionario f;
    private double valorTotal;
    public Devolucao() {
    }
    
    public double devolverLocacao(Contrato c, Date dataDevolucao){
        contrato = c;
        if (contrato.getTipo().equals(Tipo.LOCACAO)) {
            if (contrato.getFase().equals(Fase.FASE2)) {
                this.valorTotal = c.getValorp1() + c.getValorp2() + c.getMulta(c, dataDevolucao);
                contrato.setFase(Fase.FINALIZADO);
                DAO dao = new DAO();
                dao.atualizar(c);
                dao.fechar();
            }
        }
        return this.valorTotal;
    }
}
