package com.workshop.controllers;

import com.workshop.models.Cita;
import com.workshop.repositories.EspecialidadRepository;
import com.workshop.repositories.HorarioRepository;
import com.workshop.services.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/cita")
@CrossOrigin("*")
public class CitaController {
    @Autowired
    private CitaService citaService;

    @Autowired
    private HorarioRepository horarioRepository;

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(citaService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getByPacienteId(@PathVariable("id") String id){
        return citaService.getByUserId(id)==null?
                new ResponseEntity<>(HttpStatus.NOT_FOUND):
                new ResponseEntity<>(citaService.getByUserId(id),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Cita cita){
        return new ResponseEntity<>(citaService.saveCita(cita),HttpStatus.CREATED);
    }

    @GetMapping("/medxesp/{especialidad}")
    public ResponseEntity<?> getMedicos(@PathVariable String especialidad){
        System.out.println(especialidad);
        return new ResponseEntity<>(citaService.getMedicos(especialidad),HttpStatus.OK);
    }

    @GetMapping("/horario/{medico_id}/{disponible}")
    public ResponseEntity<?> getHorarios(@PathVariable String medico_id, @PathVariable String disponible){
        System.out.println("valores: "+medico_id+" "+disponible);
        return new ResponseEntity<>(horarioRepository.getAllHorarios(medico_id,disponible),HttpStatus.OK);
    }

    @GetMapping("/medicos/{especialidad}/{fecha}")
    public ResponseEntity<?> getMedicos(@PathVariable String especialidad, @PathVariable String fecha){
        return new ResponseEntity<>(especialidadRepository.getAllMedicos(especialidad,fecha),HttpStatus.OK);
    }

}
