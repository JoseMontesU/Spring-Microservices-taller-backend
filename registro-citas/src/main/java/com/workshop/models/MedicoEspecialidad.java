package com.workshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "medico_especialidad")
public class MedicoEspecialidad {
    @Id
    Long id;
    String user_id;
    String especialidades_id;
}
