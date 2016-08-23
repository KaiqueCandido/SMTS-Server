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
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kaiqu
 */
@Entity
@XmlRootElement
public class Prefeitura implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String CNPJ;
    @OneToMany(mappedBy = "prefeitura", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Administrador> administradors;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Veiculo> veiculos;

    public Prefeitura() {
    }

    public Prefeitura(String CNPJ, List<Administrador> administradors, List<Veiculo> veiculos) {
        this.CNPJ = CNPJ;
        this.administradors = administradors;
        this.veiculos = veiculos;
    }

    public Prefeitura(long id, String CNPJ, List<Administrador> administradors, List<Veiculo> veiculos) {
        this.id = id;
        this.CNPJ = CNPJ;
        this.administradors = administradors;
        this.veiculos = veiculos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public List<Administrador> getAdministradors() {
        return administradors;
    }

    public void setAdministradors(List<Administrador> administradors) {
        this.administradors = administradors;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

}
