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

}
