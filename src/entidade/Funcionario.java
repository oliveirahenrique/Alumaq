package entidade;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import persistencia.DAO;

@Entity
@Table(name="funcionario")
public class Funcionario implements Serializable,BalconistaInterface {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFunc;
    @NotNull
    private String nome;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @NotNull
    private Double salario;
    private Double comissao;
    @NotNull
    private String cpf;
    @NotNull
    private String telefone1;
    private String telefone2 = null;

    @OneToOne
    @JoinColumn(name = "endereco")
    private Endereco enderecoId;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, Date dataNascimento, Endereco endereco, String telefone1, String telefone2, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.enderecoId = endereco;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.salario = salario;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return enderecoId;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.enderecoId = endereco;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the comissao
     */
    public Double getComissao() {
        return comissao;
    }

    /**
     * @param comissao the comissao to set
     */
    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }
    
     @Override
    public List<Locacao> getLocacoes() {
        DAO dao = new DAO();
        List<Locacao> listaLocacao =dao.getListLocacoes() ;
        dao.fechar();

        return listaLocacao;
    }

    @Override
    public void setLocacao(Locacao loc) {
      
    }

    @Override
    public List<Venda> getVendas() {
        DAO dao = new DAO();
        List<Venda> listaVenda = dao.getListVendas();
        dao.fechar();

        return listaVenda;
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
}
