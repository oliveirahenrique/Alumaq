/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Cliente;
import entidade.Fornecedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class DAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoTrabPU");
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

//    public List<Conta> getListContas(){
//        Query consulta = em.createQuery("SELECT c FROM Conta c");
//       List<Conta> lista = (List<Conta>)consulta.getResultList(); 
//       
//       return lista;  
//    }
    public void fechar() {
        em.close();
        emf.close();
    }

}
