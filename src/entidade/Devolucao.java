package entidade;

public class Devolucao {

    private Contrato contrato;
    private Pagamento pagamento;
    private Funcionario f;

    public Devolucao(Contrato c) {
        contrato = c;
        contrato.fase = Fase.FINALIZADO;
    }
}
