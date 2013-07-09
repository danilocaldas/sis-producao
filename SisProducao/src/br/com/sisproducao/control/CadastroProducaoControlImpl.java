/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisproducao.control;

import br.com.sisproducao.fabricadeconexao.ConnectionFactoryMysql;
import br.com.sisproducao.model.CadastroProducaoDTO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class CadastroProducaoControlImpl implements CadastroProducaoControl{

    ConnectionFactoryMysql bd = new ConnectionFactoryMysql();
    ControlSql sql = new ControlSql();
    PreparedStatement pstm;
    ResultSet rs;
    
    @Override
    public void save(CadastroProducaoDTO cadProducao) {
        try {
            pstm = bd.conectar().prepareStatement(sql.saveProducao);
            pstm.setString(1, cadProducao.getPrestadores());
            pstm.setString(2, cadProducao.getProcedimentos());
            pstm.setString(3, cadProducao.getProfissionais());
            pstm.setDate(4, (Date) cadProducao.getDataentrada());
            pstm.setDate(5, (Date) cadProducao.getDatadigitacao());
            pstm.setInt(6, cadProducao.getQuantidade());
            pstm.executeUpdate();
            bd.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }

    @Override
    public void delete(CadastroProducaoDTO cadProducao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(CadastroProducaoDTO cadProducao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CadastroProducaoDTO> listar_producao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
