package students.trasnaport.manager.system.smts.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import students.trasnaport.manager.system.smts.entity.Empresa;
import students.trasnaport.manager.system.smts.entity.Login;
import students.trasnaport.manager.system.smts.entity.Pessoa;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-23T21:33:06")
@StaticMetamodel(Administrador.class)
public class Administrador_ { 

    public static volatile ListAttribute<Administrador, Pessoa> administradores;
    public static volatile SingularAttribute<Administrador, Empresa> prefeitura;
    public static volatile SingularAttribute<Administrador, Long> id;
    public static volatile SingularAttribute<Administrador, Login> login;

}