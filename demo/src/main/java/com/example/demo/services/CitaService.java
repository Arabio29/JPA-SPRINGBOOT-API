package com.example.demo.services;

import com.example.demo.models.Cita;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CitaService {
    private List<Cita> citas;

    public CitaService(){
        this.citas = new ArrayList<>();
    }

    //agregar cita
    public Cita agregarCita(Cita cita){
        this.citas.add(cita);
        return cita;
    }

    //obtener citas
    public List<Cita> obtenerCitas(){
        return this.citas;
    }

    //eliminar cita
    public void eliminarCita(){

    }

    //eliminar cita por su ID
    public Cita obtenerCitaId(Long id){
        return citas.stream()
                .filter(n -> n.getId() == (id))
                .findFirst().orElse(null);
    }


}
