package com.tv.dominio;

public class Televisor {
    public String color; // Lo primero es escribir los metodos iniciando por "public" y seguido por el tipo de dato
    public String marca; // El atributo siempre va en singular
    public float tamano;
    public String serial;
    public String resolucion;
    public byte volumen;
    public boolean encendido;
    public int canalActual;

    public void subirVolumen(){// Luego siguen los metodos, se inicia con "public" y se sigue con lo que retorna (void no retorna nada)
        if (this.volumen < 100){
            this.volumen = (byte) (this.volumen + 1); // se debe castear (convertir) al ser un dato de tipo byte
        }
    }

    public void bajarVolumen(){
        if (this.volumen > 0){
            this.volumen--;
        }
    }

    public void encender(){
        this.encendido = true;
    }

    public void apagar(){
        this.encendido = false;
    }

    public void cambiarCanal(int nuevoCanal){
        if (this.canalActual != nuevoCanal){
            this.canalActual = nuevoCanal;
        }
    }

    public String obtenerInfoCanal(){
        String nombreCanal = null;

        if (this.canalActual == 5){
            nombreCanal = "Teleantioquia";
        }else if (this.canalActual == 6){
            nombreCanal = "Telemedellin";
        }else if (this.canalActual == 7){
            nombreCanal = "Caracol";
        }else if (this.canalActual == 8){
            nombreCanal = "WIN";
        }else if (this.canalActual == 9){
            nombreCanal = "RCN";
        }else {
            nombreCanal = "NO IDENTIFICADO";
        }
    return nombreCanal;
    }
}
