/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisproducao.control;

import br.com.sisproducao.model.CadastroProducao;

/**
 *
 * @author Danilo
 */
public interface CadastroProducaoControl {
    public void save(CadastroProducao cadProducao);
    public void delete(CadastroProducao cadProducao);
    public void update(CadastroProducao cadProducao);
}
