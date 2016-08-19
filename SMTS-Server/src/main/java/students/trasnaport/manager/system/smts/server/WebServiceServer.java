/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.server;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import students.trasnaport.manager.system.smts.entity.Aluno;
import students.trasnaport.manager.system.smts.entity.Login;
import students.trasnaport.manager.system.smts.entity.Motorista;
import students.trasnaport.manager.system.smts.entity.Pessoa;
import students.trasnaport.manager.system.smts.enums.Tipo_De_Pessoa;
import students.trasnaport.manager.system.smts.service.ServiceServer;

/**
 *
 * @author kaiqu
 */
@Stateless
@Path(value = "server")
public class WebServiceServer {

    @EJB
    private ServiceServer serviceServer;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(Login login) {
        Pessoa pessoa = serviceServer.login(login.getLogin(), login.getSenha());
        if (pessoa.getTipo().equals(Tipo_De_Pessoa.ALUNO)) {
            Aluno a = (Aluno) pessoa;
            System.out.println(a);
            return Response.ok(a).build();
        } else if (pessoa.getTipo().equals(Tipo_De_Pessoa.MOTORISTA)) {
            Motorista m = (Motorista) pessoa;
            System.out.println(m);
            return Response.ok(m).build();
        }
        return null;
    }

}
