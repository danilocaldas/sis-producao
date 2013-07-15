/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisproducao.control;

import br.com.sisproducao.model.PrestadorDTO;
import br.com.sisproducao.model.ProcedimentoDTO;
import br.com.sisproducao.model.ProfissionalDTO;
import java.util.List;

/**
 *
 * @author Danilo
 */
public interface CadastroControl {
   //crud prestador
    public void save (PrestadorDTO prestador);
    public void delete(PrestadorDTO prestador);
    public void update(PrestadorDTO prestador);
    public List<PrestadorDTO> lista_prestador(String nome, int id); 
    //crud procedimento
    public void save (ProcedimentoDTO procedimento);
    public void delete(ProcedimentoDTO procedimento);
    public void update(ProcedimentoDTO procedimento);
    public List<ProcedimentoDTO> lista_procedimento(String nome, int id);
    //crud profissional
    public void save (ProfissionalDTO profissional);
    public void delete(ProfissionalDTO profissional);
    public void update(ProfissionalDTO profissional);
    public List<ProfissionalDTO> lista_profissional(String nome, String senha, int id);
}
