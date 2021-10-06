package com.company;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    //Atributos

    private String endereco;
    private double valorDoAluguel;
    private Funcionario funcionarioResponsavel;
    private List<Moradores> moradores = new ArrayList<>();

//Métodos construtores


    public Imovel(String endereco, double valorDoAluguel) {
        this.endereco = endereco;
        this.valorDoAluguel = valorDoAluguel;
       }
    //Métodos Getters e Setters

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Moradores> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Moradores> moradores) {
        this.moradores = moradores;
    }
    //Método toString

    @Override
    public String toString(){
        StringBuilder exibir = new StringBuilder();
        exibir.append("\nEndereço: "+ endereco);
        exibir.append("\nValor do Aluguel: "+ valorDoAluguel);
        exibir.append("\n Funcionário Responsável: "+funcionarioResponsavel);
        exibir.append("\n=========Moradores=========="+moradores);
        return exibir.toString();
    }

}






