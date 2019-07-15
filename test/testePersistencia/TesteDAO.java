package testePersistencia;

import entidade.Cliente;
import entidade.ContratoOperacao;
import entidade.Endereco;
import entidade.Fase;
import entidade.Funcionario;
import entidade.Locacao;
import entidade.Tipo;
import entidade.Venda;
import java.util.Date;
import persistencia.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class TesteDAO {

    public static void main(String[] args) {

        DAO dao = new DAO();

        Endereco e1 = new Endereco("Afonso Arinos", "centro", "casa", 88, "Capitólio", "MG");
        dao.cadastrar(e1);
        System.out.println("Endereço 1 cadastrado");
        
        Endereco e2 = new Endereco("Ahyuasca ", "centro", "casa", 88, "Capitólio", "MG");
        dao.cadastrar(e2);
        System.out.println("Endereço 2 cadastrado");
        
        Endereco e3 = new Endereco("Gabriel", "centro", "casa", 88, "Capitólio", "MG");
        dao.cadastrar(e3);
        System.out.println("Endereço 3 cadastrado");
        
        Endereco e4 = new Endereco("Afonso Arinos", "centro", "casa", 88, "Capitólio", "MG");
        dao.cadastrar(e4);
        System.out.println("Endereço 4 cadastrado");
        
        Endereco e5 = new Endereco("Afonso Arinos", "centro", "casa", 88, "Capitólio", "MG");
        dao.cadastrar(e5);
        System.out.println("Endereço 5 cadastrado");

        Cliente c1 = new Cliente("Henrique", "Masculino", new Date(16 / 04 / 1994), "58", "33731730", null, e1, "Email");
        Cliente c2 = new Cliente("Nathalia", "Feminio", new Date(16 / 04 / 1994), "52", "991298585", null, e2, "Email");
        Cliente c3 = new Cliente("Roberval", "Masculino", new Date(16 / 04 / 1994), "28", "778956", null, e3, "Email");
        Cliente c4 = new Cliente("Henrique", "Masculino", new Date(16 / 04 / 1994), "78", "86", null, e4, "Email");

        Funcionario f1 = new Funcionario("Henrique", "58", new Date(16 / 04 / 1994), e5, null, null, 100.0);

        dao.cadastrar(c1);
        dao.cadastrar(c2);
        dao.cadastrar(c3);
        dao.cadastrar(c4);
        System.out.println("Clientes cadastrados");

        dao.remover(c4);
        System.out.println("Cliente 4 excluido");
        
        dao.cadastrar(f1);
        System.out.println("Funcionario 1 cadastrado");

        Venda cont1 = new Venda(new Date(16 / 04 / 2020), 100.0, Tipo.VENDA, Fase.FASE1, c1, f1);
        Locacao cont2 = new Locacao(new Date(16 / 04 / 2020), new Date(16 / 04 / 2019), 100.0, 0.0, 0.0, Tipo.LOCACAO, Fase.FASE2, c1, f1);

        dao.cadastrar(cont1);
        System.out.println("Contrato de Venda cadastrado");

        dao.cadastrar(cont2);
        System.out.println("Contrato Locação cadastrado");

        dao.fechar();

    }
}
