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
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;
import students.trasnaport.manager.system.smts.enums.Tipo_De_Pessoa;

/**
 *
 * @author kaiqu
 */
@XmlRootElement
@Entity
public class Aluno extends Pessoa implements Serializable {

    private String matricula;    

    public Aluno() {
    }

    public Aluno(String matricula, String nome, String sobreNome, int idade, String rg, String cpf, Tipo_De_Pessoa tipo, String avatar, Login login) {
        super(nome, sobreNome, idade, rg, cpf, tipo, avatar, login);
        this.matricula = matricula;        
    }

    public Aluno(String matricula, long id, String nome, String sobreNome, int idade, String rg, String cpf, Tipo_De_Pessoa tipo, String avatar, Login login) {
        super(id, nome, sobreNome, idade, rg, cpf, tipo, avatar, login);
        this.matricula = matricula;        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }   

}
