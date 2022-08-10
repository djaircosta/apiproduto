package com.daytech.apiproduto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class InicioController {

    public String Inicio() {
        return "Aplicacao funcionando";
    }

}
