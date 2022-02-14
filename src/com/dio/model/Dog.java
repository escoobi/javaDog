package com.dio.model;

import java.util.Objects;

public class Dog {

    private String nomeDog;
    private String racaDog;
    private Integer pesoDog;
    private Integer idadeDog;

    public Dog(String nomeDog, String racaDog, Integer pesoDog, Integer idadeDog) {
        this.nomeDog = nomeDog;
        this.racaDog = racaDog;
        this.pesoDog = pesoDog;
        this.idadeDog = idadeDog;
    }

    public String getNome() {
        return nomeDog;
    }

    public void setNome(String nome) {
        this.nomeDog = nome;
    }

    public String getRaca() {
        return racaDog;
    }

    public void setRaca(String raca) {
        this.racaDog = raca;
    }

    public Integer getPeso() {
        return pesoDog;
    }

    public void setPeso(Integer peso) {
        this.pesoDog = peso;
    }

    public Integer getIdadeDog() {
        return idadeDog;
    }

    public void setIdadeDog(Integer idadeDog) {
        this.idadeDog = idadeDog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(nomeDog, dog.nomeDog) && Objects.equals(racaDog, dog.racaDog) && Objects.equals(pesoDog, dog.pesoDog) && Objects.equals(idadeDog, dog.idadeDog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDog, racaDog, pesoDog, idadeDog);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nome='" + nomeDog + '\'' +
                ", raca='" + racaDog + '\'' +
                ", peso=" + pesoDog +
                ", idadeDog=" + idadeDog +
                '}';
    }
}