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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
    private int qtdeAssentos;

    //Pontos de parada do veiculo
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<PontoDeParada> ponstosDeParada;

    //Motoristas que dirigem esse onibus
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Motorista> motoristas;
    
    //Alunos que utilizam esse Onibus
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Aluno> alunos;

    public Veiculo() {
    }

    public Veiculo(String placa, int qtdeAssentos) {
        this.placa = placa;
        this.qtdeAssentos = qtdeAssentos;
        this.ponstosDeParada = new ArrayList<>();
        this.motoristas = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public Veiculo(long id, String placa, int qtdeAssentos) {
        this.id = id;
        this.placa = placa;
        this.qtdeAssentos = qtdeAssentos;
        this.ponstosDeParada = new ArrayList<>();
        this.motoristas = new ArrayList<>();
        this.alunos = new ArrayList<>();
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

    public int getQtdeAssentos() {
        return qtdeAssentos;
    }

    public void setQtdeAssentos(int qtdeAssentos) {
        this.qtdeAssentos = qtdeAssentos;
    }

    public List<PontoDeParada> getPonstosDeParada() {
        return ponstosDeParada;
    }

    public void setPonstosDeParada(List<PontoDeParada> ponstosDeParada) {
        this.ponstosDeParada = ponstosDeParada;
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

    public boolean addPontoDeParada(PontoDeParada pontoDeParada) {
        this.ponstosDeParada.add(pontoDeParada);
        return true;
    }

    public boolean removePontoDeParada(PontoDeParada pontoDeParada) {
        if (ponstosDeParada.contains(pontoDeParada)) {
            this.ponstosDeParada.remove(pontoDeParada);
        }
        return true;
    }

    public boolean addMotorista(Motorista motorista) {
        this.motoristas.add(motorista);
        return true;
    }

    public boolean removeMotorista(Motorista motorista) {
        if (motoristas.contains(motorista)) {
            this.motoristas.remove(motorista);
        }
        return true;
    }

    public boolean addAluno(Aluno aluno) {
        this.alunos.add(aluno);
        return true;
    }

    public boolean removeAluno(Aluno aluno) {
        if (alunos.contains(aluno)) {
            this.alunos.remove(aluno);
        }
        return true;
    }

}
