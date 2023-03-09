package com.design.paterns.creational.abstractfactory.product;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public abstract class Automovil {

  protected String modelo;
  protected String color;
  protected int potencia;
  protected double espacio;

  public abstract void mostrarCaracteristicas();
}