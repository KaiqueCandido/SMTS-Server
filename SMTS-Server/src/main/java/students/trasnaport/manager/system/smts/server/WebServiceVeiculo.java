/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.server;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import students.trasnaport.manager.system.smts.entity.Aluno;
import students.trasnaport.manager.system.smts.entity.Motorista;
import students.trasnaport.manager.system.smts.entity.PontoDeParada;
import students.trasnaport.manager.system.smts.entity.Veiculo;
import students.trasnaport.manager.system.smts.service.ServiceAluno;
import students.trasnaport.manager.system.smts.service.ServiceMotorista;
import students.trasnaport.manager.system.smts.service.ServicePontoDeParada;
import students.trasnaport.manager.system.smts.service.ServiceVeiculo;

/**
 *
 * @author kaiqu
 */
@Stateless
@Path(value = "veiculo")
public class WebServiceVeiculo {

    @EJB
    private ServiceVeiculo serviceVeiculo;

    @EJB
    private ServiceAluno serviceAluno;

    @EJB
    private ServicePontoDeParada servicePontoDeParada;

    @EJB
    private ServiceMotorista serviceMotorista;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addVeiculo(Veiculo veiculo) {
        serviceVeiculo.addVeiculo(veiculo);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> listVeiculos() {
        return serviceVeiculo.listarVeiculo();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Veiculo addVeiculo() {
        Veiculo veiculo = new Veiculo("NQQ-7234", 50);
        serviceVeiculo.addVeiculo(veiculo);
        return veiculo;

    }

//    @PUT
//    @Path("{idVeiculo}/aluno/{idAluno}")
//    public void addAlunoNoVeiculo(
//            @PathParam("idVeiculo") long idVeiculo,
//            @PathParam("idAluno") long idAluno) {
//
//        Veiculo veiculo = serviceVeiculo.searchVeiculo(Veiculo.class, idVeiculo);
//        Aluno aluno = serviceAluno.searchAluno(Aluno.class, idAluno);
//
//        veiculo.addAluno(aluno);
//        serviceVeiculo.refreshVeiculo(veiculo);
//    }
//    @PUT
//    @Path("{idVeiculo}/pontoDeParada/{idPontoDeParada}")
//    public void addPontoDeParadaNoVeiculo(
//            @PathParam("idVeiculo") long idVeiculo,
//            @PathParam("idPontoDeParada") long idPontoDeParada) {
//
//        Veiculo veiculo = serviceVeiculo.searchVeiculo(Veiculo.class, idVeiculo);
//        PontoDeParada pontoDeParada = servicePontoDeParada.searchPontoDeParada(PontoDeParada.class, idPontoDeParada);        
//
//        veiculo.addPontoDeParada(pontoDeParada);
//        serviceVeiculo.refreshVeiculo(veiculo);
//    }
    @PUT
    @Path("{idVeiculo}/motorista/{idMotorista}")
    public void addPontoDeParadaNoVeiculo(
            @PathParam("idVeiculo") long idVeiculo,
            @PathParam("idMotorista") long idMotorista) {

        Veiculo veiculo = serviceVeiculo.searchVeiculo(Veiculo.class, idVeiculo);
        Motorista motorista = serviceMotorista.searchMotorista(Motorista.class, idMotorista);

        veiculo.addMotorista(motorista);
        serviceVeiculo.refreshVeiculo(veiculo);
    }
}
