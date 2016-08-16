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
import students.trasnaport.manager.system.smts.entity.Login;
import students.trasnaport.manager.system.smts.entity.Pessoa;
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
    public Pessoa login(Login login) {
        return serviceServer.login(login.getLogin(), login.getSenha());
    }

}
