package com.design.paterns.structural.bridge.example1.implementacion;

import java.util.Scanner;

public class FormApple implements Formulario {

    Scanner reader = new Scanner(System.in);
    @Override
    public void dibujaTexto(String texto) {
        System.out.println("Apple: " + texto);
    }

    @Override
    public String administraZonaIndicada() {
        return reader.next();
    }

}