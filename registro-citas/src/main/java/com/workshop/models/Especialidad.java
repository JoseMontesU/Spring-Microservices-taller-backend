package com.workshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "medicosMapping",
        classes = {
                @ConstructorResult(
                        targetClass = MedicosData.class,
                        columns = {
                                @ColumnResult(name = "FIRST_NAME"),
                                @ColumnResult(name = "LAST_NAME"),
                                @ColumnResult(name = "user_id")
                        }
                )
        }
)

@NamedNativeQuery(
        name = "Especialidad.getAllMedicos",
        query = "select distinct u.FIRST_NAME, u.LAST_NAME,me.user_id from especialidades e\n" +
                " inner join medico_especialidad me on e.id = me.especialidades_id\n" +
                " inner join USER_ENTITY u on me.user_id = u.ID\n" +
                " inner join horarios h on u.ID = h.user_id\n" +
                " where e.nombre =:especialidad and h.fecha =:fecha",
        resultSetMapping = "medicosMapping",
        resultClass = MedicosData.class
)

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "especialidades")
public class Especialidad {
    @Id
    Long id;
    String name;
}
