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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import students.trasnaport.manager.system.smts.enums.Tipo_De_Pessoa;

/**
 *
 * @author kaiqu
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String sobreNome;
    private int idade;
    private String rg;
    private String cpf;
    @OneToOne(cascade = CascadeType.ALL)
    private Login login;
    private Tipo_De_Pessoa tipo;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobreNome, int idade, String rg, String cpf, Login login, Tipo_De_Pessoa tipo) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.rg = rg;
        this.cpf = cpf;
        this.login = login;
        this.tipo = tipo;
    }

    public Pessoa(long id, String nome, String sobreNome, int idade, String rg, String cpf, Login login, Tipo_De_Pessoa tipo) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.rg = rg;
        this.cpf = cpf;
        this.login = login;
        this.tipo = tipo;
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

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Tipo_De_Pessoa getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_De_Pessoa tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", idade=" + idade + ", rg=" + rg + ", cpf=" + cpf + ", login=" + login + ", tipo=" + tipo + '}';
    }

}
