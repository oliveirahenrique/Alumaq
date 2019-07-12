package dominio;

import java.util.List;

public class Funcionario {

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
    private int idFunc;
    private String nome, dataNasc;
    private Endereco endereco;
    private String telefone1;
    private String telefone2;
    private Double salario;  
    private Loja loja = new Loja();
    
    
    public Funcionario(int id, String nome, String dataN, Endereco endereco, String tel, Double sal) {
        idFunc = id;
        this.nome = nome;
        dataNasc = dataN;
        this.endereco = endereco;
        this.telefone1 = tel;
        salario = sal;
    }
    
    public Loja getLoja(){
        return this.loja;
    }



}
