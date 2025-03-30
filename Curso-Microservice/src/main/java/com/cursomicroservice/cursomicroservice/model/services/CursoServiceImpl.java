package com.cursomicroservice.cursomicroservice.model.services;

import com.cursomicroservice.cursomicroservice.model.entities.Curso;
import com.cursomicroservice.cursomicroservice.model.repositories.ICursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService{

    ICursoRepository cursoRepository;

    public CursoServiceImpl(ICursoRepository cursoRepository) {this.cursoRepository = cursoRepository;}

    @Override
    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public void delete(Curso curso) {
        cursoRepository.delete(curso);
    }

    @Override
    public Curso findById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    @Override
    public Curso update(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> findAll() {
        return (List<Curso>) cursoRepository.findAll();
    }
}
