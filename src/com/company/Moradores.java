package com.company;

import java.util.ArrayList;
import java.util.List;

public class Moradores extends Pessoa {

    private List<Moradores> moradores = new ArrayList<Moradores>();


    //Métodos Construtores

     public Moradores(){
         super("","");

     }
    public Moradores(String nome, String cpf) {
    super(nome,cpf);

    }
}
