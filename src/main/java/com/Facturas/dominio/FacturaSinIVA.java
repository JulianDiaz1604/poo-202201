package com.Facturas.dominio;

public class FacturaSinIVA extends Factura{

    public FacturaSinIVA(long valor, String cliente) {
        super(valor, cliente);
    }

    @Override
    public long calcularTotal() {
        return getValor();
    }
}
