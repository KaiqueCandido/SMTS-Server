/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.entity;

import java.io.Serializable;
import java.util.ArrayList;
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
public class Empresa implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    private String CNPJ;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Veiculo> veiculos;
    @OneToMany(mappedBy = "prefeitura", cascade = CascadeType.PERSIST)
    private List<Administrador> administradores;
    
    public Empresa() {
    }
    
    public Empresa(String CNPJ) {
        this.CNPJ = CNPJ;
        this.administradores = new ArrayList<>();
        this.veiculos = new ArrayList<>();
    }
    
    public Empresa(long id, String CNPJ) {
        this.id = id;
        this.CNPJ = CNPJ;
        this.administradores = new ArrayList<>();
        this.veiculos = new ArrayList<>();
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
        return administradores;
    }
    
    public void setAdministradors(List<Administrador> administradors) {
        this.administradores = administradors;
    }
    
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    public boolean addAdministrador(Administrador administrador) {
        this.administradores.add(administrador);
        return true;
    }
    
    public boolean removeAdministrador(Administrador administrador) {
        if (administradores.contains(administrador)) {
            this.administradores.remove(administrador);
        }
        return true;
    }
    
    public boolean addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
        return true;
    }
    
    public boolean removeVeiculo(Veiculo veiculo) {
        if (veiculos.contains(veiculo)) {
            this.veiculos.remove(veiculo);
        }
        return true;
    }
//    administradore
//            veiculos
}
