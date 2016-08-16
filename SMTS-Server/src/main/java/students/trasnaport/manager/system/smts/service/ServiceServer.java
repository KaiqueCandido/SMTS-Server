/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students.trasnaport.manager.system.smts.service;

import students.trasnaport.manager.system.smts.entity.Pessoa;

/**
 *
 * @author kaiqu
 */
public interface ServiceServer {    

    public Pessoa login(String login, String senha);   

}
