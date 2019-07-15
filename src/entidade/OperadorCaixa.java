package entidade;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

    
public class OperadorCaixa extends Funcionario implements BalconistaInterface {
    
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

}
