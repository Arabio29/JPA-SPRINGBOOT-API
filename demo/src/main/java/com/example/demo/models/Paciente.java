package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    private Long dni;

    @Column
    private String nombre;
    private String apellido;
    private String domicilio;


    @OneToOne (mappedBy = "paciente", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Cita cita;

    public Paciente(Long dni, String nombre, String apellido, String domicilio, Cita cita) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.cita = cita;
    }
}
