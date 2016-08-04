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
import students.trasnaport.manager.system.smts.entity.Motorista;

/**
 *
 * @author kaiqu
 */
@Stateless
public class MotoristaDao {

    @PersistenceContext(unitName = "SMTS-Server")
    EntityManager em;

    public MotoristaDao() {
    }

    public boolean salvar(Motorista  motorista) {
        em.persist(motorista);
        return true;
    }

    public boolean excluir(Motorista motorista) {
        em.remove(em.merge(motorista));
        return true;
    }

    public boolean atualizar(Motorista motorista) {
        em.merge(motorista);
        return true;
    }

    public Motorista procurar(Class<Motorista> motorista, Object chave) {
        return em.find(motorista, chave);
    }

    public List<Motorista> listar() {
        Query query = em.createQuery("SELECT m FROM Motorista m ORDER BY m.nome");
        List<Motorista> motoristas = query.getResultList();
        if (motoristas.size() > 0) {
            return motoristas;
        }
        return null;
    }

}
