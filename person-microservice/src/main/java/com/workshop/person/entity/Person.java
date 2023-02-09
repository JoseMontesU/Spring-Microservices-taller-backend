package com.workshop.person.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
