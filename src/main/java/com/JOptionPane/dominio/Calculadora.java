package com.JOptionPane.dominio;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Calculadora {
    public int sumar(List<Integer> lista){
        int resultado = 0;
        for (int i = 0; i < lista.size(); i++) {
            resultado = resultado + lista.get(i);
        }
        return resultado;
    }

    public int restar(List<Integer> lista){
        int resultado = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            resultado = resultado - lista.get(i);
        }
        return resultado;
    }

    public int multiplicar(List<Integer> lista){
        int resultado = 1;
        for (int i = 0; i < lista.size(); i++) {
            resultado = resultado * lista.get(i);
        }
        return resultado;
    }

    public float dividir(List<Integer> lista){
        int resultado = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            resultado = resultado / lista.get(i);
        }
        return resultado;
    }

    public List<Integer> agregarNumeros(List<Integer> lista){
        int opcion = 0;
        while(opcion == 0) {
            int n = Integer.parseInt((JOptionPane.showInputDialog("Ingrese un numero")));
            lista.add(n);
            opcion = JOptionPane.showOptionDialog(null, "Desea ingresar un nuevo numero?",
                    null, 0, 0, null, Arrays.asList("Si", "No").toArray(),
                    null);
        }
        return lista;
    }
}
