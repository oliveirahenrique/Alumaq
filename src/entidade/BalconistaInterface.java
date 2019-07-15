/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.List;

/**
 *
 * @author natalia
 */
public interface BalconistaInterface {
    
    public List<ContratoOperacao> getLocacoes();

    public void setLocacao(Locacao loc);

    public List<ContratoOperacao> getVendas();
    
    public void setVenda(Venda venda);
    
    public void iniciaNovaLocacao(Cliente c);
    
     public void setItemLocacao(Locacao loc);
    
    public void iniciaNovaVenda(Cliente c);    
    
    public void setItemVenda(Venda venda);
     
    public void seguroLoc(Locacao loc, boolean seg);
    
    public void finalizaLocacao(Locacao loc);
    
    public void finalizaVenda(Venda venda);
    
}
