package com.dio;

public class ExCalculadora {

    public static Double soma(double a, double b){
        return a + b;
    }
    public static Double diminuir(double a, double b){
        return a - b;
    }
    public static Double dividir(double a, double b){
        return a / b;
    }
    public static Double multiplicar(double a, double b){
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Somar: " + soma(5, 5));
        System.out.println("diminuir: " + diminuir(10, 20));
        System.out.println("dividir: " + dividir(20, 5));
        System.out.println("multiplicar: " + multiplicar(2, 2));

        Saudacao.ss(10);
        System.out.println(Emprestimo.calcular(50.89, 2));
    }

}
