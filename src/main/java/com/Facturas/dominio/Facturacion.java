package com.Facturas.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Facturacion {
    List<Factura> facturas = new ArrayList<>();

    public void generarFactura(String cliente, long valor){
        Factura factura = null;
        if (valor >= 100000){
            factura = new FacturaConIVA(valor, cliente);
            factura.calcularTotal();
        } else {
            factura = new FacturaSinIVA(valor, cliente);
        }
        facturas.add(factura);
    }

    public long getTotalFacturacion(){
        AtomicLong total = new AtomicLong();
        facturas.forEach(factura -> {
            total.set(total.get() + factura.getValor());
        });
        return total.get();
    }

    public Factura getFacturaMasCara(){
        int index = 0;
        long mayor = 0;
        int size = facturas.size();
        for (int i = 0; i < size; i++) {
            Factura f =  facturas.get(i);
            if (f.getValor() > mayor){
                mayor = f.getValor();
                index = i;
            }
        }
        return facturas.get(index);
    }
}
