package testePersistencia;
import entidade.Cargo;
import entidade.Cliente;
import entidade.ContratoOperacao;
import entidade.Endereco;
import entidade.Equipamento;
import entidade.Fase;
import entidade.Fornecedor;
import entidade.Funcionario;
import entidade.ReservaEquipamento;
import entidade.Setor;
import entidade.Tipo;
import entidade.Usuario;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import persistencia.DAO;

public class TesteDAO {

    public static void main(String[] args) {

        DAO dao = new DAO();

        //Criando endereços
        Endereco e1 = new Endereco("Afonso Arinos", "Centro", "Casa", 88, "Capitólio", "MG");
        Endereco e2 = new Endereco("Afonso Penna ", "Centro", "Apartamento", 108, "Alfenas", "MG");
        Endereco e3 = new Endereco("Gabriel Monteiro da Silva", "Centro", "Casa", 1390, "Alfenas", "MG");
        Endereco e4 = new Endereco("Cambé", "Ype 2", "Casa", 178, "Mogi Guaçu", "SP");
        Endereco e5 = new Endereco("Tiradentes", "Centro", "Casa", 16, "Alfenas", "MG");

        //Cadastrando endereços
        dao.cadastrar(e1);
        dao.cadastrar(e2);
        dao.cadastrar(e3);
        dao.cadastrar(e4);
        dao.cadastrar(e5);
        System.out.println("Endereços cadastrados");
        System.out.println("");

        //Cirando Clientes
        Cliente c1 = new Cliente("Henrique", "Masculino", new Date(16 / 04 / 1994), "58", "33731730", null, e1, "Email");
        Cliente c2 = new Cliente("Natalia", "Feminio", new Date(02 / 01 / 1991), "52", "991298585", null, e2, "Email");
        Cliente c3 = new Cliente("Pedro", "Masculino", new Date(16 / 8 / 1996), "28", "778956", null, e3, "Email");
        Cliente c4 = new Cliente("Isabela", "Feminino", new Date(18 / 03 / 1994), "78", "8689242", null, e4, "Email");

        //Cadastrando Clientes
        dao.cadastrar(c1);
        dao.cadastrar(c2);
        dao.cadastrar(c3);
        dao.cadastrar(c4);
        System.out.println("Clientes cadastrados");
        System.out.println("");

        //Criando FUncionarios
        Funcionario f1 = new Funcionario("Paulo", "58", new Date(16 / 04 / 1994), e5, null, null, 100.0);
        Funcionario f2 = new Funcionario("Leticia", "12", new Date(13 / 07 / 1990), e4, null, null, 300.0);
        Funcionario f3 = new Funcionario("Murilo", "84", new Date(23 / 05 / 1990), e2, null, null, 700.0);
        Funcionario f4 = new Funcionario("Andreia", "78", new Date(16 / 04 / 1994), e1, null, null, 0100.0);

        //Cadastrando Funcionários
        dao.cadastrar(f1);
        dao.cadastrar(f2);
        dao.cadastrar(f3);
        dao.cadastrar(f4);
        System.out.println("Funcionários cadastrados");
        System.out.println("");

        dao.remover(c4);
        System.out.println("Cliente 4 excluido");

        System.out.println("");

        dao.remover(f3);
        System.out.println("Funcionario 3 excluido");

        ContratoOperacao cont1 = new ContratoOperacao(new Date(16 / 04 / 2020), new Date(16 / 04 / 2019), 100.0, 0.0, 0.0, Tipo.VENDA, Fase.FASE1, c1, f1);
        ContratoOperacao cont2 = new ContratoOperacao(new Date(16 / 04 / 2020), new Date(16 / 04 / 2019), 100.0, 100.0, 0.0, Tipo.LOCACAO, Fase.FASE2, c1, f2);
        ContratoOperacao cont3 = new ContratoOperacao(new Date(10 / 04 / 2020), new Date(19 / 07 / 2019), 100.0, 0.0, 0.0, Tipo.LOCACAO, Fase.FASE1, c1, f4);
        ContratoOperacao cont4 = new ContratoOperacao(new Date(10 / 04 / 2019), new Date(13 / 8 / 2019), 100.0, 120.0, 27.0, Tipo.LOCACAO, Fase.FINALIZADO, c1, f2);

        dao.cadastrar(cont1);
        dao.cadastrar(cont2);
        dao.cadastrar(cont3);
        dao.cadastrar(cont4);

        System.out.println("Contratos cadastrados");
        System.out.println("");

        //Criando Fornecedores
        Fornecedor fn1 = new Fornecedor("Fornecedor 1", "f1@gmail.com");
        Fornecedor fn2 = new Fornecedor("Fornecedor 2", "f2@gmail.com");

        //Cadastrando os Fornecedores
        dao.cadastrar(fn1);
        dao.cadastrar(fn2);

        System.out.println("Fornecedores cadastrados");
        System.out.println("");

        //Criando Equipamentos
        Equipamento eq1 = new Equipamento("Trator", "Trator para colheita", true, 3, 300.00, Setor.LOCACAO);
        Equipamento eq2 = new Equipamento("Escavadeira", "Construcao", true, 5, 150.00, Setor.LOCACAO);
        Equipamento eq3 = new Equipamento("Bitorneira", "Construção", true, 15, 100.00, Setor.LOCACAO);
        Equipamento eq4 = new Equipamento("Enxada", "Construção", true, 2, 97.00, Setor.VENDA);
        Equipamento eq5 = new Equipamento("Colher de Pedreiro", "Construção", true, 1, 48.00, Setor.VENDA);
        Equipamento eq6 = new Equipamento("Nivel", "Construção", true, 25, 53.00, Setor.VENDA);

        //Cadastrando Equipamentos
        dao.cadastrar(eq1);
        dao.cadastrar(eq2);
        dao.cadastrar(eq3);
        dao.cadastrar(eq4);
        dao.cadastrar(eq5);
        dao.cadastrar(eq6);

        System.out.println("Equipamentos cadastrados");
        System.out.println("");

        //Crriando Reservas
        ReservaEquipamento r1 = new ReservaEquipamento(c1, eq1);
        ReservaEquipamento r2 = new ReservaEquipamento(c2, eq2);
        ReservaEquipamento r3 = new ReservaEquipamento(c3, eq3);
        ReservaEquipamento r4 = new ReservaEquipamento(c3, eq1);

        //Salvando Reservas
        dao.cadastrar(r1);
        dao.cadastrar(r2);
        dao.cadastrar(r3);
        dao.cadastrar(r4);
        System.out.println("Reservas salvas");
        System.out.println("");
           
        Cargo cargo = new Cargo("Balconista");
        dao.cadastrar(cargo);
        
        Usuario user = new Usuario("Henrique", "123456", f1, cargo);
        dao.cadastrar(user);
        
        Usuario usuario = dao.getUsuario(user.getLogin());
        
        System.out.println("Usuário:" + usuario.getLogin() + "  Senha:" + usuario.getSenha());
        
        dao.fechar();
        
    }
}
