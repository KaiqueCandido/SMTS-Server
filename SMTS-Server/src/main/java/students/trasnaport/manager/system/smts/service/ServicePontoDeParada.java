/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.service;

import java.util.List;
import students.trasnaport.manager.system.smts.entity.PontoDeParada;

/**
 *
 * @author kaiqu
 */
public interface ServicePontoDeParada {

    public boolean addPontoDeParada(PontoDeParada pontoDeParada);

    public boolean removePontoDeParada(PontoDeParada pontoDeParada);

    public boolean refreshPontoDeParada(PontoDeParada pontoDeParada);

    public PontoDeParada searchPontoDeParada(Class<PontoDeParada> entidade, Object key);

    public List<PontoDeParada> listarPontoDeParada();

}
