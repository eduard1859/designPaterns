package com.design.paterns.creational.abstractfactory.example1.factory;

import com.design.paterns.creational.abstractfactory.example1.product.Automovil;
import com.design.paterns.creational.abstractfactory.example1.product.AutomovilElectrico;
import com.design.paterns.creational.abstractfactory.example1.product.Scotter;
import com.design.paterns.creational.abstractfactory.example1.product.ScotterElectrico;

public class FabricaVehiculoElectrico implements FabricaVehiculo {

  public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
    return new AutomovilElectrico(modelo, color, potencia, espacio);
  }

  @Override
  public Scotter creaScotter(String modelo, String color, int potencia) {
    return  new ScotterElectrico(modelo, color, potencia);
  }

}