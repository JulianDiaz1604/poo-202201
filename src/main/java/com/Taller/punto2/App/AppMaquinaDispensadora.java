package com.Taller.punto2.App;

import com.Taller.punto2.dominio.MaquinaDispensadora;

public class AppMaquinaDispensadora {
    public static void main(String[] args) {

        MaquinaDispensadora maquina = new MaquinaDispensadora();

        maquina.crearSnack("cheetos", "a1", (short) 6, 1200);
        maquina.crearSnack("galletas", "a2", (short) 1, 800);
        maquina.crearSnack("chocorramo", "a3", (short) 6, 1500);
        maquina.crearSnack("papas", "b1", (short) 3, 2000);
        maquina.crearSnack("gomitas", "b2", (short) 0, 1500);
        maquina.crearSnack("natuchips", "b3", (short) 5, 1200);
        maquina.crearSnack("chocolatina", "c1", (short) 0, 500);
        maquina.crearSnack("m&m", "c2", (short) 6, 3000);
        maquina.crearSnack("sparkies", "c3", (short) 4, 1000);
        maquina.crearSnack("agua", "d1", (short) 2, 1000);
        maquina.crearSnack("coca cola", "d2", (short) 5, 2000);
        maquina.crearSnack("hit", "d3", (short) 6, 2000);

        maquina.dispensarSnackPorCodigo("d3", 2000);
        System.out.println("------------------------------------");
        maquina.dispensarSnackPorNombre("cheetos", 1200);
        System.out.println("------------------------------------");
        maquina.agregarSnack("galletas");
        System.out.println("------------------------------------");
        maquina.quitarSnack("galletas");
        System.out.println("------------------------------------");
        maquina.obtenerSnacksAgotados();
        System.out.println("------------------------------------");
        maquina.obtenerTodosLosSnacks();
        System.out.println("------------------------------------");
        maquina.ordenarPorCantidad();
        System.out.println("------------------------------------");
        maquina.ordenarPorPrecio();
    }
}
