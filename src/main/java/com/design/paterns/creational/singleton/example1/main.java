package com.design.paterns.creational.singleton.example1;

public class main {

    public static void main(String[] args) {
        Comercial comercial = Comercial.instancia();
        comercial.setNombre("Martin");
        comercial.setDireccion("Calle falsa 123");
        comercial.setEmail("xxxx@mail.com");
        visualiza();
    }

    public static void visualiza() {
        Comercial comercial = Comercial.instancia();
        comercial.visualiza();
    }
}