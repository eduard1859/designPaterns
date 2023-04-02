package com.design.paterns.creational.abstractfactory.example1.factory;

import com.design.paterns.creational.abstractfactory.example1.product.Automovil;
import com.design.paterns.creational.abstractfactory.example1.product.AutomovilGasolina;
import com.design.paterns.creational.abstractfactory.example1.product.Scotter;
import com.design.paterns.creational.abstractfactory.example1.product.ScotterManual;

public class FabricaVehiculoGasolina implements FabricaVehiculo {

  public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
    return new AutomovilGasolina(modelo, color, potencia, espacio);
  }

  @Override
  public Scotter creaScotter(String modelo, String color, int potencia) {
    return new ScotterManual(modelo, color, potencia);
  }


}