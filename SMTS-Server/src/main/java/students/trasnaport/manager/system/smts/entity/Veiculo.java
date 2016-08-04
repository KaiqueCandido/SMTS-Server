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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kaiqu
 */
@XmlRootElement
@Entity
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String placa;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Motorista> motoristas;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Aluno> alunos;
    @OneToMany
    private List<PontoDeParada> rota;

    public Veiculo() {
    }

    public Veiculo(String placa, List<Motorista> motoristas, List<Aluno> alunos, List<PontoDeParada> rota) {
        this.placa = placa;
        this.motoristas = motoristas;
        this.alunos = alunos;
        this.rota = rota;
    }

    public Veiculo(long id, String placa, List<Motorista> motoristas, List<Aluno> alunos, List<PontoDeParada> rota) {
        this.id = id;
        this.placa = placa;
        this.motoristas = motoristas;
        this.alunos = alunos;
        this.rota = rota;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(List<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<PontoDeParada> getRota() {
        return rota;
    }

    public void setRota(List<PontoDeParada> rota) {
        this.rota = rota;
    }

}
