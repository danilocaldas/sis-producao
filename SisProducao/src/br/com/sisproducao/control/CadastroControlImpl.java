/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisproducao.control;

import br.com.sisproducao.fabricadeconexao.ConnectionFactoryMysql;
import br.com.sisproducao.model.PrestadorDTO;
import br.com.sisproducao.model.ProcedimentoDTO;
import br.com.sisproducao.model.ProfissionalDTO;
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
    public void save(PrestadorDTO prestador) {
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
    public void delete(PrestadorDTO prestador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(PrestadorDTO prestador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(ProcedimentoDTO procedimento) {
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
    public void delete(ProcedimentoDTO procedimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ProcedimentoDTO procedimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(ProfissionalDTO profissional) {
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
    public void delete(ProfissionalDTO profissional) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ProfissionalDTO profissional) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PrestadorDTO> lista_prestador(String nome, int id) {
        List<PrestadorDTO> prestadores = new ArrayList();
        try {
            pstm = bd.conectar().prepareStatement(sql.selectPrestadores);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            PrestadorDTO pre;
            while (rs.next()) {
                pre = new PrestadorDTO(id, nome);
                pre.setNome(rs.getString("nome"));
                prestadores.add(pre);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os Prestadores!" + ex);
        }
        return prestadores;
    }

    @Override
    public List<ProcedimentoDTO> lista_procedimento(String nome, int id) {
        List<ProcedimentoDTO> procedimentos = new ArrayList();
        try {
            pstm = bd.conectar().prepareStatement(sql.selectProcedimentos);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            ProcedimentoDTO proc;
            while (rs.next()) {
                proc = new ProcedimentoDTO(id, nome);
                proc.setNome(rs.getString("nome"));
                procedimentos.add(proc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os Procedimentos!" + ex);

        }
        return procedimentos;
    }

    @Override
    public List<ProfissionalDTO> lista_profissional(String nome, int id) {
        List<ProfissionalDTO> profissionais = new ArrayList();
        try {
            pstm = bd.conectar().prepareStatement(sql.selectProfissionais);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            ProfissionalDTO pro;
            while (rs.next()) {
                pro = new ProfissionalDTO(id, nome);
                pro.setNome(rs.getString("nome"));
                profissionais.add(pro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os Profissionais!" + ex);
        }
        return profissionais;
    }
}
