package com.design.paterns.creational.abstractfactory.factory;

import com.design.paterns.creational.abstractfactory.product.Automovil;
import com.design.paterns.creational.abstractfactory.product.AutomovilGasolina;

public class FabricaVehiculoGasolina implements IFabricaVehiculo {

  public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
    return new AutomovilGasolina(modelo, color, potencia, espacio);
  }

}