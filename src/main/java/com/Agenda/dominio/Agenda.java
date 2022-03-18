package com.Agenda.dominio;

import java.util.*;

public class Agenda {
    private List<Contacto> contactos;

    public Agenda(){this.contactos = new ArrayList<>();}

    public void crearContacto(String nombre, String apellido, long celular){
        int g = contactos.size();
        if(g < 51){
            Contacto contactoAAgregar = new Contacto(nombre, apellido, celular);
            this.contactos.add(contactoAAgregar);
        }else{
            System.out.println("No se pudo agregar el contacto.");
        }
    }

    public void eliminarContacto(long celular){
        Contacto contactoAEliminar = this.buscarPorCelular(celular);

        if (contactoAEliminar != null) {
            this.contactos.remove(contactoAEliminar);
            System.out.println("Se eliminó el contacto " + contactoAEliminar.getNombre());
        } else {
            System.out.println("No se eliminó nada. Porque el contacto " + contactoAEliminar.getNombre() + " no existe.");
        }
    }

    public Contacto buscarPorNombre(String nombre){
        Contacto contactoBuscado = (Contacto) this.contactos.stream()
                .filter(contacto -> Objects.equals(contacto.getNombre(), nombre))
                .findFirst().orElse(null);
        return contactoBuscado;
    }

    public Contacto buscarPorApellido(String apellido){
        Contacto contactoBuscado = (Contacto) this.contactos.stream()
                .filter(contacto -> Objects.equals(contacto.getApellido(), apellido))
                .findFirst().orElse(null);
        return contactoBuscado;
    }

    public Contacto buscarPorCelular(long celular){
        Contacto contactoBuscado = this.contactos.stream()
                .filter(contacto -> contacto.getCelular() == celular)
                .findFirst().orElse(null);
        return contactoBuscado;
    }

    public void editarCelular(long viejoCelular, long nuevoCelular){
        Contacto c = buscarPorCelular(viejoCelular);

        if(c != null) {
            int posicionAReemplazar = this.contactos.indexOf(c);
            c.setCelular(nuevoCelular);
            this.contactos.set(posicionAReemplazar, c);
            System.out.printf("El contacto se ha editado.");
        } else {
            System.out.println("El contacto a editar no existe.");
        }
    }

    public void ordenarPorOrdenAlfabetico(){
        this.contactos.sort(Comparator.comparing(Contacto::getNombre).thenComparing(Contacto::getApellido));
        this.imprimirAgenda();
    }

    private void imprimirAgenda() {
        this.contactos.forEach(c -> System.out.println(c.getNombre() + " " + c.getApellido() + " - " + c.getCelular()));
    }
}
