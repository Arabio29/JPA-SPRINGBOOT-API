package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cita")
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

    @OneToOne (mappedBy = "cita", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Paciente paciente;

    @OneToOne (mappedBy = "cita", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
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
