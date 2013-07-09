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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class CadastroControlImpl implements CadastroControl {

    ControlSql sql = new ControlSql();
    ConnectionFactoryMysql bd = new ConnectionFactoryMysql();
    PreparedStatement pstm;
    ResultSet rs;

    @Override
    public void save(Prestador prestador) {
        try {
            pstm = bd.conectar().prepareCall(sql.savePrestadores);
            pstm.setString(1, prestador.getNome());
            pstm.executeUpdate();
            bd.desconectar();
        } catch (SQLException ex) {
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
        try {
            pstm = bd.conectar().prepareCall(sql.saveProcedimentos);
            pstm.setString(1, procedimento.getNome());
            pstm.executeUpdate();
            bd.desconectar();
        } catch (SQLException ex) {
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
        try {
            pstm = bd.conectar().prepareStatement(sql.saveProfissionais);
            pstm.setString(1, profissional.getNome());
            pstm.executeUpdate();
            bd.desconectar();
        } catch (SQLException ex) {
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

    @Override
    public List<Prestador> lista_prestador(String nome, int id) {
        List<Prestador> prestadores = new ArrayList();
        try {
            pstm = bd.conectar().prepareStatement(sql.selectPrestadores);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            Prestador pre;
            while (rs.next()) {
                pre = new Prestador(id, nome);
                pre.setNome(rs.getString("nome"));
                prestadores.add(pre);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os Prestadores!" + ex);
        }
        return prestadores;
    }

    @Override
    public List<Procedimento> lista_procedimento(String nome, int id) {
        List<Procedimento> procedimentos = new ArrayList();
        try {
            pstm = bd.conectar().prepareStatement(sql.selectProcedimentos);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            Procedimento proc;
            while (rs.next()) {
                proc = new Procedimento(id, nome);
                proc.setNome(rs.getString("nome"));
                procedimentos.add(proc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os Procedimentos!" + ex);

        }
        return procedimentos;
    }

    @Override
    public List<Profissional> lista_profissional(String nome, int id) {
        List<Profissional> profissionais = new ArrayList();
        try {
            pstm = bd.conectar().prepareStatement(sql.selectProfissionais);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            Profissional pro;
            while (rs.next()) {
                pro = new Profissional(id, nome);
                pro.setNome(rs.getString("nome"));
                profissionais.add(pro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os Profissionais!" + ex);
        }
        return profissionais;
    }
}
