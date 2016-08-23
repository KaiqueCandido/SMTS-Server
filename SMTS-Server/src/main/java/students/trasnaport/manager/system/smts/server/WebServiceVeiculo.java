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
import javax.ws.rs.core.Response;
import students.trasnaport.manager.system.smts.entity.Aluno;
import students.trasnaport.manager.system.smts.entity.Login;
import students.trasnaport.manager.system.smts.entity.Motorista;
import students.trasnaport.manager.system.smts.entity.PontoDeParada;
import students.trasnaport.manager.system.smts.entity.Veiculo;
import students.trasnaport.manager.system.smts.enums.Tipo_De_Pessoa;
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
        Veiculo veiculo = new Veiculo("NQQ-7234", new ArrayList<Motorista>(), new ArrayList<Aluno>(), new ArrayList<PontoDeParada>());        
        serviceVeiculo.addVeiculo(veiculo);
        return veiculo;

    }
}
