/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.service;

import java.util.List;
import students.trasnaport.manager.system.smts.entity.Veiculo;

/**
 *
 * @author kaiqu
 */
public interface ServiceVeiculo {

    public boolean addVeiculo(Veiculo veiculo);

    public boolean removeVeiculo(Veiculo veiculo);

    public boolean refreshVeiculo(Veiculo veiculo);

    public Veiculo searchVeiculo(Class<Veiculo> entidade, Object key);

    public List<Veiculo> listarVeiculo();

}
