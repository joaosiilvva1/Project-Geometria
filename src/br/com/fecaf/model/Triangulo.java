package br.com.fecaf.model;

import java.util.Arrays;

/**
 * Modelo que representa um triângulo e contém as regras:
 * - validação (desigualdade triangular)
 * - verificação de retângulo (Teorema de Pitágoras)
 * - verificação do padrão 3-4-5
 * - classificação (Equilátero, Isósceles, Escaleno)
 */
public class Triangulo {

    private final int a;
    private final int b;
    private final int c;

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /** Retorna true se os lados satisfazem a desigualdade triangular. */
    public boolean isValido() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    /** Retorna true se for um triângulo retângulo (aplica Pitágoras). */
    public boolean isRetangulo() {
        if (!isValido()) return false;
        int[] lados = {a, b, c};
        Arrays.sort(lados); // lados[2] será a hipotenusa
        return lados[0]*lados[0] + lados[1]*lados[1] == lados[2]*lados[2];
    }

    /** Retorna true se os lados forem exatamente 3, 4 e 5 (após ordenação). */
    public boolean is345() {
        int[] lados = {a, b, c};
        Arrays.sort(lados);
        return lados[0] == 3 && lados[1] == 4 && lados[2] == 5;
    }

    /** Classifica o triângulo em Equilátero, Isósceles ou Escaleno. */
    public String getClassificacao() {
        if (!isValido()) return "Não é um triângulo válido!";
        if (a == b && b == c) return "Equilátero";
        if (a == b || b == c || a == c) return "Isósceles";
        return "Escaleno";
    }

    // getters (se precisar em outro código)
    public int getA() { return a; }
    public int getB() { return b; }
    public int getC() { return c; }
}
