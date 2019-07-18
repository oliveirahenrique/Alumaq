package entidade;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

    
public class OperadorCaixa extends Funcionario implements BalconistaInterface {
<<<<<<< HEAD
    
    public OperadorCaixa(String nome, String cpf, Date dataNascimento, Endereco endereco, String telefone1, String telefone2, Double salario) {
        super( nome,  cpf,  dataNascimento,  endereco,  telefone1,  telefone2, salario);
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

=======

    private List<Contrato> contratos;

    public OperadorCaixa(int id, String nome, String dataN, Endereco endereco, String tel, Double sal) {
        super(id, nome, dataN, endereco, tel, sal);
        contratos = new ArrayList<>();
    }

    public Contrato buscaContrato() {
        System.out.println("Entre com o id do contrato");
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        Contrato c = new Contrato();
        return c.buscaContrato(id);

    }

    public void realizarPagamentoContrato(Contrato c) {
        Pagamento pag = new Pagamento(c);

        pag.realizarPagamento();
    }

    @Override
    public List<Locacao> getLocacoes() {
        return null;
    }

    @Override
    public void setLocacao(Locacao loc) {

    }

    @Override
    public List<Venda> getVendas() {
        return null;
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
>>>>>>> 173b8b77ba56b1618a01d1700921e27327b359b8
}
