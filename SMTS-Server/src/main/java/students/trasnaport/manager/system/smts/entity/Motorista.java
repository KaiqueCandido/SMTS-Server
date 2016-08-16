/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.entity;

import java.io.Serializable;
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

    public Motorista() {
    }

    public Motorista(String cnh, String nome, String sobreNome, int idade, String rg, String cpf, Login login, Tipo_De_Pessoa tipo) {
        super(nome, sobreNome, idade, rg, cpf, login, tipo);
        this.cnh = cnh;
    }

    public Motorista(String cnh, long id, String nome, String sobreNome, int idade, String rg, String cpf, Login login, Tipo_De_Pessoa tipo) {
        super(id, nome, sobreNome, idade, rg, cpf, login, tipo);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

}
