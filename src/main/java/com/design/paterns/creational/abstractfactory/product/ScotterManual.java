package com.design.paterns.creational.abstractfactory.product;

public class ScotterManual extends Scotter{

  public ScotterManual(String modelo, String color, int potencia) {
    super(modelo, color, potencia);
  }
  public void mostrarCaracteristicas() {
    System.out.println("Scotter manual de modelo: " + modelo + " de color: " + color + " de potencia: " + potencia);
  }
}