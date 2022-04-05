package com.JOptionPane.app;

import com.JOptionPane.dominio.Calculadora;

import javax.swing.*;
import java.util.Arrays;

public class AppCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int valor1, valor2, resultado;
        float resultadoDecimal;
        JCheckBox redondeo = new JCheckBox("Redondear");
        while (true){
            int opcionElegida = JOptionPane.showOptionDialog(null, "Hola!\nQue desea hacer?", "Calculadora",
                    0, 3, null, Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", redondeo).toArray(),
                    "Sumar");

            switch (opcionElegida){
                case -1:
                    System.exit(0);

                case 0:
                    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                    resultado = calculadora.sumar(valor1, valor2);
                    JOptionPane.showMessageDialog(null, resultado);
                    break;

                case 1:
                    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                    resultado = calculadora.restar(valor1, valor2);
                    JOptionPane.showMessageDialog(null, resultado);
                    break;

                case 2:
                    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                    resultado = calculadora.multiplicar(valor1, valor2);
                    JOptionPane.showMessageDialog(null, resultado);
                    break;

                case 3:
                    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                    resultadoDecimal = calculadora.dividir(valor1, valor2);
                    if (redondeo.isSelected()){
                        JOptionPane.showMessageDialog(null, Math.round(resultadoDecimal));
                    } else
                        JOptionPane.showMessageDialog(null, resultadoDecimal);
                    break;
            }
        }
    }
}
