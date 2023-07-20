package com.workshop.repositories;

import com.workshop.models.Horario;
import com.workshop.models.HorariosData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HorarioRepository extends JpaRepository<Horario,Long> {

    @Query(nativeQuery = true)
    List<HorariosData> getAllHorarios(@Param("medico_id") String medico_id, @Param("disponible") String disponible);
}
