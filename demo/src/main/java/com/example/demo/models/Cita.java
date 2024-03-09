package com.example.demo.models;

import jakarta.persistence.*;

@Entity
public class Cita {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private String fecha;


    public Cita(Paciente paciente, Odontologo odontologo){
        this.paciente = paciente;
        this.odontologo = odontologo;
    }
    public Cita(){

    }

    @OneToOne (mappedBy = "paciente_id", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Paciente paciente;

    @OneToOne (mappedBy = "odontologo_id", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Odontologo odontologo;
}
