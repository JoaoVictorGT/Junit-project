package org.example;

public class Calculadora {
    public int somar(int operando1, int operando2) {
        return operando1 + operando2;
    }
    public int subtrair(int operando1, int operando2) {
        return operando1 - operando2;
    }
    public int dividir(int operando1, int operando2) {
        if (operando2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        return operando1 / operando2;
    }
    public int multiplicar(int operando1, int operando2) {
        return operando1 * operando2;
    }
}
