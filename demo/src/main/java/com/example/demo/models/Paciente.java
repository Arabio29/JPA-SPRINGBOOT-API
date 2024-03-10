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


    public Paciente(Long dni, String nombre, String apellido, String domicilio, Cita cita) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.cita = cita;
    }

    @OneToOne
    @JoinColumn(name = "paciente_dni")
    @PrimaryKeyJoinColumn
    private Cita cita;

    public Long getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public Cita getCita() {
        return cita;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }
}
