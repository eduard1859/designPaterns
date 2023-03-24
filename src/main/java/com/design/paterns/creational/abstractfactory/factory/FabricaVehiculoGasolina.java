package com.design.paterns.creational.abstractfactory.factory;

import com.design.paterns.creational.abstractfactory.product.Automovil;
import com.design.paterns.creational.abstractfactory.product.AutomovilGasolina;
import com.design.paterns.creational.abstractfactory.product.Scotter;
import com.design.paterns.creational.abstractfactory.product.ScotterManual;

public class FabricaVehiculoGasolina implements FabricaVehiculo {

  public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
    return new AutomovilGasolina(modelo, color, potencia, espacio);
  }

  @Override
  public Scotter creaScotter(String modelo, String color, int potencia) {
    return new ScotterManual(modelo, color, potencia);
  }


}