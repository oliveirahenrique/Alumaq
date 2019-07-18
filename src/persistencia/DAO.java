/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Cliente;
import entidade.ContratoOperacao;
import entidade.Equipamento;
import entidade.Fornecedor;
import entidade.Funcionario;
import entidade.Locacao;
import entidade.Tipo;
import entidade.Usuario;
import entidade.Venda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

public class DAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlumaqNetbeansPU");
    EntityManager em = emf.createEntityManager();

    public void cadastrar(Object o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
    }

    public Object pesquisarPorChave(Class c, Integer chave) {
        return em.find(c, chave);
    }

    public Object pesquisarPorChave(Class c, Long chave) {
        return em.find(c, chave);
    }

    public void atualizar(Object o) {
        em.getTransaction().begin();
        em.merge(o);
        em.getTransaction().commit();
    }

    public void remover(Object o) {
        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
    }

    @SuppressWarnings("empty-statement")
    public List<Cliente> getListClientes() {
        TypedQuery<Cliente> consulta = (TypedQuery<Cliente>) em.createNativeQuery("SELECT * FROM cliente",Cliente.class        );
        List<Cliente> lista = consulta.getResultList();

        return lista;
    }

    @SuppressWarnings("empty-statement")
    public List<Fornecedor> getListFornecedores() {
        TypedQuery<Fornecedor> consulta = (TypedQuery<Fornecedor>) em.createNativeQuery("SELECT * FROM fornecedores", Fornecedor.class);
        List<Fornecedor> lista = consulta.getResultList();

        return lista;
    }

    @SuppressWarnings("empty-statement")
    public List<Equipamento> getListEquipamentos() {
        TypedQuery<Equipamento> consulta = (TypedQuery<Equipamento>) em.createNativeQuery("SELECT * FROM equipamento", Equipamento.class);
        List<Equipamento> lista = consulta.getResultList();

        return lista;
    }

    @SuppressWarnings("empty-statement")
    public List<Funcionario> getListFuncionarios() {
        TypedQuery<Funcionario> consulta = (TypedQuery<Funcionario>) em.createNativeQuery("SELECT * FROM funcionario", Funcionario.class);
        List<Funcionario> lista = consulta.getResultList();

        return lista;
    }

    @SuppressWarnings("empty-statement")
    public List<Locacao> getListLocacoes() {
        TypedQuery<Locacao> consulta = (TypedQuery<Locacao>) em.createNativeQuery("SELECT * FROM contrato WHERE tipo = " + Tipo.LOCACAO,Locacao.class);
        List<Locacao> lista = consulta.getResultList();

        return lista;
    }

    @SuppressWarnings("empty-statement")
    public List<Venda> getListVendas() {
        TypedQuery<Venda> consulta = (TypedQuery<Venda>) em.createNativeQuery("SELECT * FROM contrato WHERE tipo = " + Tipo.VENDA, Venda.class);
        List<Venda> lista = consulta.getResultList();

        return lista;
    }
    
    @SuppressWarnings("empty-statement")
    public Usuario getUsuario(String login) {
        TypedQuery<Usuario> query = (TypedQuery<Usuario>) em.createNativeQuery("select * from usuario u where u.login = '"+login+"'", Usuario.class);
        List<Usuario> users = query.getResultList();
        return users.get(0);
    }
    
    @SuppressWarnings("empty-statement")
    public ContratoOperacao getContratoOperacao(Integer id) {
        System.out.println("select * from contrato c where c.id = '"+id+"'");
        TypedQuery<ContratoOperacao> query = (TypedQuery<ContratoOperacao>) em.createNativeQuery("select * from contrato c where c.idcontrato = '"+id+"'", ContratoOperacao.class);
        List<ContratoOperacao> users = query.getResultList();
        return users.get(0);
    }

    public void fechar() {
        em.close();
        emf.close();
    }

}
