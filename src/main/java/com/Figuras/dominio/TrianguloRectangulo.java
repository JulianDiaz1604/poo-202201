package com.Figuras.dominio;

public class TrianguloRectangulo extends Triangulo {
    private double hipotenusa;
    private double base;
    private double altura;

    public TrianguloRectangulo(double hipotenusa, double base, double altura) {
        this.hipotenusa = hipotenusa;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return base + altura + hipotenusa;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
