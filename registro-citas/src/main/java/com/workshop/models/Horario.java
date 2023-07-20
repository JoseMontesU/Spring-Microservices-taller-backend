package com.workshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@SqlResultSetMapping(
        name = "horariosMapping",
        classes = {
                @ConstructorResult(
                    targetClass = HorariosData.class,
                        columns = {
                            @ColumnResult(name = "hora", type = LocalTime.class),
                            @ColumnResult(name = "user_id")
                        }
                )
        }
)
@NamedNativeQuery(
        name = "Horario.getAllHorarios",
        query = "select h.hora, h.user_id from horarios h\n" +
                " inner join medico_especialidad m on m.user_id=h.user_id\n" +
                " inner join especialidades e on  m.especialidades_id=e.id\n" +
                " where h.fecha='2023-05-25' and h.user_id=:medico_id and h.disponible=:disponible",
        resultSetMapping = "horariosMapping",
        resultClass = HorariosData.class
)

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "horarios")
public class Horario {
    @Id
    Long id;
    LocalDate fecha;
    LocalTime hora;
    String user_id;
    String disponible;
}
