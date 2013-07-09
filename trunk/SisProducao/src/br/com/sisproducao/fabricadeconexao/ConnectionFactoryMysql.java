/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisproducao.fabricadeconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *  Classe de conexão com MYSQL 
 * @author Danilo
 */
public class ConnectionFactoryMysql {
    
    public static Connection con;
    public static PreparedStatement pstm;
    public static ResultSet rs;
 
    
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://127.0.0.1/db_producao";
    String user = "root";
   // String password = "";
    String password = "12345";
    
    
    //metodo que conecta ao banco
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não encontrar o Driver");
            ex.printStackTrace();
        } catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao Banco");
        }
        return con;
    }//fim
    
    //metodo que desconecta ao banco
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//fim
    
    /*public static void main(String[] args){
        ConnectionFactoryMysql conectar = new ConnectionFactoryMysql();
        conectar.conectar();
    }*/
    
}
