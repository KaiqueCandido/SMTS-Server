/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.serviceimpl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import students.trasnaport.manager.system.smts.dao.MotoristaDao;
import students.trasnaport.manager.system.smts.entity.Motorista;
import students.trasnaport.manager.system.smts.service.ServiceMotorista;

/**
 *
 * @author kaiqu
 */
@Stateless
public class ServiceMotoristaImpl implements ServiceMotorista {

    @EJB
    private MotoristaDao motoristaDao;

    @Override
    public boolean addMotorista(Motorista motorista) {
        return motoristaDao.salvar(motorista);
    }

    @Override
    public boolean removeMotorista(Motorista motorista) {
        return motoristaDao.excluir(motorista);
    }

    @Override
    public boolean refreshMotorista(Motorista motorista) {
        return motoristaDao.atualizar(motorista);
    }

    @Override
    public Motorista searchMotorista(Class<Motorista> entidade, Object key) {
        return motoristaDao.procurar(entidade, key);
    }

    @Override
    public List<Motorista> listarMotoristas() {
        return motoristaDao.listar();
    }
}
