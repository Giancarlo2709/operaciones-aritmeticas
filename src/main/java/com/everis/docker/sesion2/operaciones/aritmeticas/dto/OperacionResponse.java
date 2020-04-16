package com.everis.docker.sesion2.operaciones.aritmeticas.dto;

import java.math.BigDecimal;

public class OperacionResponse {

    private BigDecimal resultado;

    public OperacionResponse(BigDecimal resultado) {
        this.resultado = resultado;
    }

    public BigDecimal getResultado() {
        return resultado;
    }

    public void setResultado(BigDecimal resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "OperacionResponse{" +
                "resultado='" + resultado + '\'' +
                '}';
    }
}
