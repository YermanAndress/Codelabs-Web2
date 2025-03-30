package com.cursomicroservice.cursomicroservice.controllers;

import com.cursomicroservice.cursomicroservice.model.entities.Curso;
import com.cursomicroservice.cursomicroservice.model.services.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/curso-service")
public class CursoRestController {

    private final ICursoService cursoService;

    @Autowired
    public CursoRestController(ICursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/cursos")
    public List<Curso> getCurso() {
        return cursoService.findAll();
    }

    @PostMapping("/cursos")
    public Curso save(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @DeleteMapping("/cursos")
    public void delete(@RequestBody Curso curso) {
        cursoService.delete(curso);
    }

    @PutMapping("/cursos")
    public Curso update(@RequestBody Curso curso) {
        return cursoService.update(curso);
    }

    @GetMapping("/cursos/{id}")
    public Curso findById(@PathVariable("id") Long id) {
        return cursoService.findById(id);
    }


}
