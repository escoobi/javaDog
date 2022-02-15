package com.dio;

import com.dio.model.Dog;

public class Main {

    public static void main(String[] args) {
        /* System.out.printf("Estamos aqui!");*/

        usabilidadeCasting();

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 10000;
        //short s2 = 40000;
        //int i1 = -10000000000;
        int i2 = 1000000000;

        long l1 = 1000000000000000000l;
        //long l2 = 10000000000000000000l;

        //float f1 = 4.5;
        float f2 = 4.5f;

        //double d1 = 4.5;
        double d2 = 4.5d;

        char c1 = 'w';
        //char c2 = 'tw';
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Fulano Fulano Fulano";
        String st3 = "Fulano Fulano";
        String st4 = "Fulano";

        Boolean bol1 = true;
        Boolean bo2 = false;



        Dog dog = new Dog("Totó","Vira-Lata", 30, 5);

        System.out.println(dog.getNome());

        Livro livro = new Livro("O Investidor Inteligente", 2021, 623);

        System.out.println(livro);

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritimético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
    }

    private static void precedencia() {
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;
        System.out.println("i++ + --j * k: " + a);
        System.out.println("i: " + i);

        int b = k / --i % 3 + 1;
        System.out.println("k / --i % 3 + 1: " + b);
        System.out.println("i: " + i);

        int c = 2;
        c *= i += 5;
        System.out.println("c *= i += 5: " + c);


    }

    private static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5F;
        double d= f;

        System.out.println("d: " + d);

        i += 5;
        j -= 3;
        d /= 2.7D;
        l *= 3;
        k %= 2;
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i = k = j;

        System.out.println("k: " + k);
        System.out.println("i: " + i);
    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println("a + b: " + r1);
        System.out.println("c - b: " + r2);
        System.out.println("d * b: " + r3);
        System.out.println("e / b: " + r4);
        System.out.println("c % b: " + r5);
    }

    private static void prePos(){
        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);
    }

   private static void usabilidadeCasting(){
       /*Casting*/

       byte b1;
       short s1 = 1000; //downcasting
       b1 = (byte) s1;

       long l1;
       int i1 = 10; //upcasting
       l1 = i1;

       int i2;
       long l2 = 1000000000000000000L;//downcasting
       i2 = (int) l2;

       int i3;
       long l3 = 10000L;//upcasting neste caso!
       i3 = (int) l3;

       double d1;
       float f1 = 10.5F;//upcasting
       d1 = f1;

       b1 = (byte) l2;
       System.out.println("Convertendo Long para Byte (trucando valor): " + b1);
   }

}

class Livro{
    private String nome;
    private Integer ano;
    private Integer numeroPagina;


    public Livro(String nome, Integer ano, Integer npg) {
        this.nome = nome;
        this.ano = ano;
        this.numeroPagina = npg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(Integer numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", numeroPagina=" + numeroPagina +
                '}';
    }
}
