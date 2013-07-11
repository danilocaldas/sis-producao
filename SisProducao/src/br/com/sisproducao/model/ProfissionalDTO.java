package br.com.sisproducao.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */
public class ProfissionalDTO extends CadastroDTO{

    private String senha;
    
    public ProfissionalDTO(int id, String nome, String senha) {
        super(id, nome);
        this.senha= senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
