package com.workshop.services;

import com.workshop.models.Cita;
import com.workshop.models.MedicoEspecialidad;

import java.util.List;

public interface CitaService {

    List<Cita> getAll();
    List<Cita> getByUserId(String id);
    Cita saveCita(Cita cita);
    List<MedicoEspecialidad> getMedicos(String especialidad);
}
