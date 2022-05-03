package com.Figuras.dominio;

public class TrianguloEscaleno extends Triangulo{
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    @Override
    public double calcularPerimetro() {
        return this.lado1 + this.lado2 + this.base;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }
}
