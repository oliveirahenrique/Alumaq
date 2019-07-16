/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import persistencia.DAO;

/**
 *
 * @author Pichau
 */
public interface Controller {
    final DAO dao = new DAO();
}
