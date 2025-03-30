package com.cursomicroservice.cursomicroservice.model.services;

import com.cursomicroservice.cursomicroservice.model.entities.Curso;

import java.util.List;

public interface ICursoService {

    Curso save(Curso curso);
    void delete(Curso curso);
    Curso findById(Long id);
    Curso update(Curso curso);
    List<Curso> findAll();
}
