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
import students.trasnaport.manager.system.smts.entity.Veiculo;

/**
 *
 * @author kaiqu
 */
@Stateless
public class VeiculoDao {

    @PersistenceContext(unitName = "SMTS-Server")
    EntityManager em;

    public VeiculoDao() {
    }

    public boolean salvar(Veiculo veiculo) {
        em.persist(veiculo);
        return true;
    }

    public boolean excluir(Veiculo veiculo) {
        em.remove(em.merge(veiculo));
        return true;
    }

    public boolean atualizar(Veiculo veiculo) {
        em.merge(veiculo);
        return true;
    }

    public Veiculo procurar(Class<Veiculo> veiculo, Object chave) {
        return em.find(veiculo, chave);
    }

    public List<Veiculo> listar() {
        Query query = em.createQuery("SELECT v FROM Veiculo v ORDER BY v.placa");
        List<Veiculo> veiculos = query.getResultList();
        if (veiculos.size() > 0) {
            return veiculos;
        }
        return null;
    }

}
