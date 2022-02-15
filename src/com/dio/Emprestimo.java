package com.dio;

public class Emprestimo {
    static double valorFinal = 0;
    public static Double calcular(double valor, int parcelas){

        if (parcelas == 3){
           valorFinal = valor + (valor * obterTaxaTresParcelas());
           return valorFinal;
        }
        else if (parcelas == 2){
            valorFinal = valor + (valor * obterTaxaDuasParcelas());
            return valorFinal;
        }
        else {
            valorFinal = valor + (valor * 0);
            return valorFinal;

        }
    }

    public static double obterTaxaTresParcelas(){
        return 0.45;
    }
    public static double obterTaxaDuasParcelas(){
        return 0.3;
    }

}
