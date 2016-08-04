/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kaiqu
 */
@XmlRootElement
@Entity
public class Motorista extends Pessoa implements Serializable {

    private String cnh;

    public Motorista() {
    }

    public Motorista(String nome, String sobreNome, int idade, String rg, String cpf, String cnh) {
        super(nome, sobreNome, idade, rg, cpf);
        this.cnh = cnh;
    }

    public Motorista(long id, String nome, String sobreNome, int idade, String rg, String cpf, String cnh) {
        super(id, nome, sobreNome, idade, rg, cpf);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

}
