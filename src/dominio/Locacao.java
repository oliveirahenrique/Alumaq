package dominio;

import java.util.ArrayList;
import java.util.List;

public class Locacao implements Operacao {
    private int idLoc;    
    private List<Item> itens;
    private boolean seguroLoc;
    private boolean fimLoc;
    private ControladorEstoque estoque;
    
    
    public Locacao(int id, Funcionario f, Cliente c) {
        setIdLoc(id);
        itens = new ArrayList<>();
        fimLoc = false;        
        seguroLoc = false;
        
        estoque = new ControladorEstoque();
       
    }


    public int getIdLoc() {
        return idLoc;
    }
    
   
    public void setIdLoc(int idLoc) {
        this.idLoc = idLoc;
    }

   

    public List<Item> getItens() {
        return itens;
    }
    
    public Item constroiItemLocacao(int id, int qtd){
        Equipamento e = new Equipamento();

        //e = query que retorna o equipamento
        
        if(e.getSetor() == Setor.LOCACAO){
           Item item =  new Item(e,qtd);
           e.setDisponivel(checaEstoque(item));
            if(e.isDisponivel())    
                return item;
            else 
                return null;
        }
        
       return null;
    }
    
    public void setItemLocacao(Item item){
        itens.add(item);
    }
    
    
    public Item getItemLoc(int i) {
        return itens.get(i);
    }

    public boolean isSeguroLoc() {
        return seguroLoc;
    }

    public void setSeguro(boolean seguro) {
        this.seguroLoc = seguro;
    }

    public boolean isFimLoc() {
        return fimLoc;
    }

    public void setFimLoc(boolean fimLoc) {
        this.fimLoc = fimLoc;
    }

    public void geraContrato(){
        int id=0;
       
        
    }
    
    public boolean checaEstoque(Item item){
        boolean dispo = false;
       
        return dispo;        
    }

}
