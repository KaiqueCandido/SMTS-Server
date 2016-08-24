package students.trasnaport.manager.system.smts.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import students.trasnaport.manager.system.smts.entity.Administrador;
import students.trasnaport.manager.system.smts.entity.Veiculo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-23T21:33:06")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile ListAttribute<Empresa, Veiculo> veiculos;
    public static volatile ListAttribute<Empresa, Administrador> administradors;
    public static volatile SingularAttribute<Empresa, String> CNPJ;
    public static volatile SingularAttribute<Empresa, Long> id;

}