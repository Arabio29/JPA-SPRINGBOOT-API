package com.example.demo.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cita")
public class Cita {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private String fecha;


    public Cita(Paciente paciente, Odontologo odontologo){
        this.odontologo = odontologo;
    }

    public Cita(){

    }

    @ManyToMany(mappedBy = "citass")
    private List<Paciente> pacientes = new ArrayList<>();

    @ManyToOne
    private Odontologo odontologo;

    public Long getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
