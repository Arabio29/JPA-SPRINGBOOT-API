package com.example.demo.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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
    }

    @ManyToMany
    @JoinTable(
            name = "paciente_cita",
            joinColumns = @JoinColumn(name = "paciente_dni"),
            inverseJoinColumns = @JoinColumn(name = "cita_id")
    )
    private List<Cita> citass = new ArrayList<>();


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

}
