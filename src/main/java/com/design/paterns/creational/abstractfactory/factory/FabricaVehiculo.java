package com.design.paterns.creational.abstractfactory.factory;

import com.design.paterns.creational.abstractfactory.product.Automovil;
import com.design.paterns.creational.abstractfactory.product.Scotter;

public interface FabricaVehiculo {

  Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);

  Scotter creaScotter(String modelo, String color, int potencia);


}