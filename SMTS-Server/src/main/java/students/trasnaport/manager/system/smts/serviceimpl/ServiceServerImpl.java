/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.serviceimpl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import students.trasnaport.manager.system.smts.dao.ServiceDao;
import students.trasnaport.manager.system.smts.entity.Pessoa;
import students.trasnaport.manager.system.smts.service.ServiceServer;

/**
 *
 * @author kaiqu
 */
@Stateless
public class ServiceServerImpl implements ServiceServer {

    @EJB
    private ServiceDao serviceDao;

    @Override
    public Pessoa login(String login, String senha) {
        return serviceDao.login(login, senha);
    }

    
}
