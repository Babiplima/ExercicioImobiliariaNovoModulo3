package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    //Listas necessárias para o sistema
    static List<Moradores> listaDeMoradores = new ArrayList<>();
    static ImoveisCadastrado imobiliaria = new ImoveisCadastrado() {
    };


    //Método leitor de dados
    private static Scanner leitor(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Menu inicial
    public static int Menuinicial() {
        System.out.println("Seja muito bem vindo ao sistema imobiliário");
        System.out.println("Por favor, digite 1 para cadastrar um novo imóvel ");
        System.out.println("Por favor, digite 2 para exibir os imóveis ");
        System.out.println("Por favor, digite 3 para excluir um morador ");
        int escolhido = leitor("Por favor, caso deseje sair digite 4 ").nextInt();
        return escolhido;
    }
    //Entrada de dados Funcionário

    public static Funcionario novoFuncionario() {
        String leitorFuncionario = leitor("Digite o nome do funcionário responsável  ").nextLine();
        Funcionario novoFuncionario = new Funcionario(leitorFuncionario);
        return novoFuncionario;
    }

    //Entrada de dados Morador através de métodos

    public static Moradores novoMorador() {
        String leitorMoradores = leitor("Digite o nome do morador ").nextLine();
        String leitorCPF = leitor("Digite o CPF ").nextLine();

        Moradores novoMorador = new Moradores();
        return novoMorador;
    }

    public static double aluguel() {
        double leitorAluguel = leitor("Qual é o valor do aluguel?").nextDouble();
        return leitorAluguel;

    }

    public static String endereco() {
        String leitorEndereco = leitor("Qual é o endereço do imóvel?").nextLine();
        return leitorEndereco;

        //Método cadastrar morador

        public static Imovel cadastrarImovel() {
            Imovel novoImovel = new Imovel();
            String leitorMoradores = leitor("Qual é o nome do morador ? ").nextLine();
            String leitorCPF = leitor("Qual é o númer/ do CPF: ").nextLine();

            return novoImovel;
        }
    }
}
