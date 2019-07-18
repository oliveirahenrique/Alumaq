package entidade;

import java.util.Date;
import javax.persistence.Entity;
<<<<<<< HEAD

@Entity
public class Venda extends ContratoOperacao{
    
    public Venda(){
    }
    
    public Venda(Date dataInicio, Double valorp1, Tipo tipo, Fase fase, Cliente cliente, Funcionario funcionario) {
        this.dataInicio = dataInicio;
        this.valorp1 = valorp1;
        this.tipo = tipo;
        this.fase = fase;
        this.clienteId = cliente;
        this.funcionarioId = funcionario;

=======
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;

@Entity
public class Venda implements Operacao, Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVenda;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Item> itens;

    private boolean fimVenda;
    private ControladorEstoque estoque;

    public Venda(int id, Funcionario f, Cliente c) {
        idVenda = id;

        itens = new ArrayList<>();
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public List<Item> getItens() {
        return itens;
    }

    public Item constroiItemVenda(int id, int qtd) {
        Equipamento e = new Equipamento();

        //e = query que retorna o equipamento
        if (e.getSetor() == Setor.VENDA) {
            Item item = new Item(e, qtd);
            e.setDisponivel(checaEstoque(item));
            if (e.isDisponivel())
                return item;
            else
                return null;
        }

        return null;
    }

    public void setItemVenda(Item item) {
        itens.add(item);
    }

    public Item getItemVenda(int i) {
        return itens.get(i);
    }

    public boolean isFimVenda() {
        return fimVenda;
    }

    public void setFimVenda(boolean fimVenda) {
        this.fimVenda = fimVenda;
    }

    public boolean checaEstoque(Item item) {
        boolean dispo;
        dispo = estoque.checa(item.getEquipamento(), item.getQtd());
        return dispo;
>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8
    }
}
