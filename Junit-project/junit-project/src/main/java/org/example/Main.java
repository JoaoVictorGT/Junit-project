package org.example;


public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultadoSoma = calculadora.somar(5, 7);
        int resultadoSubtracao = calculadora.subtrair(42, 4);
        int resultadoDivisao = calculadora.dividir(12, 3);
        int resultadoMultiplicacao = calculadora.multiplicar(6, 8);

        System.out.println("Resultado da Soma: " + resultadoSoma);
        System.out.println("Resultado da Subtração: " + resultadoSubtracao);
        System.out.println("Resultado da Divisão: " + resultadoDivisao);
        System.out.println("Resultado da Multiplicação: " + resultadoMultiplicacao);
    }
}