/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kaiqu
 */
@XmlRootElement
@Entity
public class PontoDeParada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String descricao;
    private String referencia;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Ponto ponto;

    public PontoDeParada() {
    }

    public PontoDeParada(String nome, String descricao, String referencia, Ponto ponto) {
        this.nome = nome;
        this.descricao = descricao;
        this.referencia = referencia;
        this.ponto = ponto;
    }

    public PontoDeParada(long id, String nome, String descricao, String referencia, Ponto ponto) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.referencia = referencia;
        this.ponto = ponto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

}
