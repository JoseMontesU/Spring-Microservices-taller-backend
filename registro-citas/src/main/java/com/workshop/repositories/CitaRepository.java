package com.workshop.repositories;

import com.workshop.models.Cita;
import com.workshop.models.MedicoEspecialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CitaRepository extends JpaRepository<Cita,Long> {

//    EntityManager entityManager = new EntityManager();

    List<Cita> findCitasByPacienteIdOrderByDateDesc(String pacienteId);

//    @Query(value = "select u.FIRST_NAME, u.LAST_NAME,e.nombre from USER_ENTITY u " +
//            "inner join medico_especialidad me on u.ID = me.user_id " +
//            "inner join especialidades e on me.especialidades_id = e.id where e.nombre = ?1",
@Query(value = "select diagnostico as firstName,especialidad as lastName from citas",
    nativeQuery = true)
    List<MedicoEspecialidad> getMedicos(String especialidad);

//    TypedQuery<Collection> query
//            = entityManager.createQuery(
//            "SELECT e.phones FROM Employee e", Collection.class);
//    List<Collection> resultList = query.getResultList();

}
