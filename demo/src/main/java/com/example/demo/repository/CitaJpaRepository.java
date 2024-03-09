package com.example.demo.repository;

import com.example.demo.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaJpaRepository extends JpaRepository<Paciente, Long> {

    //create
    //read
    //uptdate
    //delete

}
