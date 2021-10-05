package com.company;

import java.util.ArrayList;
import java.util.List;

public class CadastroImovel {
    private List<Imovel> imoveis = new ArrayList<>();


    //Métodos construtores

    public CadastroImovel() {

    }

    public CadastroImovel(List<Imovel> imoveis) {
        this.imoveis = imoveis;

    }

    //Métodos Getters e Setters


    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    //Método add imóvel

    public void adicionarImovel() {
        for (Imovel referencia : imoveis) {
            System.out.println(referencia.toString());
        }
        //Método de mostrar imóveis
        for (Imovel referencia : imoveis) {
            System.out.println(referencia.getMoradores());
            System.out.println(referencia.toString());
        }
    }

    //Método toString
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Lista de imóveis cadastrados:\n");
        retorno.append("\n" + imoveis.toString());
        return retorno.toString();
    }
}
