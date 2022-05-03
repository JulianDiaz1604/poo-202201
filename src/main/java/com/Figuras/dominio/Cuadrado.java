package com.Figuras.dominio;

public class Cuadrado extends FiguraGeometrica{
    private final int lados = 4;
    private double ladoHorizontal;
    private double ladoVertical;

    public Cuadrado(double ladoHorizontal, double ladoVertical) {
        this.ladoHorizontal = ladoHorizontal;
        this.ladoVertical = ladoVertical;
    }

    @Override
    public double calcularArea() {
        return ladoHorizontal * ladoVertical;
    }

    @Override
    public double calcularPerimetro() {
        return (ladoHorizontal * 2) + (ladoVertical * 2);
    }

    @Override
    public String toString() {
        return "cuadrado";
    }
}
