package com.company;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    //Atributos

    private String nomeImobiliaria;
    private List<Imovel> imoveis = new ArrayList<>();

    //Métodos construtores

    public Imobiliaria() {
    }

    public Imobiliaria(String nomeImobiliaria) {
        this.nomeImobiliaria = nomeImobiliaria;
    }
   //Método Getters e Setters


    public String getNomeImobiliaria() {
        return nomeImobiliaria;
    }

    public void setNomeImobiliaria(String nomeImobiliaria) {
        this.nomeImobiliaria = nomeImobiliaria;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
    //Método toString

    @Override
    public String toString(){
        StringBuilder exibir = new StringBuilder();
        exibir.append("================"+nomeImobiliaria+"==================");
        exibir.append("=============="+imoveis+"==================");
        return exibir.toString();
    }
}


