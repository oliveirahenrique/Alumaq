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
import entidade.Tipo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class DAO {

    String factory = "AlumaqNetbeansPU";
    EntityManagerFactory emf = Persistence.createEntityManagerFactory(factory);
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

    public List<Cliente> getListClientes() {
        Query consulta = em.createQuery("SELECT * FROM cliente");
        List<Cliente> lista = (List<Cliente>) consulta.getResultList();

        return lista;
    }

    public List<Fornecedor> getListFornecedores() {
        Query consulta = em.createQuery("SELECT * FROM fornecedores");
        List<Fornecedor> lista = (List<Fornecedor>) consulta.getResultList();

        return lista;
    }

    public List<Equipamento> getListEquipamentos() {
        Query consulta = em.createQuery("SELECT * FROM equipamento");
        List<Equipamento> lista = (List<Equipamento>) consulta.getResultList();

        return lista;
    }

    public List<Funcionario> getListFuncionarios() {
        Query consulta = em.createQuery("SELECT * FROM funcionario");
        List<Funcionario> lista = (List<Funcionario>) consulta.getResultList();

        return lista;
    }

    public List<ContratoOperacao> getListLocacoes() {
        Query consulta = em.createQuery("SELECT * FROM cotrato WHERE tipo = " + Tipo.LOCACAO);
        List<ContratoOperacao> lista = (List<ContratoOperacao>) consulta.getResultList();

        return lista;
    }

    public List<ContratoOperacao> getListVendas() {
        Query consulta = em.createQuery("SELECT * FROM cotrato WHERE tipo = " + Tipo.VENDA);
        List<ContratoOperacao> lista = (List<ContratoOperacao>) consulta.getResultList();

        return lista;
    }

    public void fechar() {
        em.close();
        emf.close();
    }

}
