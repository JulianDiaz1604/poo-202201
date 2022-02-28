package com.Dispensador.dominio;

import com.Dispensador.dominio.Cuido;

public class DispensadorComidaDeGato {
    public String marca;
    public double capacidadKilos = 5;
    public double cantidadActual;
    boolean encendido = false;
    Cuido cuido;

    public void servir(double cantidadAServir){
        if (encendido) {
            if (cantidadAServir >= this.cantidadActual) {
                this.cantidadActual = this.cantidadActual - cantidadAServir;
                System.out.println("Se ha servido " + cantidadAServir);
            } else {
                System.out.println("No hay suficiente cuido en el dispensador.");
            }
        }  else {
            System.out.println("El dispensador no esta encendido.");
        }
    }

    public void llenar(){
        if(encendido) {
            this.cantidadActual = this.capacidadKilos;
            System.out.println("Se ha llenado el dispensador.");
        } else {
            System.out.println("El dispensador no esta encendido.");
        }
    }

    public void vaciar(){
        if (encendido) {
            this.cantidadActual = 0;
            System.out.println("Se ha vaciado el dispensador");
        } else {
            System.out.println("El dispensador no esta encendido.");
        }
    }

    public void cambiarCuido(Cuido nuevoCuido){
        if (encendido) {
            this.cuido = nuevoCuido;
            System.out.println("Ahora el cuido es " + nuevoCuido);
        } else {
            System.out.println("El dispensador no esta encendido.");
        }
    }

    public void mostrarCantidadActual(){
        if(encendido) {
            System.out.println("Hay " + this.cantidadActual + "Kg en el Dispensador.");
        } else {
            System.out.println("El dispensador no esta encendido.");
        }
    }

    public void encender(){
        this.encendido = true;
    }
}
