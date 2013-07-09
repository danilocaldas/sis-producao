/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisproducao.control;

import br.com.sisproducao.model.Prestador;
import br.com.sisproducao.model.Procedimento;
import br.com.sisproducao.model.Profissional;

/**
 *
 * @author Danilo
 */
public interface CadastroControl {
   
    public void save (Prestador prestador);
    public void delete(Prestador prestador);
    public void update(Prestador prestador);
    
    public void save (Procedimento procedimento);
    public void delete(Procedimento procedimento);
    public void update(Procedimento procedimento);
    
    public void save (Profissional profissional);
    public void delete(Profissional profissional);
    public void update(Profissional profissional);
}
