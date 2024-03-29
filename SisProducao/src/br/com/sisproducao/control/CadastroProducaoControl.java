/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisproducao.control;

import br.com.sisproducao.model.CadastroProducaoDTO;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Danilo
 */
public interface CadastroProducaoControl {
    public void save(CadastroProducaoDTO cadProducao);
    public void delete(CadastroProducaoDTO cadProducao);
    public void update(CadastroProducaoDTO cadProducao);
    public List<CadastroProducaoDTO> listar_producao(int id, String prestadores, String procedimentos, 
            String profissionais, Date dataentrada, Date datadigitacao, int quantidade);
    
}
