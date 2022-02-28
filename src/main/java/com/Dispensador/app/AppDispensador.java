package com.Dispensador.app;

import com.Dispensador.dominio.DispensadorComidaDeGato;
import com.Dispensador.dominio.Cuido;

public class AppDispensador {
    public static void main(String[] args) {
        DispensadorComidaDeGato dispensador = new DispensadorComidaDeGato();
        dispensador.encender();
        dispensador.llenar();
        dispensador.mostrarCantidadActual();
    }
}
