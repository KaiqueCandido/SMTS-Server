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

/**
 *
 * @author kaiqu
 */
@Stateless
public class AlunoDao {

    @PersistenceContext(unitName = "SMTS-Server")
    EntityManager em;

    public AlunoDao() {
    }

    public boolean salvar(Aluno aluno) {
        em.persist(aluno);
        return true;
    }

    public boolean excluir(Aluno aluno) {
        em.remove(em.merge(aluno));
        return true;
    }

    public boolean atualizar(Aluno aluno) {
        em.merge(aluno);
        return true;
    }

    public Aluno procurar(Class<Aluno> aluno, Object chave) {
        return em.find(aluno, chave);
    }

    public List<Aluno> listar() {
        Query query = em.createQuery("SELECT a FROM Aluno a ORDER BY a.nome");
        List<Aluno> alunos = query.getResultList();
        if (alunos.size() > 0) {
            return alunos;
        }
        return null;
    }

}
