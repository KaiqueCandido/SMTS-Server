/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kaiqu
 */
@Entity
@XmlRootElement
public class Administrador implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Login login;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Prefeitura prefeitura;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Pessoa> administradores;

    public Administrador() {
    }

    public Administrador(Login login, Prefeitura prefeitura, List<Pessoa> administradores) {
        this.login = login;
        this.prefeitura = prefeitura;
        this.administradores = administradores;
    }

    public Administrador(long id, Login login, Prefeitura prefeitura, List<Pessoa> administradores) {
        this.id = id;
        this.login = login;
        this.prefeitura = prefeitura;
        this.administradores = administradores;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Prefeitura getPrefeitura() {
        return prefeitura;
    }

    public void setPrefeitura(Prefeitura prefeitura) {
        this.prefeitura = prefeitura;
    }

    public List<Pessoa> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<Pessoa> administradores) {
        this.administradores = administradores;
    }

}
