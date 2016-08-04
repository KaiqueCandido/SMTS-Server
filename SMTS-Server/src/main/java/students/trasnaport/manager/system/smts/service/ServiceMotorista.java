/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.service;

import java.util.List;
import students.trasnaport.manager.system.smts.entity.Motorista;

/**
 *
 * @author kaiqu
 */
public interface ServiceMotorista {

    public boolean addMotorista(Motorista motorista);

    public boolean removeMotorista(Motorista motorista);

    public boolean refreshMotorista(Motorista motorista);

    public Motorista searchMotorista(Class<Motorista> entidade, Object key);

    public List<Motorista> listarMotoristas();

}
