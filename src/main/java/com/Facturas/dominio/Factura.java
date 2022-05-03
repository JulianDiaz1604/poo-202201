package com.Facturas.dominio;

public abstract class Factura {
    private long valor;
    private String cliente;

    public Factura(long valor, String cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }

    public abstract long calcularTotal();

    public long getValor() {
        return valor;
    }

    public String getCliente() {
        return cliente;
    }
}
