package com.workshop.services;

import com.workshop.models.Cita;
import com.workshop.models.MedicoEspecialidad;
import com.workshop.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService{
    @Autowired
    private CitaRepository citaRepository;
    @Override
    public List<Cita> getAll() {
        return citaRepository.findAll();
    }

    @Override
    public List<Cita> getByUserId(String id) {
        return citaRepository.findCitasByPacienteIdOrderByDateDesc(id);
    }

    @Override
    public Cita saveCita(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public List<MedicoEspecialidad> getMedicos(String especialidad) {
        return citaRepository.getMedicos(especialidad);
    }
}
