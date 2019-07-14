package entidade;

public class Pagamento {
    private Contrato contrato;
    private Double valor;
  
    
    public Pagamento(Contrato contrato) {
       
        
    }

    public void realizarPagamento(){
        if(contrato.getFase()==Fase.FASE1){
//            contrato.setSaldoDevedor(contrato.getSaldoDevedor() - valor);
            contrato.setFase(Fase.FASE2);
        }
        else{
            if(contrato.getFase()==Fase.FASE2){
//                contrato.setSaldoDevedor(contrato.getSaldoDevedor() - valor);
                Devolucao d = new Devolucao(contrato);                       
            }
        }
    }
    

}
