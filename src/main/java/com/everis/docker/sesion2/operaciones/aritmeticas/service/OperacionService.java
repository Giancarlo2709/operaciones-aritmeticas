package com.everis.docker.sesion2.operaciones.aritmeticas.service;

import com.everis.docker.sesion2.operaciones.aritmeticas.exception.OperacionException;

import java.math.BigDecimal;

public interface OperacionService {

    BigDecimal sumar(String number1, String number2) throws OperacionException;

    BigDecimal restar(String number1, String number2) throws OperacionException;

    BigDecimal multiplicar(String number1, String number2) throws OperacionException;

    BigDecimal dividir(String number1, String number2) throws OperacionException;
}
