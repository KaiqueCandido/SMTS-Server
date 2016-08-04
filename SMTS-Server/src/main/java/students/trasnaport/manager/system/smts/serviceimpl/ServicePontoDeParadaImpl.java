/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.serviceimpl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import students.trasnaport.manager.system.smts.dao.PontoDeParadaDao;
import students.trasnaport.manager.system.smts.entity.PontoDeParada;
import students.trasnaport.manager.system.smts.service.ServicePontoDeParada;

/**
 *
 * @author kaiqu
 */
@Stateless
public class ServicePontoDeParadaImpl implements ServicePontoDeParada {

    @EJB
    private PontoDeParadaDao pontoDeParadaDao;

    @Override
    public boolean addPontoDeParada(PontoDeParada pontoDeParada) {
        return pontoDeParadaDao.salvar(pontoDeParada);
    }

    @Override
    public boolean removePontoDeParada(PontoDeParada pontoDeParada) {
        return pontoDeParadaDao.excluir(pontoDeParada);
    }

    @Override
    public boolean refreshPontoDeParada(PontoDeParada pontoDeParada) {
        return pontoDeParadaDao.atualizar(pontoDeParada);
    }

    @Override
    public PontoDeParada searchPontoDeParada(Class<PontoDeParada> entidade, Object key) {
        return pontoDeParadaDao.procurar(entidade, key);
    }

    @Override
    public List<PontoDeParada> listarPontoDeParada() {
        return pontoDeParadaDao.listar();
    }

}
