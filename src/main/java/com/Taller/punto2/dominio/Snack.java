package com.Taller.punto2.dominio;

public class Snack {
    public String nombre;
    public String codigo;
    public short cantidad;
    public int precio;
    public boolean cant = false;

    public Snack(String nombre, String codigo, short cantidad, int precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        if(this.cantidad == 0){
            this.cant = true;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isCant() {
        return cant;
    }

    public void setCant(boolean cant) {
        this.cant = cant;
    }
}
