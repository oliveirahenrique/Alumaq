package entidade;

import java.util.Date;

public class Balconista extends Funcionario implements BalconistaInterface {
<<<<<<< HEAD
    
    public Balconista(String nome, String cpf, Date dataNascimento, Endereco endereco, String telefone1, String telefone2, Double salario) {
        super( nome,  cpf,  dataNascimento,  endereco,  telefone1,  telefone2, salario);
=======

    private List<Locacao> locacoes;
    private List<Venda> vendas;

    public Balconista(int id, String nome, String dataN, Endereco endereco, String tel, Double sal) {
        super(id, nome, dataN, endereco, tel, sal);
        locacoes = new ArrayList<>();
        vendas = new ArrayList<>();
    }

    @Override
    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    @Override
    public void setLocacao(Locacao loc) {
        this.locacoes.add(loc);
    }

    @Override
    public List<Venda> getVendas() {
        return vendas;
    }

    @Override
    public void setVenda(Venda venda) {
        this.vendas.add(venda);
    }

    @Override
    public void iniciaNovaLocacao(Cliente c) {
        int idL = 00;
        Locacao loc = new Locacao(idL, this, c);
        locacoes.add(loc);
    }

    @Override
    public void setItemLocacao(Locacao loc) {
        int id = 0, qtd = 0;
        Item item = loc.constroiItemLocacao(id, qtd);

        if (item != null) {
            loc.setItemLocacao(item);

        } else {
            System.out.println("Item indisponivel no momento!\n\nCriar uma reserva de equipamento");

        }
    }

    @Override
    public void setItemVenda(Venda venda) {
        int id = 0, qtd = 0;
        Item item = venda.constroiItemVenda(id, qtd);

        if (item != null) {
            venda.setItemVenda(item);

        } else {
            System.out.println("Item indisponivel no momento!\n\nCriar uma reserva de equipamento");

        }

    }

    @Override
    public void iniciaNovaVenda(Cliente c) {
        int idL = 11;
        Venda venda = new Venda(idL, this, c);
        vendas.add(venda);

    }

    @Override
    public void seguroLoc(Locacao loc, boolean seg) {
        loc.setSeguro(seg);

    }

    @Override
    public void finalizaLocacao(Locacao loc) {
        loc.geraContrato();
        loc.setFimLoc(true);
    }

    @Override
    public void finalizaVenda(Venda venda) {
        setVenda(venda);
        venda.setFimVenda(true);
>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8
    }
}
