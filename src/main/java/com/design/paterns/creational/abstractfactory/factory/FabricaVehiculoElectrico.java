package com.design.paterns.creational.abstractfactory.factory;

import com.design.paterns.creational.abstractfactory.product.Automovil;
import com.design.paterns.creational.abstractfactory.product.AutomovilElectrico;

public class FabricaVehiculoElectrico implements IFabricaVehiculo {

  public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
    return new AutomovilElectrico(modelo, color, potencia, espacio);
  }

}