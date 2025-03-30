package com.cursomicroservice.cursomicroservice.model.repositories;

import com.cursomicroservice.cursomicroservice.model.entities.Curso;
import org.springframework.data.repository.CrudRepository;

public interface ICursoRepository extends CrudRepository<Curso, Long> {
}
