package com.Figuras.app;

import com.Figuras.dominio.Circulo;
import com.Figuras.dominio.Cuadrado;
import com.Figuras.dominio.FiguraGeometrica;
import com.Figuras.dominio.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class AppFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        //Triangulo triangulo = new Triangulo(5, 6, 6, 5.454 );
        Cuadrado cuadrado = new Cuadrado(8, 8);

        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(circulo);
        figuras.add(cuadrado);

        figuras.forEach(figuraGeometrica -> {
            System.out.println("El area del " + figuraGeometrica + " es: " + figuraGeometrica.calcularArea() +
                    "\nEl area del " + figuraGeometrica + " es: " + figuraGeometrica.calcularPerimetro());
        });
    }
}
