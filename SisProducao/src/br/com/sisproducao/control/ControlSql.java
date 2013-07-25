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
    String saveProfissionais = "INSERT INTO PROFISSIONAIS (NOME, SENHA) VALUES (?, ?)";
    String savePrestadores = "INSERT INTO PRESTADORES (NOME) VALUES (?)";
    String saveProducao = "INSERT INTO PRODUCAO (PRESTADORES, PROCEDIMENTOS,"
            + " PROFISSIONAIS, DATAENTRADA, DATADIGITACAO, QUANTIDADE) VALUES (?, ?, ?, ?, ?, ?)";
    
    String selectProcedimentos = "SELECT * FROM PROCEDIMENTOS WHERE NOME LIKE ?";
    String selectProfissionais = "SELECT * FROM PROFISSIONAIS WHERE NOME LIKE ?";
    String selectPrestadores = "SELECT * FROM PRESTADORES WHERE NOME LIKE ?";
    String selectProducao = "SELECT * FROM PRODUCAO WHERE PROFISSIONAIS LIKE ? AND DATADIGITACAO LIKE ? AND LIKE ?";
    
    String updateProcedimentos = "UPDATE PROCEDIMENTOS SET NOME = ? WHERE ID = ?";
    String updateProfissionais = "UPDATE PROFISSIONAIS SET NOME = ?, SENHA = ? WHERE ID = ?";
    String updatePrestadores = "UPDATE PRESTADORES SET NOME = ? WHERE ID = ?";
    String updateProducao = "UPDATE PRODUCAO SET PRESTADORES = ?, PROCEDIMENTOS = ?,"
            + "DATAENTRADA = ?, DATADIGITACAO = ?, QUANTIDADE = ?"
            + " WHERE ID = ?";
   
    String somaProducao = "SELECT sum(QUANTIDADE) FROM PRODUCAO WHERE PROFISSIONAIS LIKE ?";
}
