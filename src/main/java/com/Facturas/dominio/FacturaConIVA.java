package com.Facturas.dominio;

public class FacturaConIVA extends Factura{

    public FacturaConIVA(long valor, String cliente) {
        super(valor, cliente);
    }

    @Override
    public long calcularTotal() {
        return (long) (getValor() * 1.19);
    }
}
