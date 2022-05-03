package com.Figuras.dominio;

public class TrianguloIsosceles extends Triangulo {
    private double base;
    private double lado1;
    private double lado2;
    private double altura;

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return this.base + this.lado1 + this.lado2;
    }
}
