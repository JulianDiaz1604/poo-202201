package com.Dispensador.dominio;

import java.util.*;
import java.util.stream.Collectors;

public class MaquinaDispensadora {

    List<Snack> snacks = new ArrayList<>();

    public void crearSnack(String nombre, String codigo, short cantidad, int precio){
        int espacio = snacks.size();
        if (espacio < 12){
            Snack snackAAgregar = new Snack(nombre, codigo, cantidad, precio);
            this.snacks.add(snackAAgregar);
        } else {
            System.out.println("La maquina tiene todos sus slots ocupados");
        }
    }

    public void dispensarSnackPorCodigo(String codigo, int dineroIngresado){
        Snack s = this.snacks.stream()
                .filter(snack -> Objects.equals(snack.getCodigo(), codigo))
                .findFirst().orElse(null);

        if (s != null){
            int precio = s.precio;
            short cantidad = s.cantidad;
            if(dineroIngresado >= precio && cantidad > 0){
                short cantidadActual = s.cantidad;
                cantidadActual = (short) (cantidadActual - 1);
                s.setCantidad(cantidadActual);
                if (cantidadActual == 0){
                    s.setCant(true);
                }
                System.out.println(s.getNombre() + " se dispenso correctamente");
            } else {
                System.out.println("No se pudo dispensar " + s.getNombre());
            }
        } else {
            System.out.println("No hay " + s.getNombre());
        }
    }

    public void dispensarSnackPorNombre(String nombre, int dineroIngresado){
        Snack s = this.snacks.stream()
                .filter(snack -> Objects.equals(snack.getNombre(), nombre))
                .findFirst().orElse(null);

        if (s != null){
            int precio = s.precio;
            short cantidad = s.cantidad;
            if(dineroIngresado >= precio && cantidad > 0){
                short cantidadActual = s.cantidad;
                cantidadActual = (short) (cantidadActual - 1);
                s.setCantidad(cantidadActual);
                if (cantidadActual == 0){
                    s.setCant(true);
                }
                System.out.println(s.getNombre() + " se dispenso correctamente");
            } else {
                System.out.println("No se pudo dispensar " + s.getNombre());
            }
        } else {
            System.out.println("No hay " + s.getNombre());
        }
    }

    public void agregarSnack(String nombre){
        Snack s = this.snacks.stream()
                .filter(snack -> Objects.equals(snack.getNombre(), nombre))
                .findFirst().orElse(null);

        if (s != null){
            short cantidadActual = s.cantidad;
            if (cantidadActual < 6) {
                cantidadActual = (short) (cantidadActual + 1);
                s.setCantidad(cantidadActual);
                System.out.println("Se añadio una unidad a " + s.getNombre());
            } else {
                System.out.println("El slot está lleno.");
            }
        } else {
            System.out.println("No se ha encontrado el snack");
        }
    }

    public void quitarSnack(String nombre){
        Snack s = this.snacks.stream()
                .filter(snack -> Objects.equals(snack.getNombre(), nombre))
                .findFirst().orElse(null);

        if (s != null){
            short cantidadActual = s.cantidad;
            if (cantidadActual > 0) {
                cantidadActual = (short) (cantidadActual - 1);
                s.setCantidad(cantidadActual);
                if (cantidadActual == 0){
                    s.setCant(true);
                }
                System.out.println("Se quito una unidad a " + s.getNombre());
            } else {
                System.out.println("No hay unidades de " + s.getNombre());
            }
        } else {
            System.out.println("No se ha encontrado el snack");
        }
    }

    public void obtenerCantidadDeUnidades(String nombre){
        Snack s = this.snacks.stream()
                .filter(snack -> Objects.equals(snack.getNombre(), nombre))
                .findFirst().orElse(null);

        if (s != null){
            System.out.println(s.getNombre() + " - " + s.getCantidad());
        } else {
            System.out.println("No se ha encontrado el snack");
        }
    }

    public void obtenerSnacksAgotados(){
        System.out.println("AGOTADOS");
        List<Snack> agotados = getAgotados(snacks);
        agotados.stream().forEach(snack -> {
            System.out.println(snack.getNombre());
        });
    };

    private List<Snack> getAgotados(List<Snack> snacks) {
        return snacks.stream().filter(Snack::isCant).collect(Collectors.toList());
    }

    public void obtenerTodosLosSnacks(){
        System.out.println("TODOS LOS SNACKS");
        this.snacks.forEach(snack -> System.out.println(snack.getNombre() + " - " + snack.getCantidad()));
    }

    public void ordenarPorPrecio(){
        System.out.println("ORDEN POR PRECIO DE MAYOR A MENOR");
        this.snacks.sort(Comparator.comparing(Snack::getPrecio));
        Collections.reverse(snacks);
        this.snacks.forEach(snack -> System.out.println(snack.getNombre() + " - " + snack.getPrecio()));
    }

    public void ordenarPorCantidad(){
        System.out.println("ORDEN POR CANTIDAD DE MENOR A MAYOR");
        this.snacks.sort(Comparator.comparing(Snack::getCantidad));
        this.snacks.forEach(snack -> System.out.println(snack.getNombre() + " - " + snack.getCantidad()));
    }
}
