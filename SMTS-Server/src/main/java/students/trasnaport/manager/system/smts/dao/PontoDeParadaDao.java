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
import students.trasnaport.manager.system.smts.entity.PontoDeParada;

/**
 *
 * @author kaiqu
 */
@Stateless
public class PontoDeParadaDao {

    @PersistenceContext(unitName = "SMTS-Server")
    EntityManager em;

    public PontoDeParadaDao() {
    }

    public boolean salvar(PontoDeParada pontoDeParada) {
        em.persist(pontoDeParada);
        return true;
    }

    public boolean excluir(PontoDeParada pontoDeParada) {
        em.remove(em.merge(pontoDeParada));
        return true;
    }

    public boolean atualizar(PontoDeParada pontoDeParada) {
        em.merge(pontoDeParada);
        return true;
    }

    public PontoDeParada procurar(Class<PontoDeParada> pontoDeParada, Object chave) {
        return em.find(pontoDeParada, chave);
    }

    public List<PontoDeParada> listar() {
        Query query = em.createQuery("SELECT pdp FROM PontoDeParada pdp ORDER BY pdp.nome");
        List<PontoDeParada> pontoDeParadas = query.getResultList();
        if (pontoDeParadas.size() > 0) {
            return pontoDeParadas;
        }
        return null;
    }

}
