package com.tv.app;

import com.tv.dominio.Televisor;

public class AppTV {
    public static void main(String[] args) {
        String nombre = "Julian";
        Televisor tv = new Televisor();

        tv.subirVolumen();

        System.out.println(tv.volumen );
    }
}
