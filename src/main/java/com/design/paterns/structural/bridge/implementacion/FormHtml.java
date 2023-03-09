package com.design.paterns.structural.bridge.implementacion;

import java.util.Scanner;

public class FormHtml  implements Formulario {

    Scanner reader = new Scanner(System.in);
    @Override
    public void dibujaTexto(String texto) {
        System.out.println("HTML: " + texto);
    }

    @Override
    public String administraZonaIndicada() {
        return reader.next();
    }

}