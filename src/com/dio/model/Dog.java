package com.dio.model;

import java.util.Objects;

public class Dog {

    private String nome;
    private String raca;
    private Integer peso;
    private Integer idade;

    public Dog(String nome, String raca, Integer peso, Integer idade) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(nome, dog.nome) && Objects.equals(raca, dog.raca) && Objects.equals(peso, dog.peso) && Objects.equals(idade, dog.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, raca, peso, idade);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                '}';
    }
}