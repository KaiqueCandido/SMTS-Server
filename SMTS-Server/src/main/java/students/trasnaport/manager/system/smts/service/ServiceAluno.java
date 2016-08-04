/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.service;

import java.util.List;
import students.trasnaport.manager.system.smts.entity.Aluno;

/**
 *
 * @author kaiqu
 */
public interface ServiceAluno {

    public boolean addAluno(Aluno aluno);

    public boolean removeAluno(Aluno aluno);

    public boolean refreshAluno(Aluno aluno);

    public Aluno searchAluno(Class<Aluno> entidade, Object key);

    public List<Aluno> listarAlunos();

}
