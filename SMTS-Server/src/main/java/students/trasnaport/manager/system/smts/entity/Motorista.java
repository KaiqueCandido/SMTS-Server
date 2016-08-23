/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import students.trasnaport.manager.system.smts.enums.Tipo_De_Pessoa;

/**
 *
 * @author kaiqu
 */
@XmlRootElement
@Entity
public class Motorista extends Pessoa implements Serializable {

    private String cnh;
    @ManyToMany(mappedBy = "motoristas", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Veiculo> veiculos;

    public Motorista() {
    }

    public Motorista(String cnh, List<Veiculo> veiculos, String nome, String sobreNome, int idade, String rg, String cpf, Tipo_De_Pessoa tipo, String avatar, Login login) {
        super(nome, sobreNome, idade, rg, cpf, tipo, avatar, login);
        this.cnh = cnh;
        this.veiculos = veiculos;
    }

    public Motorista(String cnh, List<Veiculo> veiculos, long id, String nome, String sobreNome, int idade, String rg, String cpf, Tipo_De_Pessoa tipo, String avatar, Login login) {
        super(id, nome, sobreNome, idade, rg, cpf, tipo, avatar, login);
        this.cnh = cnh;
        this.veiculos = veiculos;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

}
