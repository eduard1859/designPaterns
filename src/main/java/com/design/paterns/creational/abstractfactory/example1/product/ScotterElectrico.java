package com.design.paterns.creational.abstractfactory.example1.product;

public class ScotterElectrico extends Scotter{

  public ScotterElectrico(String modelo, String color, int potencia) {
    super(modelo, color, potencia);
  }

  public void mostrarCaracteristicas() {
    System.out.println("Scotter electrico de modelo: " + modelo + " de color: " + color + " de potencia: " + potencia);
  }
}