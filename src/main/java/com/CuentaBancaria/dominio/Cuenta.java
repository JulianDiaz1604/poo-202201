package com.CuentaBancaria.dominio;

import java.util.Scanner;

public class Cuenta {
    public int saldo = 500000;
    public String propietario = "Julian Diaz";
    public int tope = 7177355;
    public int numeroCuenta = 1002726725;
    public String tipoCuenta = "de Ahorros ";
    public int clave = 1234;
    public String banco = "Bancolombia";

    public void ingresar(){
        System.out.println("\n¿Cuanto dinero desea ingresar?");
        Scanner lectura = new Scanner(System.in);
        int nuevoSaldo = Integer.parseInt(lectura.next());
        if (this.saldo + nuevoSaldo > tope){
            System.out.println("No se puede ingresar " + nuevoSaldo + " porque excede el tope permitido de su cuenta");
        }else {
            this.saldo = this.saldo + nuevoSaldo;
            System.out.println("Se ha añadido " + nuevoSaldo + " a su cuenta.");
            System.out.println("Ahora el saldo en su cuenta es: " + saldo);
        }
        String salir;
        System.out.println("\nPresione cualquier tecla para continuar");
        salir = lectura.next();

    }

    public void transferir(){
        int cuentaDestinataria, saldoTransferir;
        Scanner lectura = new Scanner(System.in);
        System.out.print("\nIngrese el numero de cuenta a la que se enviara el dinero: ");
        cuentaDestinataria = Integer.parseInt(lectura.next());
        System.out.print("Ingrese el valor que desea transferir: ");
        saldoTransferir = Integer.parseInt(lectura.next());

        if (saldoTransferir <= saldo){
            System.out.println("Se ha transferido " + saldoTransferir + " a la cuenta " + cuentaDestinataria);
            saldo = saldo - saldoTransferir;
            System.out.println("Su cuenta quedo con: " + saldo);
        }else{
            System.out.println("No se ha podido transferir debido a que no cuenta con el saldo suficiente");
            System.out.println("Su saldo es: "+ saldo);
        }
        String salir;
        System.out.println("\nPresione cualquier tecla para continuar");
        salir = lectura.next();
    }

    public void retirar(){
        int saldoRetirar;
        Scanner lectura = new Scanner(System.in);
        System.out.print("\nIngrese el valor que desea retirar: ");
        saldoRetirar = Integer.parseInt(lectura.next());

        if (saldoRetirar <= saldo){
            System.out.println("Se ha retirado " + saldoRetirar);
            saldo = saldo - saldoRetirar;
            System.out.println("Su cuenta quedo con: " + saldo);
        }else{
            System.out.println("No se ha podido retirar debido a que no cuenta con el saldo suficiente");
            System.out.println("Su saldo es: "+ saldo);
        }
        String salir;
        System.out.println("\nPresione cualquier tecla para continuar");
        salir = lectura.next();
    }

    public void consultar(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("\nEsta es la información de su cuenta: \nPropietario: " + propietario + "\nNumero de Cuenta: " + numeroCuenta + "\nSaldo actual: "+ saldo + "\nClave: "+ clave + "\nTope Maximo: " + tope + "\nCuenta " + tipoCuenta + banco);
        String salir;
        System.out.println("\nPresione cualquier tecla para continuar");
        salir = lectura.next();
    }

    public void cancelar(){
        int opcion;
        Scanner lectura = new Scanner(System.in);
        System.out.println("\n¿Esta seguro de que desea cancelar su cuenta? \n1: Si \n2: No");
        opcion = Integer.parseInt(lectura.next());

        switch (opcion){
            case 1:
                System.out.println("Su cuenta entrara en proceso de cancelacion, acerquese a su oficina " + banco + " mas cercana.");
                break;
            default:
                break;
        }
        String salir;
        System.out.println("\nPresione cualquier tecla para continuar");
        salir = lectura.next();
    }

    public void bloquear(){
        int opcion;
        Scanner lectura = new Scanner(System.in);
        System.out.println("\n¿Esta seguro de que desea bloquear su cuenta? (Solo podra desbloquearla en una oficina )" + banco + "\n1: Si \n2: No");
        opcion = Integer.parseInt(lectura.next());

        switch (opcion){
            case 1:
                System.out.println("Su cuenta ha sido bloqueada, acerquese a su oficina " + banco + " mas cercana para desbloquearla.");
                break;
            default:
                break;
        }
        String salir;
        System.out.println("\nPresione cualquier tecla para continuar");
        salir = lectura.next();
    }
}
