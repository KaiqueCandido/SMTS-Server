/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.serviceimpl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import students.trasnaport.manager.system.smts.dao.VeiculoDao;
import students.trasnaport.manager.system.smts.entity.Veiculo;
import students.trasnaport.manager.system.smts.service.ServiceVeiculo;

/**
 *
 * @author kaiqu
 */
@Stateless
public class ServiceVeiculoImpl implements ServiceVeiculo {

    @EJB
    private VeiculoDao veiculoDao;

    @Override
    public boolean addVeiculo(Veiculo veiculo) {
        return veiculoDao.salvar(veiculo);
    }

    @Override
    public boolean removeVeiculo(Veiculo veiculo) {
        return veiculoDao.excluir(veiculo);
    }

    @Override
    public boolean refreshVeiculo(Veiculo veiculo) {
        return veiculoDao.atualizar(veiculo);
    }

    @Override
    public Veiculo searchVeiculo(Class<Veiculo> entidade, Object key) {
        return veiculoDao.procurar(entidade, key);
    }

    @Override
    public List<Veiculo> listarVeiculo() {
        return veiculoDao.listar();
    }

}
