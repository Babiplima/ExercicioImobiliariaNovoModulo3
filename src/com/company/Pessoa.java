package com.company;

public class Pessoa {
    //Atributos

    private String nome;
    private String cpf;

    //Métodos construtores

    public Pessoa(String nome){

    }
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    //Métodos Getters e Setters


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    //Método to String


    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\t Nome " + getNome());
        dados.append("\t CPF" + getCpf() + "\t");
        return dados.toString();
    }
}
