package entidade;

public class Pagamento {
    private Contrato contrato;
    private Double valor;
  
    
    public Pagamento(Contrato contrato) {
       
        
    }

    public void realizarPagamento(){
        if(contrato.fase==Fase.FASE1){
           
            contrato.fase = Fase.FASE2;
        }
        else{
            if(contrato.fase==Fase.FASE2){
              
                Devolucao d = new Devolucao(contrato);                       
            }
        }
    }
    

}
