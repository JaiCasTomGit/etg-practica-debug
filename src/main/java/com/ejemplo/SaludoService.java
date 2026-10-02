package com.ejemplo;

public class SaludoService {

    public String generarSaludo(String nombre, int hora) {
        String momento;
        if (hora < 12) {
            momento = "Buenos días";
        } else if (hora < 20) {
            momento = "Buenas tardes";
        } else {
            momento = "Buenas noches";
        }
        return momento + ", " + nombre + "!";
    }
}