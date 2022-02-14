package com.dio;

import com.dio.model.Dog;

public class Main {
    public static void main(String[] args) {
        /* System.out.printf("Estamos aqui!");*/

        Dog dog = new Dog("Totó","Vira-Lata", 30, 5);

        System.out.println(dog.getNome());

        Livro livro = new Livro("O Investidor Inteligente", 2021, 623);
        System.out.println(livro);
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
