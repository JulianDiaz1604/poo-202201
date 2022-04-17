package com.JOptionPane.app;

import com.JOptionPane.dominio.Calculadora;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppCalculadora {
    public static void main(String[] args) {
        final int SUMA = 0, RESTA = 1, MULTIPLICACION = 2, DIVISION = 3, SALIR = -1;
        Calculadora calculadora = new Calculadora();
        List numeros = new ArrayList();
        int resultado;
        float resultadoDecimal;
        JCheckBox redondeo = new JCheckBox("Redondear");
        while (true){
            int opcionElegida = JOptionPane.showOptionDialog(null, "Hola!\nQue desea hacer?", "Calculadora",
                    0, 3, null, Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", redondeo).toArray(),
                    "Sumar");

            switch (opcionElegida){
                case SALIR:
                    System.exit(0);

                case SUMA:
                    calculadora.agregarNumeros(numeros);
                    JOptionPane.showMessageDialog(null, resultado = calculadora.sumar(numeros));
                    numeros.clear();
                    break;

                case RESTA:
                    calculadora.agregarNumeros(numeros);
                    JOptionPane.showMessageDialog(null, resultado = calculadora.restar(numeros));
                    numeros.clear();
                    break;

                case MULTIPLICACION:
                    calculadora.agregarNumeros(numeros);
                    JOptionPane.showMessageDialog(null, resultado = calculadora.multiplicar(numeros));
                    numeros.clear();
                    break;

                case DIVISION:
                    calculadora.agregarNumeros(numeros);
                    resultadoDecimal = calculadora.dividir(numeros);
                    if (redondeo.isSelected()){
                        JOptionPane.showMessageDialog(null, Math.round(resultadoDecimal));
                    } else
                        JOptionPane.showMessageDialog(null, resultadoDecimal);
                    break;
            }
        }
    }
}
