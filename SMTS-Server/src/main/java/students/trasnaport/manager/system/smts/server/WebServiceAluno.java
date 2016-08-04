/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.server;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import students.trasnaport.manager.system.smts.entity.Aluno;
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
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void addAluno(Aluno aluno){
        serviceAluno.addAluno(aluno);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<Aluno> listAlunos() {        
        return serviceAluno.listarAlunos();
    }
}
