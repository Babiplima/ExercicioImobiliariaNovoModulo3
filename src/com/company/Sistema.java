package com.company;


import java.util.Scanner;


public class Sistema {

    //Método leitor de dados

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Menu inicial
    public static int menuInicial() {
        System.out.println("Seja muito bem vindo ao sistema imobiliário");
        System.out.println("Por favor, digite 1 para cadastrar um novo imóvel ");
        System.out.println("Por favor, digite 2 para exibir os imóveis ");
        System.out.println("Por favor, digite 3 para excluir um morador ");
        System.out.println("Por favor 4 , caso deseje sair digite 4 ");
        return menuInicial();
    }
    //Cadastrar Moradores
    //Entrada de dados
    private static Moradores moradores() {
        String nome = capturarDados("Digite o nome do morador ").nextLine();
            String cpf = capturarDados("Digite o seu CPF").nextLine();
            String telefone = capturarDados("Digite o seu telefone ").nextLine();
            String endereço = capturarDados("Digite o endereço").nextLine();
            String aluguel = capturarDados("Digite o valor do aluguel").nextLine();
            Moradores moradores = new Moradores();
            return moradores();
        }


    //Método executar

    public static void cadastrarMoradores(Imobiliaria imobiliaria, Imovel imovel) {


    }
}


