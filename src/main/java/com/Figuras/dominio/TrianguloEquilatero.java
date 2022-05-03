package com.Figuras.dominio;

public class TrianguloEquilatero extends Triangulo{
    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;

    @Override
    public double calcularArea() {
        return (this.altura * this.lado1) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }
}
