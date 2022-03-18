package com.Taller.punto1.App;

import com.Taller.punto1.dominio.Agenda;
import com.Taller.punto1.dominio.Contacto;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.crearContacto("Georgina", "Ronaldo", 3113776458l);
        agenda.crearContacto("Ana", "Bedoya", 3219000174l);
        agenda.crearContacto("Berenice", "Zuluaga", 3219316174l);
        agenda.crearContacto("Carlos", "Mattos", 3002587496l);
        agenda.crearContacto("Carlos", "Maderos", 3022587496l);
        agenda.crearContacto("Alejandro", "Ramirez", 3104698710l);
        agenda.crearContacto("Angie", "Diaz", 3216549870l);

        Contacto c = agenda.buscarPorNombre("Ana");
        if (c != null) {
            System.out.println("Contacto buscado: " + c.getNombre() + " " + c.getApellido() + " " + c.getCelular());
        } else {
            System.out.println("Contacto no encontrado");
        }

        Contacto d = agenda.buscarPorApellido("Ronaldo");
        if (d != null) {
            System.out.println("Contacto buscado: " + d.getNombre() + " " + d.getApellido() + " " + d.getCelular());
        } else {
            System.out.println("Contacto no encontrado");
        }

        Contacto e = agenda.buscarPorCelular(3104698710l);
        if (e != null) {
            System.out.println("Contacto buscado: " + e.getNombre() + " " + e.getApellido() + " " + e.getCelular());
        } else {
            System.out.println("Contacto no encontrado");
        }

        agenda.eliminarContacto(3022587496l);

        agenda.editarCelular(3219316174l, 3113218965l);

        agenda.ordenarPorOrdenAlfabetico();
    }

}
