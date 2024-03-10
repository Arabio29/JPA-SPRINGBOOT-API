package com.example.demo.models;

import jakarta.persistence.*;


@Entity
@Table(name = "odontologo")
public class Odontologo {

    @Id
    private Long matricula;
    @Column
    private String nombre;
    private String apellido;


    public Odontologo(Long matricula, String nombre, String apellido, Cita cita) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cita = cita;
    }

    @OneToOne
    @PrimaryKeyJoinColumn
    @JoinColumn(name = "odontologo_matricula")
    private Cita cita;

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public Long getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Cita getCita() {
        return cita;
    }
}
