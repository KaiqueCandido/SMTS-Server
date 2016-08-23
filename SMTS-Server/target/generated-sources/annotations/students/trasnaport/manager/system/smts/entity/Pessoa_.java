package students.trasnaport.manager.system.smts.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import students.trasnaport.manager.system.smts.entity.Login;
import students.trasnaport.manager.system.smts.enums.Tipo_De_Pessoa;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-23T11:00:41")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, Integer> idade;
    public static volatile SingularAttribute<Pessoa, Tipo_De_Pessoa> tipo;
    public static volatile SingularAttribute<Pessoa, String> rg;
    public static volatile SingularAttribute<Pessoa, String> cpf;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, Long> id;
    public static volatile SingularAttribute<Pessoa, Login> login;
    public static volatile SingularAttribute<Pessoa, String> sobreNome;

}