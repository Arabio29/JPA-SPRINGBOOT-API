package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Odontologo {

    private String nombre;
    private String apellido;
    private Long matricula;
    private Cita cita;


    public Odontologo(String nombre, String apellido, Long matricula, Cita cita) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.cita = cita;
    }

}
