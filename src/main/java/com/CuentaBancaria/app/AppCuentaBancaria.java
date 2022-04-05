package com.CuentaBancaria.app;

import com.CuentaBancaria.dominio.*;

import java.util.Scanner;

public class AppCuentaBancaria {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        String propietario = "Julian Diaz";
        boolean salir = false;

        while(!salir){
            Scanner lectura = new Scanner(System.in);
            System.out.println("\nHola " + propietario +"!\n¿Que desea relizar? \n\n1: Ingresar dinero a su cuenta \n2: Tranferir dinero \n3: Retirar dinero \n4: Consultar informacion de su cuenta \n5: Cancelar su cuenta \n6: Bloquear su cuenta \n7: Salir \n\nIngrese una opcion: ");
            int opcion = Integer.parseInt(lectura.next());

            switch (opcion){
                case 1: cuenta.ingresar();
                    break;
                case 2: cuenta.transferir();
                    break;
                case 3: cuenta.retirar();
                    break;
                case 4: cuenta.consultar();
                    break;
                case 5: cuenta.cancelar();
                    break;
                case 6: cuenta.bloquear();
                    break;
                case 7: salir = true;
                    break;
                default:
                    System.out.println("Solo numeros entre 1 y 7");
            }
        }


    }
}
