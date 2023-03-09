package com.design.paterns.creational.abstractfactory.product;

public class AutomovilElectrico extends Automovil{

  public AutomovilElectrico(String modelo, String color, int potencia, double espacio) {
    super(modelo, color, potencia, espacio);
  }

  public void mostrarCaracteristicas() {
    System.out.println("Automovil de electricidad de modelo: " + modelo + " de color: " + color + " de potencia: " + potencia + " de espacio: " + espacio);
  }
}