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
import javax.ws.rs.core.Response;
import students.trasnaport.manager.system.smts.entity.PontoDeParada;
import students.trasnaport.manager.system.smts.entity.Login;
import students.trasnaport.manager.system.smts.entity.Ponto;
import students.trasnaport.manager.system.smts.enums.Tipo_De_Pessoa;
import students.trasnaport.manager.system.smts.service.ServicePontoDeParada;

/**
 *
 * @author kaiqu
 */
@Stateless
@Path(value = "pontoDeParada")
public class WebServicePontoDeParada {

    @EJB
    private ServicePontoDeParada servicePontoDeParada;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPontoDeParada(PontoDeParada pontoDeParada) {
        servicePontoDeParada.addPontoDeParada(pontoDeParada);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PontoDeParada> listPontosDeParada() {
        return servicePontoDeParada.listarPontoDeParada();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public PontoDeParada addPontoDeParada() {
        PontoDeParada pontoDeParada = new PontoDeParada("IFPB", "Antiga escola Tecnica de Cajazeiras", "Jardim Oasis", new Ponto("2000", "2000"));        
        servicePontoDeParada.addPontoDeParada(pontoDeParada);
        return pontoDeParada;

    }
}
