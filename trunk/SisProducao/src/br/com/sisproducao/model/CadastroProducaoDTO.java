/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisproducao.model;

import java.util.Date;

/**
 *
 * @author Danilo
 */
public class CadastroProducaoDTO {

    private long id;
    private String prestadores;
    private String procedimentos;
    private String profissionais;
    private Date dataentrada;
    private Date datadigitacao;
    private Integer quantidade;

    public CadastroProducaoDTO(long id, String prestadores, String procedimentos, String profissionais, Date dataentrada, Date datadigitacao, Integer quantidade) {
        this.id = id;
        this.prestadores = prestadores;
        this.procedimentos = procedimentos;
        this.profissionais = profissionais;
        this.dataentrada = dataentrada;
        this.datadigitacao = datadigitacao;
        this.quantidade = quantidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrestadores() {
        return prestadores;
    }

    public void setPrestadores(String prestadores) {
        this.prestadores = prestadores;
    }

    public String getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(String procedimentos) {
        this.procedimentos = procedimentos;
    }

    public String getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(String profissionais) {
        this.profissionais = profissionais;
    }

    public Date getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(Date dataentrada) {
        this.dataentrada = dataentrada;
    }

    public Date getDatadigitacao() {
        return datadigitacao;
    }

    public void setDatadigitacao(Date datadigitacao) {
        this.datadigitacao = datadigitacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
