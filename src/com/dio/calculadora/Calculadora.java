package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o primeiro numero: ");
        a = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scanner.nextInt();

        int somar = somar(a, b);
        int dividir = dividir(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);

        System.out.println("Soma: " + somar);
        System.out.println("Dividir: " + dividir);
        System.out.println("Subtrair: " + subtrair);
        System.out.println("Multiplicar: " + multiplicar);
     
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }
}
