package com.company;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    private List<Imovel> imoveis = new ArrayList<>();

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }
}


