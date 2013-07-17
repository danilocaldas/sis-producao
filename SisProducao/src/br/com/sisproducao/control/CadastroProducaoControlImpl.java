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
import java.util.ArrayList;
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
            JOptionPane.showMessageDialog(null, 
                    "Cadastro Realizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro na base de dados. "
                    + "Não foi possivel salvar o registro!"+ex);
        }
    
    }

    @Override
    public void delete(CadastroProducaoDTO cadProducao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(CadastroProducaoDTO cadProducao) {
        try{
        pstm = bd.conectar().prepareStatement(sql.updateProducao);
        pstm.setString(1, cadProducao.getPrestadores());
        pstm.setString(2, cadProducao.getProcedimentos());
        //pstm.setString(3, cadProducao.getProfissionais());
        pstm.setDate(3, (Date)cadProducao.getDataentrada());
        pstm.setDate(4, (Date)cadProducao.getDatadigitacao());
        pstm.setInt(5, cadProducao.getQuantidade());
        pstm.setLong(6, cadProducao.getId());
        pstm.executeUpdate();
        bd.desconectar();
        JOptionPane.showMessageDialog(null, 
                "Registro alterado com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,
                    "Erro na base de dados."
                    + " Não foi possivel alterar o registro!"+ex);
        }
    }

    @Override
    public List<CadastroProducaoDTO> listar_producao(int id, String prestadores, String procedimentos, String profissionais
            ,Date dataentrada, Date datadigitacao, int quantidade) {
        List<CadastroProducaoDTO> producao = new ArrayList();
        try {
            pstm = bd.conectar().prepareStatement(sql.selectProducao);
            pstm.setString(1, profissionais);
            rs = pstm.executeQuery();
            CadastroProducaoDTO pro;
            while(rs.next()){
                pro = new CadastroProducaoDTO(id, prestadores, procedimentos, profissionais, dataentrada, datadigitacao, quantidade);
                pro.setId(rs.getInt("id"));
                pro.setPrestadores(rs.getString("prestadores"));
                pro.setProcedimentos(rs.getString("procedimentos"));
               // pro.setProfissionais(rs.getString("profissionais"));
                pro.setDataentrada(rs.getDate("dataentrada"));
                pro.setDatadigitacao(rs.getDate("datadigitacao"));
                pro.setQuantidade(rs.getInt("quantidade"));
                producao.add(pro);
                
            }
            bd.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, 
                    "Erro na base de dados. "
                    + "Não foi possivel listar a produção!"+ex);
        }
        
    return producao;
    }

}
