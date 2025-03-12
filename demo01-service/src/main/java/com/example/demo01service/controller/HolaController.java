package com.example.demo01service.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HolaController {

    /**
     * Ejemplo De Un Endpoint Usando Variables De Path
     * @return
     */

    @GetMapping("/hola/{nombre}")
    public String hola(@PathVariable("nombre") String nombre){
        return "Hola " + nombre+"!";
    }
}
