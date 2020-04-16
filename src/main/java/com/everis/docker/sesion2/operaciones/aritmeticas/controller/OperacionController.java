package com.everis.docker.sesion2.operaciones.aritmeticas.controller;

import com.everis.docker.sesion2.operaciones.aritmeticas.dto.OperacionResponse;
import com.everis.docker.sesion2.operaciones.aritmeticas.exception.OperacionException;
import com.everis.docker.sesion2.operaciones.aritmeticas.service.OperacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class OperacionController {

    @Autowired
    private OperacionService operacionService;

    @GetMapping("/sumar/{number1}/{number2}")
    public OperacionResponse sumar(@PathVariable String number1, @PathVariable String number2) throws OperacionException {
        return new OperacionResponse(this.operacionService.sumar(number1, number2));
    }

    @GetMapping("/restar/{number1}/{number2}")
    public OperacionResponse restar(@PathVariable String number1, @PathVariable String number2) throws OperacionException {
        return new OperacionResponse(this.operacionService.restar(number1, number2));
    }

    @GetMapping("/multiplicar/{number1}/{number2}")
    public OperacionResponse multiplicar(@PathVariable String number1, @PathVariable String number2) throws OperacionException {
        return new OperacionResponse(this.operacionService.multiplicar(number1, number2));
    }

    @GetMapping("/dividir/{number1}/{number2}")
    public OperacionResponse dividir(@PathVariable String number1, @PathVariable String number2) throws OperacionException {
        return new OperacionResponse(this.operacionService.dividir(number1, number2));
    }

}
