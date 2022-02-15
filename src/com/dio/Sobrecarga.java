package com.dio;

/**
 * Exemplo de sobrecarga métodos.
 * O nome do método mantêm e apenas os parâmetros passados alterados
 * */

public class Sobrecarga {

    public static Double calcularArea(double lado){

        return lado * lado;
    }
    public static Double calcularArea(double lado1, double lado2){

        return lado1 * lado2;
    }
    public static Double calcularArea(double baseMaior, double baseMenor, double altura){

        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
