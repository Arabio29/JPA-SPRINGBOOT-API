package com.example.demo.models;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "odontologo")
public class Odontologo {

    @Id
    private Long matricula;
    @Column
    private String nombre;
    private String apellido;

    public Odontologo(Long matricula, String nombre, String apellido, Cita citas) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @OneToMany(mappedBy = "odontologo",cascade = CascadeType.ALL)
    private List<Cita> citas;


    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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


}
