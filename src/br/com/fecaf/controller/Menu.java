package br.com.fecaf.controller;

import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

/**
 * Controller responsável por interagir com o usuário via console,
 * ler entradas e delegar validações/classificações ao modelo Triangulo.
 */
public class Menu {

    private final Scanner sc = new Scanner(System.in);

    /**
     * Exibe o menu principal em loop até o usuário escolher sair.
     */
    public void exibir() {
        int opcao;
        do {
            System.out.println("\n===== MENU TRIÂNGULO =====");
            System.out.println("1 - Verificar se o triângulo é válido");
            System.out.println("2 - Verificar se é triângulo retângulo");
            System.out.println("3 - Verificar se é do tipo 3,4,5");
            System.out.println("4 - Classificar (Equilátero, Isósceles, Escaleno)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = lerIntComMensagem();

            if (opcao != 0) {
                Triangulo t = lerLados();

                switch (opcao) {
                    case 1 -> System.out.println(t.isValido() ? "O triângulo é válido." : "O triângulo não é válido.");
                    case 2 -> {
                        if (!t.isValido()) {
                            System.out.println("Triângulo inválido. Não é possível verificar se é retângulo.");
                        } else {
                            System.out.println(t.isRetangulo() ? "O triângulo é retângulo." : "O triângulo não é retângulo.");
                        }
                    }
                    case 3 -> {
                        if (!t.isValido()) {
                            System.out.println("Triângulo inválido. Não é possível verificar padrão 3,4,5.");
                        } else {
                            System.out.println(t.is345() ? "O triângulo é do tipo 3,4,5." : "O triângulo não é do tipo 3,4,5.");
                        }
                    }
                    case 4 -> {
                        if (!t.isValido()) {
                            System.out.println("Triângulo inválido. Não é possível classificar.");
                        } else {
                            System.out.println("Classificação: " + t.getClassificacao());
                        }
                    }
                    default -> System.out.println("Opção inválida!");
                }
            }
        } while (opcao != 0);

        System.out.println("Encerrando programa...");
        sc.close();
    }

    /**
     * Lê os três lados do usuário. Garante que sejam inteiros positivos.
     */
    private Triangulo lerLados() {
        int a, b, c;
        while (true) {
            System.out.println("\nInforme os lados do triângulo (inteiros e maiores que zero):");
            System.out.print("Lado A: ");
            a = lerIntComMensagem();
            System.out.print("Lado B: ");
            b = lerIntComMensagem();
            System.out.print("Lado C: ");
            c = lerIntComMensagem();

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Erro: todos os lados devem ser maiores que zero. Tente novamente.");
            } else {
                return new Triangulo(a, b, c);
            }
        }
    }

    /**
     * Lê uma linha do console e tenta converter para inteiro.
     * Repetirá até o usuário digitar um inteiro válido.
     */
    private int lerIntComMensagem() {
        while (true) {
            String linha = sc.nextLine();
            try {
                return Integer.parseInt(linha.trim());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
            }
        }
    }
}