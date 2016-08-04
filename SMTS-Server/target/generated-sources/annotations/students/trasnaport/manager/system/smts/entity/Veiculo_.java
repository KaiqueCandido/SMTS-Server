package students.trasnaport.manager.system.smts.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import students.trasnaport.manager.system.smts.entity.Aluno;
import students.trasnaport.manager.system.smts.entity.Motorista;
import students.trasnaport.manager.system.smts.entity.PontoDeParada;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-04T11:20:20")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ { 

    public static volatile ListAttribute<Veiculo, Motorista> motoristas;
    public static volatile ListAttribute<Veiculo, Aluno> alunos;
    public static volatile SingularAttribute<Veiculo, Long> id;
    public static volatile SingularAttribute<Veiculo, String> placa;
    public static volatile ListAttribute<Veiculo, PontoDeParada> rota;

}