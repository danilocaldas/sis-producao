/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisproducao.control;

import br.com.sisproducao.fabricadeconexao.ConnectionFactoryMysql;
import br.com.sisproducao.model.Prestador;
import br.com.sisproducao.model.Procedimento;
import br.com.sisproducao.model.Profissional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class CadastroControlImpl implements CadastroControl{
    
    ControlSql sql = new ControlSql();
    ConnectionFactoryMysql bd = new ConnectionFactoryMysql();
    PreparedStatement pstm ;
    ResultSet rs;
    

    @Override
    public void save(Prestador prestador) {
        try{
        pstm = bd.conectar().prepareCall(sql.savePrestadores);
        pstm.setString(1, prestador.getNome());
        pstm.executeUpdate();
        bd.desconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @Override
    public void delete(Prestador prestador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Prestador prestador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Procedimento procedimento) {
        try{
        pstm = bd.conectar().prepareCall(sql.saveProcedimentos);
        pstm.setString(1, procedimento.getNome());
        pstm.executeUpdate();
        bd.desconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @Override
    public void delete(Procedimento procedimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Procedimento procedimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Profissional profissional) {
        try{
            pstm = bd.conectar().prepareStatement(sql.saveProfissionais);
            pstm.setString(1, profissional.getNome());
            pstm.executeUpdate();
            bd.desconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @Override
    public void delete(Profissional profissional) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Profissional profissional) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
