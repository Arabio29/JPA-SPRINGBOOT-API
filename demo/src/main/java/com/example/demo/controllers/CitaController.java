package com.example.demo.controllers;

import com.example.demo.models.Cita;
import com.example.demo.services.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CitaController {

    private final CitaService citaService;

    @Autowired
    public CitaController(CitaService citaService){
        this.citaService = citaService;
    }

   //http://localhost:8080/cita
    @PostMapping("/citas/")
    public Cita agregarCita(@RequestBody Cita cita){
        return citaService.agregarCita(cita);
    }
/*
    @DeleteMapping("/cita/{id}")
    public Cita eliminarCita(){

    }
*/

    @GetMapping("/citas/")
    public List<Cita> obtenerCitas(){
        return citaService.obtenerCitas();
    }

    @GetMapping("/citas/{id}")
    public Cita obtenerCitas(@PathVariable("id")Long id){
        return citaService.obtenerCitaId(id);
    }


}
