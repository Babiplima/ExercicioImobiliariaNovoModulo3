package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sistema {

    //Método leitor de dados

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Listas necessárias para o sistema
    static List<Moradores> listaDeMoradores = new ArrayList<>();
    static ImoveisCadastrado imobiliaria = new ImoveisCadastrado() {
    };

    //Menu inicial
    public static int menuInicial() {
        System.out.println("Seja muito bem vindo ao sistema imobiliário");
        System.out.println("Por favor, digite 1 para cadastrar um novo imóvel ");
        System.out.println("Por favor, digite 2 para exibir os imóveis ");
        System.out.println("Por favor, digite 3 para excluir um morador ");
        System.out.println("Por favor 4 , caso deseje sair digite 4 ");
        return menuInicial();
    }

    //Entrada de dados

    public static Moradores novoMorador() {
        String nome = capturarDados("Digite o nome do morador ").nextLine();
        String cpf = capturarDados("Digite o seu CPF").nextLine();
        String telefone = capturarDados("Digite o seu telefone ").nextLine();
        String endereço = capturarDados("Digite o endereço").nextLine();
        String aluguel = capturarDados("Digite o valor do aluguel").nextLine();
        Moradores moradores = new Moradores();
        return novoMorador();
    }
    //Método cadastrar funcionário

    public static Funcionario cadastrarFuncionario() {
        String nome = capturarDados("Digite seu nome: ").nextLine();
        Funcionario funcionario = new Funcionario(nome);
        return funcionario;
    }


    //Método executar

    public static void executar() {
        boolean menu = true;
        Imobiliaria imobiliaria = new Imobiliaria();

        while (menu) {
            menuInicial();
            int opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();
            switch (opcaoDoUsuario) {
                case 1:
                    Imovel imovel = cadastrarFuncionario();
                    Funcionario funcionario = cadastrarFuncionario();
                    imovel.setFuncionarioResponsavel(funcionario);
            }
            int qtdMoradores = capturarDados("Digite a quantidade de moradores: ").nextInt();
            for (int i = 0; i < qtdMoradores; i++) {
                Morador morador = cadastrarMoradores();
                imovel.adicionarMorador(morador);
            }
            imobiliaria.adicionarImovel(imovel);
            break;
            case 2:
                System.out.println(imobiliaria);
                break;
            case 3:
                System.out.println("Muito obrigada, volte sempre");
                menu = false;
                break;


        }

    }
}
