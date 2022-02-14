package com.dio;

import com.dio.model.Dog;

public class Main {
    public static void main(String[] args) {
        /* System.out.printf("Estamos aqui!");*/

        Dog dog = new Dog();

        System.out.printf(dog.toString());

        Livro livro = new Livro("O Investidor Inteligente", 2021, 623);
        System.out.println(livro);
    }
}

class Livro{
    private String nome;
    private Integer ano;
    private Integer npg;


    public Livro(String nome, Integer ano, Integer npg) {
        this.nome = nome;
        this.ano = ano;
        this.npg = npg;
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

    public Integer getNpg() {
        return npg;
    }

    public void setNpg(Integer npg) {
        this.npg = npg;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", npg=" + npg +
                '}';
    }
}
