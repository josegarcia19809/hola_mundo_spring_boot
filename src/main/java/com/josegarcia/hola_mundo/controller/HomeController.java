package com.josegarcia.hola_mundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String inicio() {
        return "<h1>Página de inicio</h1>";
    }
}
