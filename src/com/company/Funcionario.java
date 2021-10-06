package com.company;

public class Funcionario extends Pessoa {

    //Método construtor

    public Funcionario() {
    }
    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    //Método toString

    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("\n========================");
        return exibir.toString();
    }
}
