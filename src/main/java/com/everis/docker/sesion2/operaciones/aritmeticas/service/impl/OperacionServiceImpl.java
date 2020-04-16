package com.everis.docker.sesion2.operaciones.aritmeticas.service.impl;

import com.everis.docker.sesion2.operaciones.aritmeticas.exception.OperacionException;
import com.everis.docker.sesion2.operaciones.aritmeticas.service.OperacionService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class OperacionServiceImpl implements OperacionService {

    private static final String MENSAJE_FORMATO_INCORRECTO = "Formato de numeros incorrectos";
    private static final String MENSAJE_DIVISION_POR_CERO = "No se puede dividir por cero";

    @Override
    public BigDecimal sumar(String number1, String number2) throws OperacionException {
        try {
            BigDecimal value1 = new BigDecimal(number1);
            BigDecimal value2 = new BigDecimal(number2);
            return value1.add(value2);
        } catch (NumberFormatException e) {
            throw new OperacionException(MENSAJE_FORMATO_INCORRECTO);
        }
    }

    @Override
    public BigDecimal restar(String number1, String number2) throws OperacionException {
        try {
            BigDecimal value1 = new BigDecimal(number1);
            BigDecimal value2 = new BigDecimal(number2);
            return value1.subtract(value2);
        } catch (NumberFormatException e) {
            throw new OperacionException(MENSAJE_FORMATO_INCORRECTO);
        }
    }

    @Override
    public BigDecimal multiplicar(String number1, String number2) throws OperacionException {
        try {
            BigDecimal value1 = new BigDecimal(number1);
            BigDecimal value2 = new BigDecimal(number2);
            return value1.multiply(value2);
        } catch (NumberFormatException e) {
            throw new OperacionException(MENSAJE_FORMATO_INCORRECTO);
        }
    }

    @Override
    public BigDecimal dividir(String number1, String number2) throws OperacionException {
        try {
            BigDecimal value1 = new BigDecimal(number1);
            BigDecimal value2 = new BigDecimal(number2);
            if(BigDecimal.ZERO.equals(value2))
                throw new OperacionException(MENSAJE_DIVISION_POR_CERO);
            return value1.divide(value2, 2, RoundingMode.HALF_UP);
        } catch (NumberFormatException e) {
            throw new OperacionException(MENSAJE_FORMATO_INCORRECTO);
        }
    }
}
