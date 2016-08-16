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
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import students.trasnaport.manager.system.smts.entity.Login;
import students.trasnaport.manager.system.smts.entity.Motorista;
import students.trasnaport.manager.system.smts.enums.Tipo_De_Pessoa;
import students.trasnaport.manager.system.smts.service.ServiceMotorista;

/**
 *
 * @author kaiqu
 */
@Stateless
@Path(value = "motorista")
public class WebServiceMotorista {

    @EJB
    private ServiceMotorista serviceMotorista;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addMotorista(Motorista motorista) {
        serviceMotorista.addMotorista(motorista);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Motorista> listMotorista() {
        return serviceMotorista.listarMotoristas();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Motorista addMotorista() {
        Motorista motorista = new Motorista("123564322", "Judivan", "Henrrique", 40, "1.234.432", "123.345.567-88", new Login("judivan", "123"), Tipo_De_Pessoa.MOTORISTA);
        serviceMotorista.addMotorista(motorista);
        return motorista;

    }
}
