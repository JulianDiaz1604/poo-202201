package com.JOptionPane.dominio;

public class Calculadora {
    public int sumar(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }

    public int restar(int n1, int n2){
        int resultado = n1 - n2;
        return resultado;
    }

    public int multiplicar(int n1, int n2){
        int resultado = n1 * n2;
        return resultado;
    }

    public float dividir(int n1, int n2){
        float resultado = (float) n1 / n2;
        return resultado;
    }
}
