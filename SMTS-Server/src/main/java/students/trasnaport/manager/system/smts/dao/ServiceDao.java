/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import students.trasnaport.manager.system.smts.entity.Aluno;
import students.trasnaport.manager.system.smts.entity.Motorista;
import students.trasnaport.manager.system.smts.entity.Pessoa;

/**
 *
 * @author kaiqu
 */
@Stateless
public class ServiceDao {

    @PersistenceContext(unitName = "SMTS-Server")
    EntityManager em;

    public ServiceDao() {
    }

    public Pessoa login(String login, String senha) {
        Query query = em.createQuery("SELECT p FROM Pessoa p WHERE p.login.login = :login AND p.login.senha = :senha");
        
        query.setParameter("login", login);
        query.setParameter("senha", senha);

        List<Pessoa> pessoas = query.getResultList();

        if (pessoas.size() > 0) {                                    
            return pessoas.get(0);
        }
        return null;
    }

}
