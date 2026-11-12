package org.kevin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreubaController {
    @GetMapping
    public String saludar() {
        return "Hola desde el controlador de prueba";
    }
}
