package com.Facturas.app;

import com.Facturas.dominio.Factura;
import com.Facturas.dominio.Facturacion;

public class AppFacturacion {
    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();

        facturacion.generarFactura("Julian", 216000);
        facturacion.generarFactura("Deisy", 92000);
        facturacion.generarFactura("Angie", 120000);

        Factura masCara = facturacion.getFacturaMasCara();

        System.out.println("\nEl total es: " + facturacion.getTotalFacturacion() +
                "\n\nLa factura mas cara esta a nombre de " + masCara.getCliente() +
                " y tiene un valor de " + masCara.getValor());
    }
}
