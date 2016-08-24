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
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import students.trasnaport.manager.system.smts.entity.Aluno;
import students.trasnaport.manager.system.smts.entity.Login;
import students.trasnaport.manager.system.smts.entity.Motorista;
import students.trasnaport.manager.system.smts.entity.PontoDeParada;
import students.trasnaport.manager.system.smts.entity.Veiculo;
import students.trasnaport.manager.system.smts.enums.Tipo_De_Pessoa;
import students.trasnaport.manager.system.smts.service.ServiceAluno;

/**
 *
 * @author kaiqu
 */
@Stateless
@Path(value = "aluno")
public class WebServiceAluno {

    @EJB
    private ServiceAluno serviceAluno;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addAluno(Aluno aluno) {
        serviceAluno.addAluno(aluno);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Aluno> listAlunos() {
        return serviceAluno.listarAlunos();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Aluno addAluno() {
        Aluno aluno = new Aluno("20122201.10335", "Kaique", "Candido", 22, "3.702.902", "097.507.454-77", Tipo_De_Pessoa.ALUNO, "Avatar", new Login("kaique", "123"));
        serviceAluno.addAluno(aluno);
        return aluno;

    }
}
