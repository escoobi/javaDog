package com.dio;


public class Saudacao {

    public static void ss(int horas){

        switch (horas) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> System.out.println(chamarBomDia());
            case 13, 14, 15, 16, 17 -> System.out.println(chamarBoaTarde());
            case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> System.out.println(chamarBoaNoite());
            default -> System.out.println("Hora inválida!");
        }
    }

    public static String chamarBomDia(){
        return "Bom dia!";
    }
    public static String chamarBoaTarde(){
        return "Boa tarde!";
    }
    public static String chamarBoaNoite(){
        return "Boa noite!";
    }


}
