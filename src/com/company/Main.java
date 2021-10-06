package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Imovel imovel = new Imovel("Complexo",1500);
        Funcionario funcionario = new Funcionario("Bárbara","3938404");
        Moradores morador1 = new Moradores("Matheus","8392033");

        System.out.println(imovel);
        imovel.setFuncionarioResponsavel(funcionario);
        imovel.setMoradores((List<Moradores>) morador1);
        System.out.println(imovel);
 }
}
