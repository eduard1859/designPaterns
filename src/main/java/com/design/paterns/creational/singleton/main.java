package com.design.paterns.creational.singleton;

public class main {

    public static void main(String[] args) {
      // TODO Auto-generated method stub
        Comercial comercial = Comercial.instancia();
        comercial.setNombre("Martin");
        comercial.setDireccion("Calle falsa 123");
        comercial.setEmail("xxxx@mail.com");
        visualiza();
    }

    public static void visualiza() {
        // TODO Auto-generated method stub
        Comercial comercial = Comercial.instancia();
        comercial.visualiza();
    }
}