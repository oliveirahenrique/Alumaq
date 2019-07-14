package testePersistencia;

import entidade.Cliente;
import persistencia.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class TesteDAO {

    public static void main(String[] args) {

        DAO dao = new DAO();

        Cliente c1 = new Cliente("Henrique", "Masculino", "16/04/1994", "58", "33731730", null, "Capitólio-MG", "Augusto Theodoro,88");
        Cliente c2 = new Cliente("Nathalia", "Feminio", "16/04/1994", "52", "991298585", null, "Mogimirim-MG", " Afonso Arinos,256");
        Cliente c3 = new Cliente("Roberval", "Masculino", "16/04/1994", "28", "778956", null, "São Paulo-MG", "Chuca,85");
        Cliente c4 = new Cliente("Henrique", "Masculino", "16/04/1994", "78", "86", null, "Rio de Janeiro-MG", "Augusto Theodoro,88");

        dao.cadastrar(c1);
        dao.cadastrar(c2);
        dao.cadastrar(c3);
        dao.cadastrar(c4);

        System.out.println("Clientes cadastrados");

        dao.remover(c4);

        System.out.println("Cliente 4 excluido");
        
        dao.fechar();

    }
}
