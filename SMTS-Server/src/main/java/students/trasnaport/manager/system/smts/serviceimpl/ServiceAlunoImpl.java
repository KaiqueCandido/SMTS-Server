/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.serviceimpl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import students.trasnaport.manager.system.smts.dao.AlunoDao;
import students.trasnaport.manager.system.smts.entity.Aluno;
import students.trasnaport.manager.system.smts.service.ServiceAluno;

/**
 *
 * @author kaiqu
 */
@Stateless
public class ServiceAlunoImpl implements ServiceAluno {

    @EJB
    private AlunoDao alunoDao;

    @Override
    public boolean addAluno(Aluno aluno) {
        return alunoDao.salvar(aluno);
    }

    @Override
    public boolean removeAluno(Aluno aluno) {
        return alunoDao.excluir(aluno);
    }

    @Override
    public boolean refreshAluno(Aluno aluno) {
        return alunoDao.atualizar(aluno);
    }

    @Override
    public Aluno searchAluno(Class<Aluno> entidade, Object key) {
        return alunoDao.procurar(entidade, key);
    }

    @Override
    public List<Aluno> listarAlunos() {
        return alunoDao.listar();
    }
}
