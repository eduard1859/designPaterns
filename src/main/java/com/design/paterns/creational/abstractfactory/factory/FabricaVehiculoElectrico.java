package com.design.paterns.creational.abstractfactory.factory;

import com.design.paterns.creational.abstractfactory.product.Automovil;
import com.design.paterns.creational.abstractfactory.product.AutomovilElectrico;
import com.design.paterns.creational.abstractfactory.product.Scotter;
import com.design.paterns.creational.abstractfactory.product.ScotterElectrico;

public class FabricaVehiculoElectrico implements FabricaVehiculo {

  public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
    return new AutomovilElectrico(modelo, color, potencia, espacio);
  }

  @Override
  public Scotter creaScotter(String modelo, String color, int potencia) {
    return  new ScotterElectrico(modelo, color, potencia);
  }

}