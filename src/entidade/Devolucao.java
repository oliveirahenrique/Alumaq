package entidade;

import java.util.Date;
import persistencia.DAO;

public class Devolucao {

<<<<<<< HEAD
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
=======
    private Contrato contrato;
    private Pagamento pagamento;
    private Funcionario f;

    public Devolucao(Contrato c) {
        contrato = c;
        contrato.fase = Fase.FINALIZADO;
>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8
    }
}
