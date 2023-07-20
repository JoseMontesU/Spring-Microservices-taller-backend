package com.workshop.repositories;

import com.workshop.models.Especialidad;
import com.workshop.models.MedicosData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface EspecialidadRepository extends JpaRepository<Especialidad,Long> {

    @Query(nativeQuery = true)
    List<MedicosData> getAllMedicos(@Param("especialidad") String especialidad, @Param("fecha") String fecha);
}
