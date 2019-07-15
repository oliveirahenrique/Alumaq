package entidade;

import java.util.ArrayList;
import java.util.List;

public class Balconista extends Funcionario implements BalconistaInterface {
    private List<Locacao> locacoes;
    private List<Venda> vendas;
    
    public Balconista(int id, String nome, String dataN, Endereco endereco, String tel, Double sal) {
//        super(id, nome,dataN, endereco, tel,sal);
        locacoes = new ArrayList<>();
        vendas = new ArrayList<>();
    }


    @Override
    public List<Contrato> getLocacoes() {
        DAO dao = new DAO();
        this.contrato = dao.getListLocacoes();
        dao.fechar();

        return contrato;
    }

    @Override
    public void setLocacao(Locacao loc) {
        this.locacoes.add(loc);
    }

    @Override
    public List<Contrato> getVendas() {
        DAO dao = new DAO();
        this.contrato = dao.getListVendas();
        dao.fechar();

        return contrato;
    }

    @Override
    public void setVenda(Venda venda) {
        this.vendas.add(venda);
    }
    
    @Override
    public void iniciaNovaLocacao(Cliente c){
        int idL=00;        
        Locacao loc = new Locacao(idL, this, c);
        locacoes.add(loc);
       
        
    }
    
    @Override
    public void setItemLocacao(Locacao loc) {
        int id=0, qtd=0;
        Item item = loc.constroiItemLocacao(id, qtd);
        
        
        if(item!=null){            
                loc.setItemLocacao(item);
                       
        }else{  
                System.out.println("Item indisponivel no momento!\n\nCriar uma reserva de equipamento"); 
               
               
        }    
    }
    
    @Override
    public void setItemVenda(Venda venda) {
        int id=0, qtd=0;
        Item item = venda.constroiItemVenda(id, qtd);
        
        
        if(item!=null){            
                venda.setItemVenda(item);
                       
        }else{  
                System.out.println("Item indisponivel no momento!\n\nCriar uma reserva de equipamento"); 
               
        }    
                
    
    }
    
    @Override
    public void iniciaNovaVenda(Cliente c){
        int idL=11;
        Venda venda = new Venda(idL, this, c);
        vendas.add(venda);
        
        
    }
    
     
    @Override
    public void seguroLoc(Locacao loc, boolean seg){
        loc.setSeguro(seg);
        
    }
    
    @Override
    public void finalizaLocacao(Locacao loc){
        loc.geraContrato();
        loc.setFimLoc(true);
    }
    
    @Override
    public void finalizaVenda(Venda venda){
        setVenda(venda);
        venda.setFimVenda(true);
    }
}
