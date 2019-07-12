package testePersistencia;

import persistencia.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class TesteDAO {

  public static void main(String[] args) {

    DAO dao = new DAO();
               
    
    
    System.out.println("Clientes cadastrados");
    
    System.out.println("Cliente 3 excluido");
 
  
    dao.fechar();

    
     
  
   
  }
}