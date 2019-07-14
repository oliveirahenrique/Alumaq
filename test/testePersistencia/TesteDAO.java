package testePersistencia;

import entidade.Cliente;
import entidade.Contrato;
import entidade.Endereco;
import entidade.Fase;
import entidade.Funcionario;
import entidade.Tipo;
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
        
        Endereco e1 = new Endereco("Afonso Arinos", "centro", "casa", 88);
        
        Cliente c1 = new Cliente("Henrique", "Masculino", "16/04/1994", "58", "33731730", null, "Capitólio-MG", "Augusto Theodoro,88");
        Cliente c2 = new Cliente("Nathalia", "Feminio", "16/04/1994", "52", "991298585", null, "Mogimirim-MG", " Afonso Arinos,256");
        Cliente c3 = new Cliente("Roberval", "Masculino", "16/04/1994", "28", "778956", null, "São Paulo-MG", "Chuca,85");
        Cliente c4 = new Cliente("Henrique", "Masculino", "16/04/1994", "78", "86", null, "Rio de Janeiro-MG", "Augusto Theodoro,88");
        
        Funcionario f1 = new Funcionario("Henrique", "58", new Date(16 / 04 / 1994), e1, null, null, 100.0);
        
        dao.cadastrar(c1);
        dao.cadastrar(c2);
        dao.cadastrar(c3);
        dao.cadastrar(c4);
        System.out.println("Clientes cadastrados");
        
        dao.remover(c4);
        System.out.println("Cliente 4 excluido");
        
        dao.cadastrar(e1);
        System.out.println("Endereço 1 cadastrado");
        dao.cadastrar(f1);
        System.out.println("Funcionario 1 cadastrado");
        
        Contrato cont1 = new Contrato(new Date(16 / 04 / 2020), new Date(16 / 04 / 2019), 100.0, 0.0, 0.0, Tipo.VENDA, Fase.FASE1, c1, f1);
        Contrato cont2 = new Contrato(new Date(16 / 04 / 2020), new Date(16 / 04 / 2019), 100.0, 0.0, 0.0, Tipo.LOCACAO, Fase.FASE2, c1, f1);
        
        dao.cadastrar(cont1);
        System.out.println("Contrato 1 cadastrado");
        
        dao.cadastrar(cont2);
        System.out.println("Contrato 2 cadastrado");
        
        dao.fechar();
        
    }
}
