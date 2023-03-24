package com.design.paterns.creational.abstractfactory.product;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public abstract class Scotter {

  protected String modelo;
  protected String color;
  protected int potencia;

  public void mostrarCaracteristicas() {
    System.out.println("Scotter modelo: " + modelo + " de color: " + color + " de potencia: " + potencia);
  }

}