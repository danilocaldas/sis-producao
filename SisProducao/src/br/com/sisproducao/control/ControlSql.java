/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisproducao.control;

/**
 *
 * @author Danilo
 */
public class ControlSql {
    String saveProcedimentos = "INSERT INTO PROCEDIMENTOS (NOME) VALUES (?)";
    String saveProfissionais = "INSERT INTO PROFISSIONAIS (NOME) VALUES (?)";
    String savePrestadores = "INSERT INTO PRESTADORES (NOME) VALUES (?)";
    
    String selectProcedimentos = "SELECT * FROM PROCEDIMENTOS WHERE NOME LIKE ?";
    String selectProfissionais = "SELECT * FROM PROFISSIONAIS WHERE NOME LIKE ?";
    String selectPrestadores = "SELECT * FROM PRESTADORES WHERE NOME LIKE ?";
    
    String saveProducao = "INSERT INTO PRODUCAO (PRESTADORES, PROCEDIMENTOS,"
            + " PROFISSIONAIS, DATAENTRADA, DATADIGITACAO, QUANTIDADE) VALUES (?, ?, ?, ?, ?, ?)";
}
