package entidade;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import persistencia.DAO;

public class OperadorCaixa extends Funcionario implements BalconistaInterface {
    private List<ContratoOperacao> contrato;
    
    public OperadorCaixa(int id, String nome, String dataN, Endereco endereco, String tel, Double sal) {
//        super(id, nome,dataN, endereco, tel,sal);
        //contratos = new ArrayList<>();
    }
    
     
    public ContratoOperacao buscaContrato(){
        System.out.println("Entre com o id do contrato");
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        ContratoOperacao c = new ContratoOperacao();
        return c.buscaContrato(id);       
        
    }
    
    public void realizarPagamentoContrato(ContratoOperacao c, String dataPagamento) throws ParseException{
        Pagamento pag = new Pagamento(c, dataPagamento);
        
        pag.realizarPagamento();
    }

    @Override
   public List<ContratoOperacao> getLocacoes() {
        DAO dao = new DAO();
        this.contrato = dao.getListLocacoes();
        dao.fechar();

        return contrato;
    }

    @Override
    public void setLocacao(Locacao loc) {
        
    }

    @Override
    public List<ContratoOperacao> getVendas() {
        DAO dao = new DAO();
        this.contrato = dao.getListVendas();
        dao.fechar();

        return contrato;
    }

    @Override
    public void setVenda(Venda venda) {
        
    }

    @Override
    public void iniciaNovaLocacao(Cliente c) {
        
    }

    @Override
    public void iniciaNovaVenda(Cliente c) {
        
    }

    @Override
    public void seguroLoc(Locacao loc, boolean seg) {
      
    }

    @Override
    public void finalizaLocacao(Locacao loc) {
      
    }

    @Override
    public void finalizaVenda(Venda venda) {
       
    }

    @Override
    public void setItemLocacao(Locacao loc) {
       
    }

    @Override
    public void setItemVenda(Venda venda) {
     
    }
            
            
 
}
